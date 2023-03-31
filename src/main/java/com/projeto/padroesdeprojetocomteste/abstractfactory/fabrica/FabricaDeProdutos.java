package com.projeto.padroesdeprojetocomteste.abstractfactory.fabrica;

import com.projeto.padroesdeprojetocomteste.abstractfactory.produtos.Produto;

public interface FabricaDeProdutos {
    Produto criarProduto(String nome, double preco);
}
