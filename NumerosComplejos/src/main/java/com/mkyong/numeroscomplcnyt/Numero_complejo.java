/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mkyong.numeroscomplcnyt;

/**
 *
 * @author estudiante
 */
public class Numero_complejo {
    Double a;
    Double b;

    /**
     *crea un numero complejo vacio
     */
    public Numero_complejo(){}
    
    /**
     *Crea un numero complejo usando a como la parte real y b como la parte imaginaria
     * @param a parte real del numero complejo
     * @param b parte imaginaria del numero complejo
     */
    public Numero_complejo(double a,double b){
        this.a=a;
        this.b=b;
    }
    
    /**
     *asigna el valor "a" a la parte real del numero complejo
     * @param a
     */
    public void setA(Double a){
        this.a=a;
    }
    
    /**
     *asigna el valor "b" a la parte imaginaria del numero complejo
     * @param b
     */
    public void setB(Double b){
        this.b=b;
    }
    
    /**
     *
     * @return devuelve la parte real del numero complejo
     */
    public Double getA(){
        return this.a;
    }
    
    /**
     *
     * @return devuelve la parte imaginaria del numero complejo
     */
    public Double getB(){
        return this.b;
    }
    
    /**
     *Suma el numero complejo con el Numero1 
     * @param Numero1 numero complejo que se va a sumar 
     * @return un numero complejo resultado de la suma de los dos numeros complejos
     */
    public Numero_complejo sumar(Numero_complejo Numero1){
        Numero_complejo result= new Numero_complejo();
        result.setA(Numero1.getA()+this.a);
        result.setB(Numero1.getB()+this.b);
        return result;
    }
    
    /**
     *Multiplica el numero complejo con el Numero1 
     * @param Numero1 numero complejo que se va a Multiplicar 
     * @return un numero complejo resultado de la Multiplicacion de los dos numeros complejos
     */
    public Numero_complejo Multiplicar(Numero_complejo Numero1){
        Numero_complejo result= new Numero_complejo();
        Double a1 = this.a;
        Double a2 = Numero1.getA();
        Double b1 = this.b;
        Double b2 = Numero1.getB();
        result.setA((a1*a2-b1*b2));
        result.setB(a1*b2+a2*b1);
        return result;
    }
    
    /**
     *Resta el numero complejo con el Numero1 
     * @param Numero1 numero complejo que se va a restar 
     * @return un numero complejo resultado de la restar de los dos numeros complejos
     */
    public Numero_complejo Restar(Numero_complejo Numero1){
        Numero_complejo result= new Numero_complejo();
        result.setA(this.a-Numero1.getA());
        result.setB(this.b-Numero1.getB());
        return result;
    }
    
    /**
     *Divivide el numero complejo entre el Numero1 
     * @param Numero1 numero complejo entre el cual se va dividir  
     * @return un numero complejo resultado de la division de los dos numeros complejos
     */
    public Numero_complejo Dividir(Numero_complejo Numero1){
        Numero_complejo result= new Numero_complejo();
        Double a1 = this.a;
        Double a2 = Numero1.getA();
        Double b1 = this.b;
        Double b2 = Numero1.getB();
        result.setA((a1*a2+b1*b2)/(b2*b2+a2*a2));
        result.setB((a2*b1-a1*b2)/(a2*a2+b2*b2));
        return result;
    }
    
    /**
     *Calcula el modulo de un numero complejo
     * @return el modulo del numero complejo
     */
    public double Modulo(){
       return Math.sqrt(this.a*this.a+this.b*this.b);
   }
   
    /**
     *halla el conjugado de un numero complejo
     * @return devuelve un numero complejo el cual es el conjugado de otro numero conjugado
     */
    public Numero_complejo Conjugado(){
       return  new Numero_complejo(this.a,-this.b);
   }
   
    /**
     *pasa un numero complejo de coordenadas cartesianas a coordenadas polares y retorna un numero complejo con esa informacion
     * haciendo la supocicion de que el numero esta en coordenadas cartecianas
     * @return devuelve un numero complejo en coordenadas polares
     */
    public Numero_complejo Cartecianas_Polares(){
       Numero_complejo result= new Numero_complejo();
       result.setA(Math.sqrt(this.a*this.a+this.b*this.b));
       result.setB(Math.atan(this.b/this.a));
       return result;
   }
   
    /**
     *pasa un numero complejo de coordenadas polares a coordenadas cartesianas y retorna un numero complejo con esa informacion
     * haciendo la supocicion de que el numero esta en coordenadas Polares
     * @return devuelve un numero complejo en coordenadas cartesianas
     */
    public Numero_complejo Polares_Cartecianas(){
       Numero_complejo result= new Numero_complejo();
       result.setA(this.a*Math.sin(this.b));
       result.setB(this.a*Math.cos(this.b));
       return result;
   }
   
    /**
     *Compara el umero complejo con otro
     * @param Numero1 numero complejo que se va a comparar
     * @return True si son iguales o False si no son iguales
     */
    public boolean equals(Numero_complejo Numero1){
       return (this.a.equals(Numero1.getA()) && this.b.equals(Numero1.getB()));
   }
}