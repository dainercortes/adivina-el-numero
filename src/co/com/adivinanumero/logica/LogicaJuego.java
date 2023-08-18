package co.com.adivinanumero.logica;

import co.com.adivinanumero.diseno.MensajeGameOver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author dainer
 */
public class LogicaJuego {
    
    Jugador jg = new Jugador();
    NumeroAleatorio num = new NumeroAleatorio();
    private List<NumeroAleatorio> numeros = new ArrayList<NumeroAleatorio>();
    
  
    public void generarNumeros(int tamaño, int min, int max) {      
        try {
            //No permite numeors repetidos
            Set<Integer> unico = new HashSet<>();
            while (unico.size() < tamaño) {
                int random = (int) (Math.random() * (max - min + 1)) + min;
                unico.add(random);
            }

            List<NumeroAleatorio> listaN = unico.stream()
                    .map(num -> new NumeroAleatorio(num))
                    .collect(Collectors.toList());
                      
            numeros = listaN;
        } catch (Exception e) {
            e.getMessage();
        } 
    }
    
    public List<NumeroAleatorio> OrdenarNumeros() {
        List<NumeroAleatorio> arreglo = numeros;    
        try {
            Collections.sort(arreglo);
        } catch (Exception e) {
            e.getMessage();
        }  
        return arreglo;
    }
    
    public void numeroDelSistema() {
        int indice = (int) (Math.random() * (9 - 0 + 1)) + 0;
        
        NumeroAleatorio nm = getNumeros().get(indice);
        NumeroElegidoPorElSistema.setNum(nm.getNumero());
    }
    
    public void validarEleccion(int miNum, JLabel[] lbls, JLabel lblpuntos, JFrame frame) {
        
        System.out.println(NumeroElegidoPorElSistema.getNum());
        try {        
            if(miNum == NumeroElegidoPorElSistema.getNum()) {
                
                Jugador.puntos += 100;
                lblpuntos.setText("Puntos: " + Jugador.puntos);
                mensajePerdio(frame, "Ganaste", "Continuar");
            } else {
                jg.setVidas(jg.getVidas() + 1);     
                this.cambiarIconoVida(lbls);

                if(jg.getVidas() >= 3) {
                    mensajePerdio(frame, "Perdiste", "Jugar de nuevo");
                    Jugador.puntos = 0;
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
    
    public void mensajePerdio(JFrame frame, String mensaje, String textoBtn) {
        try {
            MensajeGameOver msj = new MensajeGameOver(frame, true);
            msj.jlbl_mensaje.setText(mensaje);
            msj.jbtn_reintentar.setText(textoBtn);
            msj.setVisible(true);
        } catch (Exception e) {
            e.getMessage();
        } 
    }

    /**
     * @return the numeros
     */
    public List<NumeroAleatorio> getNumeros() {
        return numeros;
    }
}
