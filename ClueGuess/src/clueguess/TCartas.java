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
public class TCartas {
    public enum TipoCarta{
        SOSPECHOSO("Sospechoso"), ARMA("Arma"), MOTIVO("Motivo"), CUERPO("Parte del cuerpo"), LUGAR("Lugar");
        
        private String nombreTipo;
	
	private TipoCarta (String nombreTipo){
		this.nombreTipo = nombreTipo;
	}

	public String getNombre() {
		return nombreTipo;
	}
    }
}
