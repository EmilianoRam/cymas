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
public class TestPerfectNatural {
    
   private Integer num;
   private Boolean expected;
   private TestPerfectNatural clase;
   
   @Before
   public void before()
   {
       clase = new PrimeNumbers();
   }
   
   public TestPerfectNatural(Integer num, Boolean expected)
   {
       this.num = num;
       this.expected = expected;
   }
   
   @Parameters
   public static Collection primeNumbers2Test()
   {
       return Arrays.asList(new Object[][]{
       
       {6, true},
       {28, true},
       {7, false},
       {61, false},
       {17, false}
       
    });
   }
 
@Test
public void testPrimeNumbers()
{
    System.out.println("el numero probado es:" + num);
    assertEquals("Error en el numero " + num, expected, clase.isNatural(num));
}

}