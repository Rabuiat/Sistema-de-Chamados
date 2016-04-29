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
public class ChamadoTest {
    Empresa instance = new Empresa(211,"Mack");
    ClienteEmpresa fred = new ClienteEmpresa(5, instance, 1234545, "Fred", 3433232);
    Tecnico rafa = new Tecnico("Rafa", 26737779);
    Chamado chamado = new Chamado("OSX", "ajuda para Mack", 5, rafa, fred, "Linux", "4.5","quebrado", 50.4);
    
    public ChamadoTest() {
    }

    /**
     * Test of getTecnico method, of class Chamado.
     */
    @Test
    public void testGetTecnico() {
        System.out.println("Teste getTecnico");
        Chamado instance = null;
        Tecnico expResult = null;
        Tecnico result = instance.getTecnico();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCodigo method, of class Chamado.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Chamado instance = null;
        int expResult = 0;
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Chamado.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        Chamado instance = null;
        instance.setCodigo(codigo);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTecnico method, of class Chamado.
     */
    @Test
    public void testSetTecnico() {
        System.out.println("setTecnico");
        Tecnico tecnico = null;
        Chamado instance = null;
        instance.setTecnico(tecnico);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCliente method, of class Chamado.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        Chamado instance = null;
        ClienteEmpresa expResult = null;
        ClienteEmpresa result = instance.getCliente();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCliente method, of class Chamado.
     */
    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        ClienteEmpresa cliente = null;
        Chamado instance = null;
        instance.setCliente(cliente);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStatus method, of class Chamado.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getStatus();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStatus method, of class Chamado.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "";
        Chamado instance = null;
        instance.setStatus(status);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoProblema method, of class Chamado.
     */
    @Test
    public void testGetTipoProblema() {
        System.out.println("getTipoProblema");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getTipoProblema();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoProblema method, of class Chamado.
     */
    @Test
    public void testSetTipoProblema() {
        System.out.println("setTipoProblema");
        String tipoProblema = "";
        Chamado instance = null;
        instance.setTipoProblema(tipoProblema);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class Chamado.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getData();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class Chamado.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        String data = "";
        Chamado instance = null;
        instance.setData(data);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHora method, of class Chamado.
     */
    @Test
    public void testGetHora() {
        System.out.println("getHora");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getHora();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHora method, of class Chamado.
     */
    @Test
    public void testSetHora() {
        System.out.println("setHora");
        String hora = "";
        Chamado instance = null;
        instance.setHora(hora);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitulo method, of class Chamado.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitulo method, of class Chamado.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Chamado instance = null;
        instance.setTitulo(titulo);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDescricao method, of class Chamado.
     */
    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDescricao method, of class Chamado.
     */
    @Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        String descricao = "";
        Chamado instance = null;
        instance.setDescricao(descricao);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrioridade method, of class Chamado.
     */
    @Test
    public void testGetPrioridade() {
        System.out.println("getPrioridade");
        Chamado instance = null;
        int expResult = 0;
        int result = instance.getPrioridade();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrioridade method, of class Chamado.
     */
    @Test
    public void testSetPrioridade() {
        System.out.println("setPrioridade");
        int prioridade = 0;
        Chamado instance = null;
        instance.setPrioridade(prioridade);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSistemaOperacional method, of class Chamado.
     */
    @Test
    public void testGetSistemaOperacional() {
        System.out.println("getSistemaOperacional");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getSistemaOperacional();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSistemaOperacional method, of class Chamado.
     */
    @Test
    public void testSetSistemaOperacional() {
        System.out.println("setSistemaOperacional");
        String sistemaOperacional = "";
        Chamado instance = null;
        instance.setSistemaOperacional(sistemaOperacional);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVersaoSO method, of class Chamado.
     */
    @Test
    public void testGetVersaoSO() {
        System.out.println("getVersaoSO");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getVersaoSO();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVersaoSO method, of class Chamado.
     */
    @Test
    public void testSetVersaoSO() {
        System.out.println("setVersaoSO");
        String versaoSO = "";
        Chamado instance = null;
        instance.setVersaoSO(versaoSO);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBancoDeDados method, of class Chamado.
     */
    @Test
    public void testGetBancoDeDados() {
        System.out.println("getBancoDeDados");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getBancoDeDados();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBancoDeDados method, of class Chamado.
     */
    @Test
    public void testSetBancoDeDados() {
        System.out.println("setBancoDeDados");
        String bancoDeDados = "";
        Chamado instance = null;
        instance.setBancoDeDados(bancoDeDados);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCausaProblema method, of class Chamado.
     */
    @Test
    public void testGetCausaProblema() {
        System.out.println("getCausaProblema");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getCausaProblema();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCausaProblema method, of class Chamado.
     */
    @Test
    public void testSetCausaProblema() {
        System.out.println("setCausaProblema");
        String causaProblema = "";
        Chamado instance = null;
        instance.setCausaProblema(causaProblema);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSolucaoProblema method, of class Chamado.
     */
    @Test
    public void testGetSolucaoProblema() {
        System.out.println("getSolucaoProblema");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getSolucaoProblema();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSolucaoProblema method, of class Chamado.
     */
    @Test
    public void testSetSolucaoProblema() {
        System.out.println("setSolucaoProblema");
        String solucaoProblema = "";
        Chamado instance = null;
        instance.setSolucaoProblema(solucaoProblema);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoConexao method, of class Chamado.
     */
    @Test
    public void testGetTipoConexao() {
        System.out.println("getTipoConexao");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getTipoConexao();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoConexao method, of class Chamado.
     */
    @Test
    public void testSetTipoConexao() {
        System.out.println("setTipoConexao");
        String tipoConexao = "";
        Chamado instance = null;
        instance.setTipoConexao(tipoConexao);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnderecoRede method, of class Chamado.
     */
    @Test
    public void testGetEnderecoRede() {
        System.out.println("getEnderecoRede");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getEnderecoRede();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnderecoRede method, of class Chamado.
     */
    @Test
    public void testSetEnderecoRede() {
        System.out.println("setEnderecoRede");
        String enderecoRede = "";
        Chamado instance = null;
        instance.setEnderecoRede(enderecoRede);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOperacao method, of class Chamado.
     */
    @Test
    public void testGetOperacao() {
        System.out.println("getOperacao");
        Chamado instance = null;
        String expResult = "";
        String result = instance.getOperacao();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperacao method, of class Chamado.
     */
    @Test
    public void testSetOperacao() {
        System.out.println("setOperacao");
        String operacao = "";
        Chamado instance = null;
        instance.setOperacao(operacao);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDuracaoOperacao method, of class Chamado.
     */
    @Test
    public void testGetDuracaoOperacao() {
        System.out.println("getDuracaoOperacao");
        Chamado instance = null;
        double expResult = 0.0;
        double result = instance.getDuracaoOperacao();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDuracaoOperacao method, of class Chamado.
     */
    @Test
    public void testSetDuracaoOperacao() {
        System.out.println("setDuracaoOperacao");
        double duracaoOperacao = 0.0;
        Chamado instance = null;
        instance.setDuracaoOperacao(duracaoOperacao);
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Chamado.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object c = null;
        Chamado instance = null;
        boolean expResult = false;
        boolean result = instance.equals(c);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
