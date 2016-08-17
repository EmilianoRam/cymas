/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomRules;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;

/**
 *
 * @author Emiliano
 */
public class TestCustomRule {
    
    @Rule
    
    public TimeTestRule r = new TimeTestRule();
    
    @Test
    
    public void casodeprueba1()
    {
        for(int i = 0; i<100000; i++){} 
        assertEquals("son iguales", 5, 5);
    }
    
    @Test
    
    public void casodeprueba2()
    {
        assertNull("es nulo", null);
    }
    
    @Test
    
   public void casodeprueba3()
    {
        assertEquals("es verdad que van a reprobar", true);
    }
    
    
}
