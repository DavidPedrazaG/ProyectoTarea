/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import data.Singleton;
import model.*;
import util.LSE;

/**
 *
 * @author david
 */
public class ControladorCarpa {
    
    Casilla[][] casillas;
    int fila, columna;

    public ControladorCarpa(int fila, int columna) {
        casillas = Singleton.getInstancia().getCasillas();
        this.fila = fila;
        this.columna = columna;
    }
    
    public void anadirAcompanante(Persona persona){
        casillas[fila][columna].getCarpa().getAcompanantes().add(persona);
        Singleton.getInstancia().escribirCasillas();
    }
    
    public int cantidadAcompanantes(){
        return casillas[fila][columna].getCarpa().getAcompanantes().size();
    }
    
    public LSE<Persona> getAcompanantes(){
        return casillas[fila][columna].getCarpa().getAcompanantes();
    }
    
    public String obtenerClave(){
        return casillas[fila][columna].getCarpa().getPalabraClave();
    }
    
    public void desocuparCarpa(){
        casillas[fila][columna] = new Casilla();
        casillas[fila][columna].setEstado(Casilla.DESOCUPADO);
        Singleton.getInstancia().escribirCasillas();
    }
}
