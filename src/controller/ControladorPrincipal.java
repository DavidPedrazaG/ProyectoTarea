/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import data.Singleton;
import model.Casilla;

/**
 *
 * @author david
 */
public class ControladorPrincipal {

    Casilla[][] casillas;

    public ControladorPrincipal() {
        casillas = Singleton.getInstancia().getCasillas();
        
    }
    
    
    public Casilla obtenerCasilla(int fila, int columna){
        return casillas[fila][columna];
    }
    
    public String obtenerClave(int fila, int columna){
        return casillas[fila][columna].getCarpa().getPalabraClave();
    }
}
