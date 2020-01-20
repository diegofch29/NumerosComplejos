package com.mkyong.Test;

import com.mkyong.numeroscomplcnyt.Numero_complejo;
import com.mkyong.numeroscomplcnyt.NumerosComplCNYT;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
/**
 * Unit test for simple App.
 */
public class NumerosComplCNYTTest {
        
    NumerosComplCNYT PR= new NumerosComplCNYT();
    
    @Before
    public void setUp() {
    }
    
    @Test
    public void Sumar(){
        Numero_complejo a = PR.New_complex(10,9);
        Numero_complejo b = PR.New_complex(12, 11);
        Numero_complejo result = PR.sumar(a, b);
        Numero_complejo NumTest = PR.New_complex(22,20);
        Assert.assertTrue(result.equals(NumTest));         
    }
    
    
    @Test
    public void Multiplicar(){
        Numero_complejo a = PR.New_complex(3,-2);
        Numero_complejo b = PR.New_complex(1, 2);
        Numero_complejo result = PR.Multiplicar(a, b);
        Numero_complejo NumTest = PR.New_complex(7,4);
        Assert.assertTrue(result.equals(NumTest)); 
    }
    
    @Test
    public void Restar(){
        Numero_complejo a = PR.New_complex(3,-2);
        Numero_complejo b = PR.New_complex(1, 2);
        Numero_complejo result = PR.Restar(a, b);
        Numero_complejo NumTest = PR.New_complex(2,-4);
        Assert.assertTrue(result.equals(NumTest)); 
    }
    
    @Test
    public void Dividir(){
        Numero_complejo a = PR.New_complex(-2,1);
        Numero_complejo b = PR.New_complex(1, 2);
        Numero_complejo result = PR.Dividir(a, b);
        Numero_complejo NumTest = PR.New_complex(0,1);
        Assert.assertTrue(result.equals(NumTest));  
    }
    
    
    @Test
    public void Modulo(){
        Numero_complejo a = PR.New_complex(1,-1);
        double result = PR.Modulo(a);
        double Num_test = Math.sqrt(2);
        Assert.assertEquals(Num_test,result,0.1);  
    }
    
    @Test
    public void Conjugado(){
        Numero_complejo a = PR.New_complex(-2,1);
        Numero_complejo result = PR.Conjugado(a);
        Numero_complejo NumTest = PR.New_complex(-2,-1);
        Assert.assertTrue(result.equals(NumTest));  
    }
    
    
    //Polares
    
    
    //Cartesianas
    
    
    
    
    @After
    public void tearDown() {
    }
}