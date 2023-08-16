/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.adivinanumero.logica;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author dainer
 */
public class NumeroAleatorio {
   
    private static int[] arregloN;
    private static int numElegido = (int) (Math.random() * (9 - 0 + 1)) + 0;
    
    
    public static void generarNumeros(int tamaño, int min, int max) {       
        try {
            //No permite numeors repettidos
            Set<Integer> unico = new HashSet<>();
            while (unico.size() < tamaño) {
                int random = (int) (Math.random() * (max - min + 1)) + min;
                unico.add(random);
            }

            int[] arreglo = new int[tamaño];
            int x = 0;
            for (int num : unico) {
                arreglo[x++] = num;
            }
            arregloN = arreglo;
        } catch (Exception e) {
            e.getMessage();
        } 
    }
    
    public static int[] OrdenarNumeros(int[] arreglo) {
        try {
            //Ordena los numeros de menor a mayor con el metodo Burbuja
            for (int i = 0; i < arreglo.length; i++) {
                for (int j = 0; j < arreglo.length - 1; j++) {
                    int numActual = arreglo[j];
                    int numSiguiente = arreglo[j + 1];
                    if (numActual > numSiguiente) {
                        arreglo[j] = numSiguiente;
                        arreglo[j + 1] = numActual;
                    }
                }
            }  
            arregloN = arreglo;
        } catch (Exception e) {
            e.getMessage();
        }  
        return arregloN;
    }

    // --------- Metodos Get ---------
    
    /**
     * @return the arregloN
     */
    public static int[] getArregloN() {
        return arregloN;
    }

    /**
     * @return the numElegido
     */
    public static int getNumElegido() {
        return numElegido;
    }
}
