package Assert;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Helpers.Calculadora;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Israel
 */
public class Assert {
    Calculadora c;
     @Test
     
     @Before
     public void CrearInstancias()
     {
         c=new Calculadora();
     }
   public void rest()
    {
        Calculadora b=null;
        Calculadora c = new Calculadora();
        Calculadora d=c;
        assertEquals(10, c.suma(5,5));
        assertTrue(true);
        assertFalse("no es falso", true);
        assertNull("nO ES NULO", c);
        assertNotNull(c);
        assertSame(c,d);
        
        assertNotSame(b,c);
   
}
   @Test
   public void DivisionEntreCero()
   {
       assertEquals(0, c.division(3, 0));
   }
   
   @Test
   public void multiplicaChars()
   {
       assertEquals(9606, c.multipliacacion('a', 'b'));
   }
}
