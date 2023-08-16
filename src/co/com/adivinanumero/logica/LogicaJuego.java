/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.adivinanumero.logica;

import co.com.adivinanumero.diseno.MensajeGameOver;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author dainer
 */
public class LogicaJuego {
    
    Jugador jg = new Jugador();
    
  
    
    public void validarEleccion(int miNum, JLabel[] lbls, JFrame frame) {
        try {
            if(miNum != NumeroAleatorio.getArregloN()[NumeroAleatorio.getNumElegido()]) {
                jg.setVidas(jg.getVidas() + 1);
                this.cambiarIconoVida(lbls);

                if(jg.getVidas() >= 3) {
                    mensajePerdio(frame);
                }
            }
        } catch (Exception e) {
            e.getMessage();
        } 
    }
    
    public void cambiarIconoVida(JLabel[] lbls) {
        try {
            for(int i = 0; i < jg.getVidas(); i++) {      
                lbls[i].setIcon(new ImageIcon(getClass().getResource("/img/corazonVacio.png")));            
            }
        } catch (Exception e) {
            e.getMessage();
        }   
    }
    
    public void mensajePerdio(JFrame frame) {
        try {
           if(jg.getVidas() >= 3) {
                MensajeGameOver msj = new MensajeGameOver(frame, true);
                msj.setVisible(true);
            } 
        } catch (Exception e) {
            e.getMessage();
        } 
    }
}
