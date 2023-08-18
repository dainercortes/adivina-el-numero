/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.adivinanumero.logica;

/**
 *
 * @author dainer
 */
public class NumeroElegidoPorElSistema {
    
    private static int num = (int) (Math.random() * (9 - 0 + 1)) + 0;
    
    /**
     * @return the numElegido
     */
    public static int getNum() {
        return num;
    }

    /**
     * @param aNum the num to set
     */
    public static void setNum(int aNum) {
        num = aNum;
    }
}
