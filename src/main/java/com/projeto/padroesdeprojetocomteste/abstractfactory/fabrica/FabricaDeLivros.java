package com.projeto.padroesdeprojetocomteste.abstractfactory.fabrica;

import com.projeto.padroesdeprojetocomteste.abstractfactory.produtos.Livro;
import com.projeto.padroesdeprojetocomteste.abstractfactory.produtos.Produto;

public class FabricaDeLivros implements FabricaDeProdutos{

    @Override
    public Produto criarProduto(String nome, double preco) {
        return new Livro(nome, preco, "Andrzej Sapkowski");
    }

}
