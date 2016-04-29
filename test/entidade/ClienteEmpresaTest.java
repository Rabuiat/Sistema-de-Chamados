/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author admin
 */
public class ClienteEmpresaTest {
    
    Empresa empresa = new Empresa(123456789, "Burger Queen");
    long cpf = 11111111;
    String nome = "Fernando Souza";
    long telefone = 998765432;
    Integer codigo = 1;
    ClienteEmpresa ce = new ClienteEmpresa(codigo, empresa, cpf, nome, telefone);
    
    public ClienteEmpresaTest() {
    }

    /**
     * Test of getCodigo method, of class ClienteEmpresa.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Integer result = ce.getCodigo();
        assertEquals(this.codigo, result);
    }

    /**
     * Test of setCodigo method, of class ClienteEmpresa.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        Integer codigo = 2;
        
        ce.setCodigo(codigo);
        assertEquals(codigo, ce.getCodigo());
    }

    /**
     * Test of getCpf method, of class ClienteEmpresa.
     */
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");

        long result = ce.getCpf();
        assertEquals(this.cpf, result);
    }

    /**
     * Test of setCpf method, of class ClienteEmpresa.
     */
    @Test
    public void testSetCpf() {
        System.out.println("setCpf");
        long cpf = 2000022222;
        
        ce.setCpf(cpf);
        assertEquals(cpf, ce.getCpf());
    }

    /**
     * Test of getEmpresa method, of class ClienteEmpresa.
     */
    @Test           
    public void testGetEmpresa() {
        System.out.println("getEmpresa");

        Empresa result = ce.getEmpresa();
        assertEquals(this.empresa, result);
    }

    @Test
    public void getNomeEmpresa() {
        System.out.println("getNomeEmpresa(não existe o método)");
        String nomeEmpresa = ce.getEmpresa().getNomeEmpresa();
        
        assertEquals(nomeEmpresa, ce.getEmpresa().getNomeEmpresa());
    }
}
