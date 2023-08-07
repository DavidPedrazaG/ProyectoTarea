/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import data.Singleton;
import model.Carpa;
import model.Casilla;

/**
 *
 * @author david
 */
public class ControladorPrestarTabla {
    
    Casilla[][] casillas;
    int fila, columna;
    
    public ControladorPrestarTabla(int fila, int columna) {
        casillas = Singleton.getInstancia().getCasillas();
        this.fila = fila;
        this.columna = columna;
    }
    
    public void prestarCarpa(Carpa carpa){
        casillas[fila][columna].setCarpa(carpa);
        casillas[fila][columna].setEstado(Casilla.OCUPADO);
        Singleton.getInstancia().escribirCasillas();
    }
}
