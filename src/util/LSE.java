package util;

import java.io.Serializable;

public class LSE<S> implements Serializable{
    
    Nodo<S> primero;
    int size;

    public LSE() {
        this.primero = null;
        this.size = 0;
    }

    public int size(){
        return size;
    }

    public void add(S dato){
        Nodo<S> nuevo = new Nodo<>(dato);
        if(this.primero == null){
            this.primero = nuevo;
        }else{
            Nodo<S> actual = this.primero;
            while(actual.nodoSiguiente != null){
                actual = actual.nodoSiguiente;
            }
            actual.nodoSiguiente = nuevo;
        }            
        this.size++;
    }

    public S get(int index){
        if(index < 0 || index >= this.size){
            throw new ArrayIndexOutOfBoundsException("Para el indice " + index);
        }else{
            if(index == 0){
                return this.primero.dato;
            }else{
                Nodo<S> actual = this.primero;
                int contador = 0;
                while(contador < index){
                    actual = actual.nodoSiguiente;
                    contador++;
                }
                return actual.dato;
            }            
        }
    }

    public void add(S dato, int index){
        if(index < 0 || index >= this.size){
            throw new ArrayIndexOutOfBoundsException("Para el indice " + index);
        }else{
            if(index == 0){
                this.primero.dato=dato;
            }else{
                Nodo<S> actual = this.primero;
                int contador = 0;
                while(contador < index){
                    actual = actual.nodoSiguiente;
                    contador++;
                }
                actual.dato = dato;                
            }
        }                                         
    }

    public void remove(int index){
        if(index < 0 || index >= this.size){
            throw new ArrayIndexOutOfBoundsException("Para el indice " + index);
        }else{
            if(index == 0){
                this.primero = primero.nodoSiguiente;
            }else if(index == size-1){
                Nodo<S> actual = this.primero;
                int contador = 0;
                while(contador < index-1){
                    actual = actual.nodoSiguiente;
                    contador++;
                }
                actual.nodoSiguiente = null;
                
                System.out.println();
            }else{
                Nodo<S> actual = this.primero;
                int contador = 0;
                while(contador < index-1){
                    actual = actual.nodoSiguiente;
                    contador++;
                }
                actual.nodoSiguiente = actual.nodoSiguiente.nodoSiguiente;
            }
            this.size--;
        }
    }
}