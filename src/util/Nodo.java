/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.Serializable;

/**
 *
 * @author david
 */
public class Nodo<T> implements Serializable{
    
    T dato;
    Nodo<T> nodoSiguiente;

    public Nodo(T dato) {
        this.dato = dato;
        nodoSiguiente = null;
    }
}
