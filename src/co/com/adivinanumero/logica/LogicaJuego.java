/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.adivinanumero.logica;

/**
 *
 * @author dainer
 */
public class LogicaJuego {
    
    private int numElegido = (int) (Math.random() * (9 - 0 + 1)) + 0;
    
    public void validarEleccion(int miNum) {
        
        if(miNum == NumeroAleatorio.getArregloN()[numElegido]) {
            System.out.println("Ganaste");
        } else {
            System.out.println("Perdiste");
        }
    }
}
