/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clueguess;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author kevin
 */
public class BackT extends Thread{
    public ArrayList<Carta> Sospechosos;
    public ArrayList<Carta> Armas;
    public ArrayList<Carta> Motivos;
    public ArrayList<Carta> PCuerpo;
    public ArrayList<Carta> Lugares;
    int combinaciones [][][][][] = new int [7][8][6][6][9];
    public ArrayList<Carta> Descartadas = new ArrayList<Carta>();
    private ArrayList<javax.swing.JLabel> Displays;
    Combinacion propuesta;
    Combinacion Solucion;
    ArrayList<Combinacion> Restrictions;


    public BackT(ArrayList<Carta> Sospechosos, ArrayList<Carta> Armas, ArrayList<Carta> Motivos, ArrayList<Carta> PCuerpo, ArrayList<Carta> Lugares, ArrayList<javax.swing.JLabel> Displays, Combinacion propuesta, Combinacion Solucion, int Res ) {
        this.Sospechosos = Sospechosos;
        this.Armas = Armas;
        this.Motivos = Motivos;
        this.PCuerpo = PCuerpo;
        this.Lugares = Lugares;
        this.Displays = Displays;
        this.propuesta = propuesta;
        this.Solucion=Solucion;
        this.Restrictions = this.generateRestrictions(Res, Solucion);
    }
    @Override
    public void run(){
        
//        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
        long btS = System.currentTimeMillis();
        this.excecute(this.propuesta, this.Solucion, 0,0,0,0,0, this.Restrictions);
        long btF = System.currentTimeMillis();
        
        System.out.println("BackTracking con "+Restrictions.size()+" restricciones: ");
        System.out.println("Tiempo: "+(btF - btS)+"\n");
        
        interrupt();
    }
    public boolean excecute(Combinacion propuesta, Combinacion Solucion, int i, int j, int k, int l, int m, ArrayList<Combinacion> Restrictions){
        
//        System.out.println(i+" "+j+" "+k+" "+l+" "+m);
        if(!Descartadas.contains(Sospechosos.get(i)) && !Descartadas.contains(Armas.get(j)) && !Descartadas.contains(Motivos.get(k)) && !Descartadas.contains(PCuerpo.get(l)) && !Descartadas.contains(Lugares.get(m))){
            propuesta.setSospechoso(Sospechosos.get(i));
            propuesta.setArma(Armas.get(j));
            propuesta.setMotivo(Motivos.get(k));
            propuesta.setParte(PCuerpo.get(l));
            propuesta.setLugar(Lugares.get(m));
            if(this.verifyRestrictions(propuesta, Restrictions, 0)){
                Carta incorrecta = Solucion.verificar(propuesta, this.Displays);
                if(incorrecta == null){
                    return true;
                }
                else{
                    if(!Descartadas.contains(incorrecta)){
                        Descartadas.add(incorrecta);
                    }
                }
            }
        }
        

        if(i<6 && this.combinaciones [i+1][j][k][l][m] != 1 && excecute(propuesta, Solucion, i+1, j, k, l, m, Restrictions)){
            return true;
        }
        if(j<7 && this.combinaciones [i][j+1][k][l][m] != 1 && excecute(propuesta, Solucion, i, j+1, k, l, m, Restrictions)){
            return true;
        }
        if(k<5 && this.combinaciones [i][j][k+1][l][m] != 1 && excecute(propuesta, Solucion, i, j, k+1, l, m, Restrictions)){
            return true;
        }
        if(l<5 && this.combinaciones [i][j][k][l+1][m] != 1 && excecute(propuesta, Solucion, i, j, k, l+1, m, Restrictions)){
            return true;
        }
        if(m<8 && this.combinaciones [i][j][k][l][m+1] != 1 && excecute(propuesta, Solucion, i, j, k, l, m+1, Restrictions)){
            return true;
        }
        this.combinaciones [i][j][k][l][m] = 1;
        return false;
        
        
    }
    
    public ArrayList<Combinacion> generateRestrictions(int i, Combinacion solucion){
        Combinacion c;
        ArrayList<Combinacion> Restrictions = new ArrayList<Combinacion>();
        while(i>0){
            c = new Combinacion(null,null,null,null,null);
            int p = (new Random()).nextInt(5);
            int s = (new Random()).nextInt(5);
            Carta P = null;
            Carta S = null;
            switch (p) {
                case 0:
                    P = Sospechosos.get((new Random()).nextInt(7));
                    if(solucion.Sospechoso != P){
                        c.Sospechoso = P;
                    }
                    else{
                        P = null;
                    }
                    break;
                case 1:
                    P = Armas.get((new Random()).nextInt(8));
                    if(solucion.Arma != P){
                        c.Arma = P;
                    }
                    else{
                        P = null;
                    }
                    break;
                case 2:
                    P = Motivos.get((new Random()).nextInt(6));
                    if(solucion.Motivo != P){
                        c.Motivo = P;
                    }
                    else{
                        P = null;
                    }
                    break;
                case 3:
                    P = PCuerpo.get((new Random()).nextInt(6));
                    if(solucion.Parte != P){
                        c.Parte = P;
                    }
                    else{
                        P = null;
                    }
                    break;
                case 4:
                    P = Lugares.get((new Random()).nextInt(9));
                    if(solucion.Lugar != P){
                        c.Lugar = P;
                    }
                    else{
                        P = null;
                    }
                    break;
            }
            switch (s) {
                case 0:
                    S = Sospechosos.get((new Random()).nextInt(7));
                    c.Sospechoso = S;
                    break;
                case 1:
                    S = Armas.get((new Random()).nextInt(8));
                    c.Arma = S;
                    break;
                case 2:
                    S = Motivos.get((new Random()).nextInt(6));
                    c.Motivo = S;
                    break;
                case 3:
                    S = PCuerpo.get((new Random()).nextInt(6));
                    c.Parte = S;
                    break;
                case 4:
                    S = Lugares.get((new Random()).nextInt(9));
                    c.Lugar = S;
                    break;
            }
            if(P!=null && s!=p){
                Restrictions.add(c);
                i--;
            }
        }
        return Restrictions;
    }
    
    public boolean verifyRestrictions(Combinacion propuesta, ArrayList<Combinacion> Restrictions, int i){
        
        if(i >= Restrictions.size())
            return true;
        int c = 0;
        if(Restrictions.get(i).Sospechoso == propuesta.Sospechoso && ++c == 2){
            return false;
        }
        if(Restrictions.get(i).Arma == propuesta.Arma && ++c == 2){
            return false;
        }
        if(Restrictions.get(i).Motivo == propuesta.Motivo && ++c == 2){
            return false;
        }
        if(Restrictions.get(i).Parte == propuesta.Parte && ++c == 2){
            return false;
        }
        if(Restrictions.get(i).Lugar == propuesta.Lugar && ++c == 2){
            return false;
        }
        
        return verifyRestrictions(propuesta, Restrictions, i+1);
    }
        
    
}


//public boolean excecute(Combinacion propuesta, Combinacion Solucion, int i, int j, int k, int l, int m){
//        propuesta.setSospechoso(Sospechosos.get(i));
//        propuesta.setArma(Armas.get(j));
//        propuesta.setMotivo(Motivos.get(k));
//        propuesta.setParte(PCuerpo.get(l));
//        propuesta.setLugar(Lugares.get(m));
//        Carta incorrecta = Solucion.verificar(propuesta);
//        if(incorrecta == null){
//            return true;
//        }
//        switch (incorrecta.tipo) {
//            case SOSPECHOSO:
//                return excecute(propuesta, Solucion, i+1, j, k, l, m);
//            case ARMA:
//                return excecute(propuesta, Solucion, i, j+1, k, l, m);
//            case MOTIVO:
//                return excecute(propuesta, Solucion, i, j, k+1, l, m);
//            case CUERPO:
//                return excecute(propuesta, Solucion, i, j, k, l+1, m);
//            case LUGAR:
//                return excecute(propuesta, Solucion, i, j, k, l, m+1);
//        }
//        return false;
//    }
