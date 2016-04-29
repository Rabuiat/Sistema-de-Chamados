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
public class PessoaTest {
    
    public PessoaTest() {
    }

    /**
     * Test of getNome method, of class Pessoa.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        String nome = "Arlindo Cruz";
        long telefone = 998765432;
        Pessoa instance = new Pessoa("Arlindo Cruz", telefone);
        String result = instance.getNome();
        assertEquals(nome, result);
    }

    /**
     * Test of setNome method, of class Pessoa.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "Fausto Silva";
        long telefone = 998765432;
        Pessoa instance = new Pessoa(nome, telefone);
        instance.setNome(nome);
    }

    /**
     * Test of getTelefone method, of class Pessoa.
     */
    @Test
    public void testGetTelefone() {
        System.out.println("getTelefone");
        String nome = "Rodrigo Da Silva";
        long telefone = 998765432;
        Pessoa instance = new Pessoa(nome, telefone);
        long result = instance.getTelefone();
        assertEquals(telefone, result);
    }

    /**
     * Test of setTelefone method, of class Pessoa.
     */
    @Test
    public void testSetTelefone() {
        System.out.println("setTelefone");
        String nome = "Fausto Silva";
        long telefone = 998765432;
        Pessoa instance = new Pessoa(nome, telefone);
        
        instance.setTelefone(988887777);
        long expResult = instance.getTelefone();
        
        assertEquals(expResult, 988887777);

    }
}
