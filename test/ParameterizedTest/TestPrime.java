/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParameterizedTest;

import Helpers.PrimeNumbers;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Emiliano
 */
@RunWith(Parameterized.class)
public class TestPrime {
    
   private Integer num;
   private Boolean expected;
   private PrimeNumbers clase;
   
   @Before
   public void before()
   {
       clase = new PrimeNumbers();
   }
   
   public TestPrime(Integer num, Boolean expected)
   {
       this.num = num;
       this.expected = expected;
   }
   
   @Parameters
   public static Collection primeNumbers2Test()
   {
       return Arrays.asList(new Object[][]{
       
       {-3, true},
       {0, true},
       {5, false},
       {7, true},
       {9, false}
       
    });
   }
 
@Test
public void testPrimeNumbers()
{
    System.out.println("el numero probado es:" + num);
    assertEquals("Error en el numero " + num, expected, clase.isPrime(num));
}

}
