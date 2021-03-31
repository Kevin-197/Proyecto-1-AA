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
public class FBruta extends Thread{
    public ArrayList<Carta> Sospechosos = new ArrayList<Carta>();
    public ArrayList<Carta> Armas = new ArrayList<Carta>();
    public ArrayList<Carta> Motivos = new ArrayList<Carta>();
    public ArrayList<Carta> PCuerpo = new ArrayList<Carta>();
    public ArrayList<Carta> Lugares = new ArrayList<Carta>();
    private ArrayList<javax.swing.JLabel> Displays;
    Combinacion propuesta;
    Combinacion Solucion;

    public FBruta(ArrayList<Carta> Sospechosos, ArrayList<Carta> Armas, ArrayList<Carta> Motivos, ArrayList<Carta> PCuerpo, ArrayList<Carta> Lugares, ArrayList<javax.swing.JLabel> Displays, Combinacion propuesta, Combinacion Solucion) {
        this.Sospechosos = Sospechosos;
        this.Armas = Armas;
        this.Motivos = Motivos;
        this.PCuerpo = PCuerpo;
        this.Lugares = Lugares;
        this.Displays = Displays;
        this.propuesta = propuesta;
        this.Solucion=Solucion;
    }
    
    @Override
    public void run(){

        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
        this.excecute();
        interrupt();
    }
    public boolean excecute(){
        Carta incorrecta = Solucion.verificar(propuesta, this.Displays);
        for (int i = 0; i < Sospechosos.size() && incorrecta != null; i++) {
            propuesta.setSospechoso(Sospechosos.get(i));
            for (int j = 0; j < Armas.size() && incorrecta != null; j++) {
                propuesta.setArma(Armas.get(j));
                for (int k = 0; k < Motivos.size() && incorrecta != null; k++) {
                    propuesta.setMotivo(Motivos.get(k));
                    for (int l = 0; l < PCuerpo.size() && incorrecta != null; l++) {
                        propuesta.setParte(PCuerpo.get(l));
                        for (int m = 0; m < Lugares.size(); m++) {
                            propuesta.setLugar(Lugares.get(m));
                            incorrecta = Solucion.verificar(propuesta, this.Displays);
                            if(incorrecta == null){
                                break;
                            }
                        }
                    }
                }
            }
        }  
        return true;
    }
    
}
