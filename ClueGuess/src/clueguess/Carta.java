/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clueguess;

import clueguess.TCartas.TipoCarta;

/**
 *
 * @author kevin
 */
public class Carta {
    String Nombre;
    TipoCarta tipo;
    String Url;

    public Carta(String Nombre, TipoCarta tipo, String url) {
        this.Nombre = Nombre;
        this.tipo = tipo;
        this.Url = url;
    }
    
    
}
