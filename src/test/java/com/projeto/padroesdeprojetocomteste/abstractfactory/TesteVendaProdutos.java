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
    
}
