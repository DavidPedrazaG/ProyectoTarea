/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import model.*;
import util.LSE;

/**
 *
 * @author david
 */
public class Singleton {
    
    private static Singleton INSTANCIA = new Singleton();
    private Casilla[][] casillas;

    public Singleton() {
        this.casillas = leerCasillas();
    }
    
    //* Getters *\\
    public static Singleton getInstancia(){
        return INSTANCIA;
    }

    public Casilla[][] getCasillas() {
        return casillas;
    }    
    
    //* Leer *\\
    public Casilla[][] leerCasillas(){
        try{
            FileInputStream archivo = new FileInputStream("src/data/Casillas.dat");
            ObjectInputStream lector = new ObjectInputStream(archivo);
            return (Casilla[][]) lector.readObject();
        }catch (IOException | ClassNotFoundException e) {
            Casilla[][] aux = new Casilla[3][6];
            for (int i = 0; i < aux.length; i++) {
                for (int j = 0; j < aux[i].length; j++) {                    
                    aux[i][j] = new Casilla();
                }
            }
            return aux;
        }
    }
    
    //* Escribir *\\
    public void escribirCasillas(){
        try {
            FileOutputStream archivo = new FileOutputStream("src/data/Casillas.dat");
            ObjectOutputStream escritor = new ObjectOutputStream(archivo);
            escritor.writeObject(casillas);
        } catch (IOException e) {
        }
    }
}
