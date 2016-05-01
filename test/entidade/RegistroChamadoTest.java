/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 *
 * @author admin
 */
public class RegistroChamadoTest {

    private static final long serialVersionUID = 10L;
    private Integer codigo = 5;
    Empresa empresa = new Empresa(211, "Mack");
    private String hora = "10:24:23";
    private String data = "29/04/2016";
    private String assunto = "Cachorro destruiu servidor";
    private Tecnico tecnico = new Tecnico("Ariovaldo", 988876665);
    private ClienteEmpresa cliente = new ClienteEmpresa(5, empresa, 1234545, "Fred", 3433232);
    private Chamado chamado = new Chamado(codigo, "OSX", "ajuda para Mack", 5, tecnico, cliente, "Linux", "4.5", "SQL", "192.168.0.1");

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
        Integer result = rc.getCodigo();
        assertEquals(expResult, result);
        fail("Não foi criado código do RegistroDeChamado no Construtor!");
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
        Tecnico tecnicoA = new Tecnico("Leandro", 991112222);
        Empresa empresaA = new Empresa(32323235, "PepsiCO");
        ClienteEmpresa clienteA = new ClienteEmpresa(15, empresaA, 1918734004, "11:30:01", 998762323);
        Chamado chamado2 = new Chamado("Windows", "Ajuda para Windows", 4, tecnicoA, clienteA, "Linux", "4.5", "quebrado", 50.4);
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
        Chamado chamadoReport = rc.getChamado();
        assertEquals(rc.getChamado(), chamadoReport);
    }

    /**
     * Test of getHora method, of class RegistroChamado.
     */
    @Test
    public void testGetHora() {
        System.out.println("getHora");
        String horaReport = rc.getHora();
        assertEquals(rc.getHora(), horaReport);
    }

    /**
     * Test of setHora method, of class RegistroChamado.
     */
    @Test
    public void testSetHora() {
        System.out.println("setHora");
        String horaNova = "11:30:00";
        rc.setHora(horaNova);        
        assertEquals(horaNova ,rc.getHora());
    }

    /**
     * Test of getData method, of class RegistroChamado.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        String dataReport = rc.getData();
        assertEquals(rc.getData(), dataReport);
    }

    /**
     * Test of setData method, of class RegistroChamado.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        String dataNova = "01/05/2016";
        rc.setData(dataNova);        
        assertEquals(dataNova ,rc.getData());
    }

    /**
     * Test of getAssunto method, of class RegistroChamado.
     */
    @Test
    public void testGetAssunto() {
        System.out.println("getAssunto");
        String assuntoReport = rc.getAssunto();
        assertEquals(rc.getAssunto(), assuntoReport);
    }

    /**
     * Test of setAssunto method, of class RegistroChamado.
     */
    @Test
    public void testSetAssunto() {
        System.out.println("setAssunto");
        String assuntoNovo = "Cachorro destruiu tudo";
        rc.setAssunto(assuntoNovo);        
        assertEquals(assuntoNovo ,rc.getAssunto());
    }

    /**
     * Test of getTecnico method, of class RegistroChamado.
     */
    @Test
    public void testGetTecnico() {
        System.out.println("getTecnico");
        Tecnico tecnico2 = rc.getTecnico();
        assertEquals(rc.getTecnico(), tecnico2);
    }

    /**
     * Test of setTecnico method, of class RegistroChamado.
     */
    @Test
    public void testSetTecnico() {
        System.out.println("setTecnico");
        Tecnico tecnico2 = new Tecnico("Afonso Aristides", 991234567);
        rc.setTecnico(tecnico2);
        assertEquals(tecnico2 ,rc.getTecnico());
    }

}
