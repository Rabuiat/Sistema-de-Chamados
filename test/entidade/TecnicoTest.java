/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;


/**
 *
 * @author admin
 */

public class TecnicoTest {
    
    Tecnico tecnico = new Tecnico("Ariovaldo", 988876665);
    public TecnicoTest() {
    }

    /**
     * Test of toString method, of class Tecnico.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        System.out.println(tecnico.toString());
    }
    
    @Test
    public void testComparaMetodos(){
        System.out.println("ComparaMetodos");
        assertTrue(tecnico.toString().equals(tecnico.getNome()));
            
        
    }
    
    @Test
    public void comparaNomeTecnicos() {
        System.out.println("ComparaNomeTecnicos");
        Tecnico tecnico = new Tecnico("Ariovaldo", 911123334);
        String expResult = tecnico.getNome();
        String result = this.tecnico.getNome();
        assertEquals(expResult, result);
    }
    
}
