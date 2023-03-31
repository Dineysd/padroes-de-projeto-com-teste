package com.projeto.padroesdeprojetocomteste.chain;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.projeto.padroesdeprojetocomteste.chain.validacao.ValidadorEstoque;
import com.projeto.padroesdeprojetocomteste.chain.validacao.ValidadorIngredientes;
import com.projeto.padroesdeprojetocomteste.chain.validacao.ValidadorPagamento;
import com.projeto.padroesdeprojetocomteste.chain.validacao.ValidadorPedido;

public class ValidadorPedidoTest {
    private Pedido pedido;
    private Map<String, Integer> estoque;
    private ValidadorPedido validadorEstoque;
    private ValidadorPedido validadorPagamento;
    private ValidadorPedido validadorIngredientes;

    @BeforeEach
    public void setUp() {
        this.pedido = new Pedido();
        this.estoque = new HashMap<>();
        estoque.put("item1", 10);
        estoque.put("item2", 5);
        estoque.put("item3", 3);
        pedido.setEstoque(estoque);

        validadorEstoque = new ValidadorEstoque();
        validadorPagamento = new ValidadorPagamento();
        validadorIngredientes = new ValidadorIngredientes();

        validadorEstoque.setProximoValidador(validadorPagamento);
        validadorPagamento.setProximoValidador(validadorIngredientes);
    }

    @Test
    public void deve_retornar_true_quando_pedido_passar_nas_validacoes() {
        
        ItemPedido item1 = new ItemPedido(4);
        ProdutoItem produto = new ProdutoItem("item1", 10);
        item1.setProduto(produto);
        item1.setNome(produto.getNome());

        
        pedido.adicionarItem(item1);
        pedido.calcularValorTotal();
        pedido.getPagamento().realizar();
        
        boolean valida = validadorEstoque.validar(pedido);

        assertTrue(valida);
    }

    @Test
    public void deve_retornar_false_quando_pedido_nao_passar_na_validacao_de_ingredientes() {

        ItemPedido item1 = new ItemPedido(4);
        ProdutoItem produto = new ProdutoItem("item1", 10);
        item1.setProduto(produto);
        item1.setNome("item7");

        
        pedido.adicionarItem(item1);
        pedido.calcularValorTotal();
        pedido.getPagamento().realizar();
        
        boolean valida = validadorEstoque.validar(pedido);

        assertFalse(valida);
    }

    @Test
    public void deve_retornar_false_quando_pedido_nao_passar_na_validacao_de_estoque() {
        ItemPedido item1 = new ItemPedido(11);
        ProdutoItem produto = new ProdutoItem("item1", 10);
        item1.setProduto(produto);
        item1.setNome(produto.getNome());

        
        pedido.adicionarItem(item1);
        pedido.calcularValorTotal();
        pedido.getPagamento().realizar();
        
        boolean valida = validadorEstoque.validar(pedido);

        assertFalse(valida);
    }

    
}
