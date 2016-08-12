/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Helpers.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Emiliano
 */
public class Asserts {
    
    @Test
   
  public void test()
   {
       Calculadora b = null;
       Calculadora c = new Calculadora();
       Calculadora d = c;
       
       assertEquals (10, c.suma (5,5));
       
       assertTrue(true);
       
       assertFalse(false);
       
       assertNull(b);
       
       assertNotNull(c);
       
       assertSame(c,d);
       
       assertNotSame(b,c);
   }
    
  public Asserts()
  {
      
  }
  
  @Test
  
  public void divisionEntreCero()
  {
      
  }
}
