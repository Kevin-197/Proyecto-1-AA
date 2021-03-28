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
public class FBruta {
    public ArrayList<Carta> Sospechosos = new ArrayList<Carta>();
    public ArrayList<Carta> Armas = new ArrayList<Carta>();
    public ArrayList<Carta> Motivos = new ArrayList<Carta>();
    public ArrayList<Carta> PCuerpo = new ArrayList<Carta>();
    public ArrayList<Carta> Lugares = new ArrayList<Carta>();

    public FBruta(ArrayList<Carta> Sospechosos, ArrayList<Carta> Armas, ArrayList<Carta> Motivos, ArrayList<Carta> PCuerpo, ArrayList<Carta> Lugares) {
        this.Sospechosos = Sospechosos;
        this.Armas = Armas;
        this.Motivos = Motivos;
        this.PCuerpo = PCuerpo;
        this.Lugares = Lugares;
    }
    
    public boolean excecute(Combinacion propuesta, Combinacion Solucion){
        Carta incorrecta = Solucion.verificar(propuesta);
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
                            incorrecta = Solucion.verificar(propuesta);
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
