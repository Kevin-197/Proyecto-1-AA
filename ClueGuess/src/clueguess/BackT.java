/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clueguess;

import java.util.ArrayList;

/**
 *
 * @author kevin
 */
public class BackT {
    public ArrayList<Carta> Sospechosos;
    public ArrayList<Carta> Armas;
    public ArrayList<Carta> Motivos;
    public ArrayList<Carta> PCuerpo;
    public ArrayList<Carta> Lugares;
    int combinaciones [][][][][] = new int [7][8][6][6][9];
    public ArrayList<Carta> Descartadas = new ArrayList<Carta>();

    public BackT(ArrayList<Carta> Sospechosos, ArrayList<Carta> Armas, ArrayList<Carta> Motivos, ArrayList<Carta> PCuerpo, ArrayList<Carta> Lugares) {
        this.Sospechosos = Sospechosos;
        this.Armas = Armas;
        this.Motivos = Motivos;
        this.PCuerpo = PCuerpo;
        this.Lugares = Lugares;
    }
    
    public boolean excecute(Combinacion propuesta, Combinacion Solucion, int i, int j, int k, int l, int m){
        
//        System.out.println(i+" "+j+" "+k+" "+l+" "+m);
        if(!Descartadas.contains(Sospechosos.get(i)) && !Descartadas.contains(Armas.get(j)) && !Descartadas.contains(Motivos.get(k)) && !Descartadas.contains(PCuerpo.get(l)) && !Descartadas.contains(Lugares.get(m))){
            propuesta.setSospechoso(Sospechosos.get(i));
            propuesta.setArma(Armas.get(j));
            propuesta.setMotivo(Motivos.get(k));
            propuesta.setParte(PCuerpo.get(l));
            propuesta.setLugar(Lugares.get(m));
            Carta incorrecta = Solucion.verificar(propuesta);
            if(incorrecta == null){
                return true;
            }
            else{
                if(!Descartadas.contains(incorrecta)){
                    Descartadas.add(incorrecta);
                }
            }
        }
        

        if(i<6 && this.combinaciones [i+1][j][k][l][m] != 1 && excecute(propuesta, Solucion, i+1, j, k, l, m)){
            return true;
        }
        if(j<7 && this.combinaciones [i][j+1][k][l][m] != 1 && excecute(propuesta, Solucion, i, j+1, k, l, m)){
            return true;
        }
        if(k<5 && this.combinaciones [i][j][k+1][l][m] != 1 && excecute(propuesta, Solucion, i, j, k+1, l, m)){
            return true;
        }
        if(l<5 && this.combinaciones [i][j][k][l+1][m] != 1 && excecute(propuesta, Solucion, i, j, k, l+1, m)){
            return true;
        }
        if(m<8 && this.combinaciones [i][j][k][l][m+1] != 1 && excecute(propuesta, Solucion, i, j, k, l, m+1)){
            return true;
        }
        this.combinaciones [i][j][k][l][m] = 1;
        return false;
        
        
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
