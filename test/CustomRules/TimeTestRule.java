/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomRules;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 *
 * @author Emiliano
 */
public class TimeTestRule implements TestRule {

    @Override
    public Statement apply(Statement stmnt, Description d) {
       
        return new MyStatement(stmnt);
    }
    
}

class TimeStatement extends Statement
{
    private final Statement stmnt;
    TimeStatement(Statement stmnt)
    {
        this.stmnt = stmnt;
    }

    @Override
    public void evaluate() throws Throwable {
        long time = 0;
        try
        {
        
            System.out.println("La prueba tardo" + (System.currentTimeMillis() -time));
            stmnt.evaluate();
        }
        
        finally
        {
            System.out.println("La prueba terminó");
        }
    }
    
}
