/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.adivinanumero.logica;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author dainer
 */
public class NumeroAleatorio implements Comparable<NumeroAleatorio> {
   
    private int numero;
    
    
    
    public NumeroAleatorio(int numero)
    {
        this.numero = numero;
    }
    
    public NumeroAleatorio()
    {
        
    }

    // --------- Metodos Get ---------
    
    /**
     * @return the numero
     */
    public int getNumero() {
        return this.numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
   
    @Override
    public int compareTo(NumeroAleatorio o) {
        return Integer.compare(this.getNumero(), o.getNumero());
    }  
}
