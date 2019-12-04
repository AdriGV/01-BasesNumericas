/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.japo.java.libraries;





/**
 *
 * @author CicloM
 */
public final class UtilesBasesNum {
    
  
    public static final int binToDec(String numero) {
        return Integer.parseInt(numero, 2);
    }
    
    public static final String binToHex(String numero){
        int valor = Integer.parseInt(numero, 2);
        String conversion = Integer.toHexString(valor);
        return conversion;
    }
    
    public static final String binToOct(String numero){
        int valor = Integer.parseInt(numero, 2);
        String conversion = Integer.toOctalString(valor);
        return conversion;
    }

    public static final String decToBin(String numero) {
        return Integer.toBinaryString(Integer.parseInt(numero));
    }

    public static final String hexToDec(String numero) {
        return String.valueOf(Integer.parseInt(numero, 16));
    } 
    
    public static final String hexToBin(String numero){
    return decToBin(hexToDec(numero));
    }
    
    public static final String hexToOct(String numero){
        return decToOct(hexToDec(numero));
    }

    public static final String decToHex(String numero) {
        return Integer.toHexString(Integer.parseInt(numero));
    }

    public static final int octToDec(String numero) {
        return Integer.parseInt(numero, 8);
    }
    
    public static final String octToBin(String numero) {
        return Integer.toBinaryString(octToDec(numero));
    }
    
    public static final String octToHex(String numero) {
        return Integer.toHexString(octToDec(numero));
    }

    public static final String decToOct(String numero) {
        return Integer.toOctalString(Integer.parseInt(numero));
    }
    
   
}
