package com.projeto.padroesdeprojetocomteste.abstractfactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TesteVendaProdutos {
    @Test
    public void testeVendaDeLivros(){
        FabricaDeProdutos fabrica = new FabricaDeLivros();
        Loja loja = new Loja(fabrica);

        Produto produto = loja.venderProduto("O Bruxo", 59.90);

        assertTrue(produto instanceof Livro);
        assertEquals("O Bruxo", produto.getNome());
        assertEquals(59.90, produto.getPreco(), 0.01);
        assertEquals("Andrzej Sapkowski", ((Livro)produto).getAutor());
    }

    @Test
    public void testeVendaDeMoveis(){
        FabricaDeProdutos fabrica = new FabricaDeMoveisPlanejado();
        Loja loja = new Loja(fabrica);
        
        Produto produto = loja.venderProduto("Guarda Roupa", 5000.00);

        assertTrue(produto instanceof MovelPlanejado);
        assertEquals("Guarda Roupa", produto.getNome());
        assertEquals(5000.00, produto.getPreco(), 0.01);
        assertEquals("Bautieri Planejados", ((MovelPlanejado)produto).getMarca());
    }

    @Test
    public void testeVendaEletronicos(){
        FabricaDeProdutos fabrica = new FabricaDeEletronicos();
        Loja loja = new Loja(fabrica);

        Produto produto = loja.venderProduto("Playstation 5", 4950.00);

        assertTrue(produto instanceof Eletronico);
        assertEquals("Playstation 5", produto.getNome());
        assertEquals(4950.00, produto.getPreco(), 0.01);
        assertEquals("Sonic", ((Eletronico)produto).getMarca());
    }
    
}
