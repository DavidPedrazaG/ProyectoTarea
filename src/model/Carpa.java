/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import util.LSE;

/**
 *
 * @author david
 */
public class Carpa implements Serializable{
    
    private int numCarpa;
    private LSE<Persona> acompanantes;
    private String palabraClave;

    public Carpa(int numCarpa, LSE<Persona> acompanantes, String palabraClave) {
        this.numCarpa = numCarpa;
        this.acompanantes = acompanantes;
        this.palabraClave = palabraClave;
    }    

    public int getNumCarpa() {
        return numCarpa;
    }

    public void setNumCarpa(int numCarpa) {
        this.numCarpa = numCarpa;
    }

    public LSE<Persona> getAcompanantes() {
        return acompanantes;
    }

    public void setAcompanantes(LSE<Persona> acompanantes) {
        this.acompanantes = acompanantes;
    }

    public String getPalabraClave() {
        return palabraClave;
    }

    public void setPalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
    }
    
    
}
