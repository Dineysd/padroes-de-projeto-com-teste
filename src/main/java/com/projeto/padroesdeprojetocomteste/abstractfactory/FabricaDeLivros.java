package com.projeto.padroesdeprojetocomteste.abstractfactory;

public class FabricaDeLivros implements FabricaDeProdutos{

    @Override
    public Produto criarProduto(String nome, double preco) {
        return new Livro(nome, preco, "Andrzej Sapkowski");
    }

}
