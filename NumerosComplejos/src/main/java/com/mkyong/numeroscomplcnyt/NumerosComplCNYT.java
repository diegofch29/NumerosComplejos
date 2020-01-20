/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkyong.numeroscomplcnyt;

import static java.time.Clock.system;

/**
 *
 * @author estudiante
 */
public class NumerosComplCNYT {
    
    
    /**
     */
    public static void main(String[] args) {
        
    }
    
    /**
     *
     * @param a
     * @param b
     * @return
     */
    public Numero_complejo New_complex(double a,double b){
        Numero_complejo numero_complejo = new Numero_complejo(a,b);
        return numero_complejo;
    }    
    
    public Numero_complejo sumar(Numero_complejo a,Numero_complejo b){
        Numero_complejo result= new Numero_complejo();
        result=a.sumar(b);
        return result;
    }
    public Numero_complejo Multiplicar(Numero_complejo a,Numero_complejo b){
        Numero_complejo result= new Numero_complejo();
        result=a.Multiplicar(b);
        return result;
    }
    
    public Numero_complejo Restar(Numero_complejo a,Numero_complejo b){
        Numero_complejo result= new Numero_complejo();
        result=a.Restar(b);
        return result;
    }
    
    public Numero_complejo Dividir(Numero_complejo a,Numero_complejo b){
        Numero_complejo result= new Numero_complejo();
        result=a.Dividir(b);
        return result;
    }
    public double Modulo(Numero_complejo a){
        return a.Modulo();
    }
    
    public Numero_complejo Conjugado(Numero_complejo a){
       return  a.Conjugado();
   }
    
    public Numero_complejo Cartesianas_polares(Numero_complejo a){
        return a.Cartecianas_Polares();
    }
    
    public Numero_complejo polares_Cartesianas(Numero_complejo a){
        return a.Polares_Cartecianas();
    }
    
}
