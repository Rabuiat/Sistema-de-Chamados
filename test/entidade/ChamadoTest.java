/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

import java.text.DateFormat;
import java.util.Calendar;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 *
 * @author admin
 */
public class ChamadoTest {

    Empresa instance = new Empresa(211, "Mack");
    ClienteEmpresa freddy = new ClienteEmpresa(5, instance, 1234545, "Fred", 3433232);
    Tecnico rafa = new Tecnico("Rafa", 26737779);
    Chamado chamado = new Chamado("OSX", "ajuda para Mack", 5, rafa, freddy, "Linux", "4.5", "discada", 50.4);
    Chamado rede = new Chamado(Integer.SIZE, null, null, 5, rafa, freddy, null, null, "discada", "172.16.0.10");
    Chamado desempenho = new Chamado(null, null, 2, rafa, freddy, null, null, "visita tecnica", 45.5);

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
        System.out.println("Teste getPrioridade");
        int expResult = 5;
        int result = chamado.getPrioridade();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPrioridade method, of class Chamado.
     */
    @Test
    public void testSetPrioridade() {
        System.out.println("Teste setPrioridade");
        int prioridadenova = 1;
        chamado.setPrioridade(prioridadenova);
        assertEquals(chamado.getPrioridade(), prioridadenova);
    }

    /**
     * Test of getSistemaOperacional method, of class Chamado.
     */
    @Test
    public void testGetSistemaOperacional() {
        System.out.println("Teste getSistemaOperacional");
        String expResult = "Linux";
        assertEquals(expResult, chamado.getSistemaOperacional());
    }

    /**
     * Test of setSistemaOperacional method, of class Chamado.
     */
    @Test
    public void testSetSistemaOperacional() {
        System.out.println("Teste setSistemaOperacional");
        String result = "windows";
        chamado.setSistemaOperacional(result);
        assertNotEquals(chamado.getSistemaOperacional(), "Linux");

    }

    /**
     * Test of getVersaoSO method, of class Chamado.
     */
    @Test
    public void testGetVersaoSO() {
        System.out.println("Teste getVersaoSO");
        String expResult = "4.5";
        String result = chamado.getVersaoSO();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVersaoSO method, of class Chamado.
     */
    @Test
    public void testSetVersaoSO() {
        System.out.println("Teste setVersaoSO");
        String result = "6.0";
        chamado.setVersaoSO(result);
        assertEquals(chamado.getVersaoSO(), result);
    }

    /**
     * Test of getTipoConexao method, of class Chamado.
     */
    @Test
    public void testGetTipoConexao() {
        System.out.println("Teste getTipoConexao");
        String expResult = "discada";
        String result = rede.getTipoConexao();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTipoConexao method, of class Chamado.
     */
    @Test
    public void testSetTipoConexao() {
        System.out.println("Teste setTipoConexao");
        String expResult = "banda larga";
        rede.setTipoConexao(expResult);
        assertEquals(expResult, rede.getTipoConexao());

    }

    /**
     * Test of getEnderecoRede method, of class Chamado.
     */
    @Test
    public void testGetEnderecoRede() {
        System.out.println("Teste getEnderecoRede");
        String expResult = "172.16.0.10";
        String result = rede.getEnderecoRede();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEnderecoRede method, of class Chamado.
     */
    @Test
    public void testSetEnderecoRede() {
        System.out.println("Teste setEnderecoRede");
        String enderecoRede = "10.0.1.10";
        rede.setEnderecoRede(enderecoRede);
        assertEquals(rede.getEnderecoRede(), enderecoRede);
    }

    /**
     * Test of getOperacao method, of class Chamado.
     */
    @Test
    public void testGetOperacao() {
        System.out.println("Teste getOperacao");
        String expResult = "visita tecnica";
        String result = desempenho.getOperacao();
        assertEquals(expResult, result);

    }

    /**
     * Test of setOperacao method, of class Chamado.
     */
    @Test
    public void testSetOperacao() {
        System.out.println("Teste setOperacao");
        String operacaonovo = "Troca aparelho";
        desempenho.setOperacao(operacaonovo);
        assertEquals(desempenho.getOperacao(), operacaonovo);

    }

    /**
     * Test of getDuracaoOperacao method, of class Chamado.
     */
    @Test
    public void testGetDuracaoOperacao() {
        System.out.println("Teste getDuracaoOperacao");
        double expResult = 45.5;
        double result = desempenho.getDuracaoOperacao();
        assertEquals(expResult, result, 0);

    }

    /**
     * Test of setDuracaoOperacao method, of class Chamado.
     */
    @Test
    public void testSetDuracaoOperacao() {
        System.out.println("Teste setDuracaoOperacao");
        double duracaoOperacao = 50.0;
        desempenho.setDuracaoOperacao(duracaoOperacao);
        assertEquals(desempenho.getDuracaoOperacao(), duracaoOperacao, 0);

    }

    /**
     * Test of equals method, of class Chamado.
     */
    @Test
    public void testEquals() {
        System.out.println("Teste equals");
        Calendar calendar = Calendar.getInstance();
        String data = DateFormat.getDateInstance().format(calendar.getTime());
        Chamado chamadoT = new Chamado("OSX", "ajuda para Mack", 5, rafa, freddy, "Linux", "4.5", "discada", 50.4);

        chamado.setCodigo(6);
        chamado.setData(data);
        chamadoT.setCodigo(6);
        chamadoT.setData(data);
        assertEquals(true, chamadoT.equals(chamadoT));

        chamadoT.setTitulo("MBA");
        assertEquals(false, chamado.equals(chamadoT));

    }

}
