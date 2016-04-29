/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class RegistroChamadoTest {
    
    private static final long serialVersionUID = 10L;
    private Integer codigo = 5;
    Empresa empresa = new Empresa(211,"Mack");
    private String hora = "10:24:23";
    private String data = "29/04/2016";
    private String assunto = "Cachorro destruiu servidor";
    private Tecnico tecnico = new Tecnico("Ariovaldo", 988876665);
    private ClienteEmpresa cliente = new ClienteEmpresa(5, empresa, 1234545, "Fred", 3433232);
    private Chamado chamado = new Chamado("OSX", "ajuda para Mack", 5, tecnico, cliente, "Linux", "4.5","quebrado", 50.4);
    
    private RegistroChamado rc = new RegistroChamado(assunto, chamado, tecnico);
    
    public RegistroChamadoTest() {
    }

    /**
     * Test of getCodigo method, of class RegistroChamado.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Integer expResult = codigo;
        Integer result = chamado.getCodigo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCodigo method, of class RegistroChamado. 
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        Integer codigo = 10;
        chamado.setCodigo(codigo);
        
        Integer expResult = codigo;
        Integer result = chamado.getCodigo();
        
        assertEquals(expResult, result);
        
    }
    
    
    /**
     * Test of setChamado method, of class RegistroChamado.
     */
    @Test
    public void testTrocaChamados() {
        System.out.println("setChamado");
        Tecnico tecnicoA = new Tecnico("Leandro",991112222);
        Empresa empresaA = new Empresa(32323235, "PepsiCO");
        ClienteEmpresa clienteA = new ClienteEmpresa(15, empresaA, 1918734004, "11:30:01", 998762323);
        Chamado chamado2 = new Chamado("Windows", "Ajuda para Windows", 4, tecnicoA, clienteA, "Linux", "4.5","quebrado", 50.4);
        chamado2.setCodigo(6);
        
        
        rc.setChamado(chamado2);
                
        assertEquals(true, chamado2.equals(rc.getChamado()));
        
    }
    
// ATÉ AQUI, FEITO!
    /**
     * Test of getChamado method, of class RegistroChamado.
     */
    @Test
    public void testGetChamado() {
        System.out.println("getChamado");
        RegistroChamado instance = null;
        Chamado expResult = null;
        Chamado result = instance.getChamado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHora method, of class RegistroChamado.
     */
    @Test
    public void testGetHora() {
        System.out.println("getHora");
        RegistroChamado instance = null;
        String expResult = "";
        String result = instance.getHora();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHora method, of class RegistroChamado.
     */
    @Test
    public void testSetHora() {
        System.out.println("setHora");
        String hora = "";
        RegistroChamado instance = null;
        instance.setHora(hora);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class RegistroChamado.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        RegistroChamado instance = null;
        String expResult = "";
        String result = instance.getData();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class RegistroChamado.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        String data = "";
        RegistroChamado instance = null;
        instance.setData(data);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAssunto method, of class RegistroChamado.
     */
    @Test
    public void testGetAssunto() {
        System.out.println("getAssunto");
        RegistroChamado instance = null;
        String expResult = "";
        String result = instance.getAssunto();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAssunto method, of class RegistroChamado.
     */
    @Test
    public void testSetAssunto() {
        System.out.println("setAssunto");
        String assunto = "";
        RegistroChamado instance = null;
        instance.setAssunto(assunto);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTecnico method, of class RegistroChamado.
     */
    @Test
    public void testGetTecnico() {
        System.out.println("getTecnico");
        RegistroChamado instance = null;
        Tecnico expResult = null;
        Tecnico result = instance.getTecnico();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTecnico method, of class RegistroChamado.
     */
    @Test
    public void testSetTecnico() {
        System.out.println("setTecnico");
        Tecnico tecnico = null;
        RegistroChamado instance = null;
        instance.setTecnico(tecnico);
        fail("The test case is a prototype.");
    }
    
}
