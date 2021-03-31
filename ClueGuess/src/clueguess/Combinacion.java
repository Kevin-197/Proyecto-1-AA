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
public class Combinacion {
    public Carta Sospechoso;
    public Carta Arma;
    public Carta Motivo;
    public Carta Parte;
    public Carta Lugar;

    public Combinacion(Carta Sospechoso, Carta Arma, Carta Motivo, Carta Parte, Carta Lugar) {
        this.Sospechoso = Sospechoso;
        this.Arma = Arma;
        this.Motivo = Motivo;
        this.Parte = Parte;
        this.Lugar = Lugar;
    }

    public Carta getSospechoso() {
        return Sospechoso;
    }

    public void setSospechoso(Carta Sospechoso) {
        this.Sospechoso = Sospechoso;
    }

    public Carta getArma() {
        return Arma;
    }

    public void setArma(Carta Arma) {
        this.Arma = Arma;
    }

    public Carta getMotivo() {
        return Motivo;
    }

    public void setMotivo(Carta Motivo) {
        this.Motivo = Motivo;
    }

    public Carta getParte() {
        return Parte;
    }

    public void setParte(Carta Parte) {
        this.Parte = Parte;
    }

    public Carta getLugar() {
        return Lugar;
    }

    public void setLugar(Carta Lugar) {
        this.Lugar = Lugar;
    }
    
    
    
    public Carta verificar(Combinacion propuesta, ArrayList<javax.swing.JLabel> Panel){
        Panel.get(0).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sospechosos/"+propuesta.Sospechoso.Url)));
        Panel.get(1).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Armas/"+propuesta.Arma.Url)));
        Panel.get(2).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Motivos/"+propuesta.Motivo.Url)));
        Panel.get(3).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cuerpo/"+propuesta.Parte.Url)));
        Panel.get(4).setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Lugares/"+propuesta.Lugar.Url)));
        
        
        
        System.out.println(propuesta.Sospechoso.Nombre+" "+propuesta.Arma.Nombre+" "+propuesta.Parte.Nombre+" "+propuesta.Motivo.Nombre+" "+propuesta.Lugar.Nombre);
        
        
        Carta[] Incorrectas = new Carta[5];
        int index = 0;
        if(propuesta.Sospechoso != this.Sospechoso){
            Incorrectas[index] = propuesta.Sospechoso;
            index++;
        }
        if(propuesta.Arma != this.Arma){
            Incorrectas[index] = propuesta.Arma;
            index++;
        }
        if(propuesta.Motivo != this.Motivo){
            Incorrectas[index] = propuesta.Motivo;
            index++;
        }
        if(propuesta.Parte != this.Parte){
            Incorrectas[index] = propuesta.Parte;
            index++;
        }
        if(propuesta.Lugar != this.Lugar){
            Incorrectas[index] = propuesta.Lugar;
            index++;
        }
        if(index == 0){
            return null;
        }
        else{
            return Incorrectas[(new Random()).nextInt(index)];
        }
    }
    
}
