/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 *
 * @author 41411803
 */
public class EmpresaTest {
    
   Empresa instance = new Empresa(211,"Mack");
   
   
    public EmpresaTest() {
    }
  
    @Test
    public void testGetNumeroContrato() {
        System.out.println("Teste getNumeroContrato");
        Empresa instance = new Empresa(211,"Buiat");
        long expResult = 211;
        long result = instance.getNumeroContrato();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNumeroContrato method, of class Empresa.
//     */
    @Test
    public void testSetNumeroContrato() {
       System.out.println("Teste setNumeroContrato");
       long numeroContrato = 40;
       instance.setNumeroContrato(numeroContrato);
       assertEquals(instance.getNumeroContrato(), numeroContrato);
       

    }

    /**
     * Test of getNomeEmpresa method, of class Empresa.
     */
    @Test
    public void testGetNomeEmpresa() {
       System.out.println("Teste getNomeEmpresa");
       String expResult = "Mack";
       String result = instance.getNomeEmpresa();
       assertEquals(result, expResult);
   }

    /**
     * Test of setNomeEmpresa method, of class Empresa.
     */
    @Test
   public void testSetNomeEmpresa() {
        System.out.println("Teste setNomeEmpresa");
        String nomeEmpresa = "First Place";
        instance.setNomeEmpresa(nomeEmpresa);
        assertEquals(nomeEmpresa, instance.getNomeEmpresa());

    }

    /**
     * Test of toString method, of class Empresa.
     */
   @Test
    public void testToString() {
        System.out.println("Teste toString");
        String expResult = "211 - Mack";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
    
    @Test
    public void testEmpresaNomesIguais(){
        Empresa teste2 = new Empresa(211, "Mackenzie");
        Empresa teste = new Empresa(340, "Mack");
        assertNotEquals(teste, instance);
        assertNotEquals(teste2, instance);
    
}
    
}
