/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 *
 * @author admin
 */
public class ChamadoTest {
    Empresa instance = new Empresa(211,"Mack");
    ClienteEmpresa freddy = new ClienteEmpresa(5, instance, 1234545, "Fred", 3433232);
    Tecnico rafa = new Tecnico("Rafa", 26737779);
    Chamado chamado = new Chamado("OSX", "ajuda para Mack", 5, rafa, freddy, "Linux", "4.5","quebrado", 50.4);
    
    public ChamadoTest() {
    }

    /**
     * Test of getTecnico method, of class Chamado.
     */
    @Test
    public void testGetTecnico() {
        System.out.println("Teste getTecnico");
        Tecnico expResult = chamado.getTecnico();
        assertEquals(rafa, expResult);
    }

    /**
     * Test of getCodigo method, of class Chamado.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("Teste getCodigo");
        int expResult = 5;
        assertEquals(expResult, chamado.getCodigo());
        System.out.println(chamado.getCodigo());
    }

    /**
     * Test of setCodigo method, of class Chamado.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("Teste setCodigo");
        int codigoexp = 6;
        chamado.setCodigo(6);
        int codigo = chamado.getCodigo();
        assertEquals(codigoexp, codigo);
        //
    }

    /**
     * Test of setTecnico method, of class Chamado.
     */
    @Test
    public void testSetTecnico() {
        System.out.println("Teste setTecnico");
        Tecnico fred = new Tecnico("fred", 2555353);
        chamado.setTecnico(fred);
        assertEquals(fred, chamado.getTecnico());
    }

    /**
     * Test of getCliente method, of class Chamado.
     */
    @Test
    public void testGetCliente() {
        System.out.println("Teste getCliente");
        assertEquals(freddy, chamado.getCliente());
    }

    /**
     * Test of setCliente method, of class Chamado.
     */
    @Test
    public void testSetCliente() {
        System.out.println("Teste setCliente");
        ClienteEmpresa cliente = new ClienteEmpresa(7, instance, 873736432, "Calebe", 5637525);
        chamado.setCliente(cliente);
        assertEquals(cliente, chamado.getCliente());
    }

    /**
     * Test of getStatus method, of class Chamado.
     */
    @Test
    public void testGetStatus() {
        System.out.println("Teste getStatus");
        assertEquals(chamado.getStatus(), "Iniciado");
    }

    /**
     * Test of setStatus method, of class Chamado.
     */
    @Test
    public void testSetStatus() {
        System.out.println("Teste setStatus");
        chamado.setStatus("Fechado");
        assertEquals(chamado.getStatus(), "Fechado");
    }

    /**
     * Test of getTipoProblema method, of class Chamado.
     */
    @Test
    public void testGetTipoProblema() {
        System.out.println("Teste getTipoProblema");
        assertEquals("Problema de Desempenho", chamado.getTipoProblema());
    }

    /**
     * Test of setTipoProblema method, of class Chamado.
     */
    @Test
    public void testSetTipoProblema() {
        String novoProblema = "Problema de rede";
        chamado.setTipoProblema(novoProblema);
        assertEquals(chamado.getTipoProblema(), novoProblema);
        
    }

    /**
     * Test of getData method, of class Chamado.
     */
    @Test
    public void testGetData() {
        System.out.println("Teste getData");
        Calendar calendar = Calendar.getInstance();
        String data = DateFormat.getDateInstance().format(calendar.getTime());
        assertEquals(data, chamado.getData());
        
    }


    /**
     * Test of getHora method, of class Chamado.
     */
    @Test
    public void testGetHora() {
        System.out.println("Teste getHora");
        Calendar calendar = Calendar.getInstance();
        String time = DateFormat.getTimeInstance().format(calendar.getTime());
        assertEquals(time, chamado.getHora());
    }

    /**
     * Test of getTitulo method, of class Chamado.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("Teste getTitulo");
        String expResult = "OSX";
        String result = chamado.getTitulo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTitulo method, of class Chamado.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("teste setTitulo");
        String tituloNovo = "Windows";
        chamado.setTitulo(tituloNovo);
        String expResult = chamado.getTitulo();
        assertEquals(expResult, tituloNovo);
    }

    /**
     * Test of getDescricao method, of class Chamado.
     */
    @Test
    public void testGetDescricao() {
        System.out.println("Teste getDescricao");
        String expResult = "ajuda para Mack";
        assertEquals(expResult, chamado.getDescricao());
    }

    /**
     * Test of setDescricao method, of class Chamado.
     */
    @Test
    public void testSetDescricao() {
        System.out.println("Teste setDescricao");
        String descricaoNova = "Ajuda problemas de HTTP";
        chamado.setDescricao(descricaoNova);
        assertEquals(descricaoNova, chamado.getDescricao());
    }

    /**
     * Test of getPrioridade method, of class Chamado.
     */
    @Test
    public void testGetPrioridade() {
        System.out.println("getPrioridade");
        int expResult = 5;
        int result = chamado.getPrioridade();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrioridade method, of class Chamado.
     */
    @Test
    public void testSetPrioridade() {
        System.out.println("setPrioridade");
        int prioridadenova = 1;
        chamado.setPrioridade(prioridadenova);
        assertEquals(chamado.getPrioridade(), prioridadenova);
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
