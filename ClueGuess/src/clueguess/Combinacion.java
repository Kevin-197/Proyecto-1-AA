/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clueguess;

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
    
    
    
    public Carta verificar(Combinacion propuesta){
        return null;
    }
    
}
