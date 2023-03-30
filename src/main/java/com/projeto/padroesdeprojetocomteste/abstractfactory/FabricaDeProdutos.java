package com.projeto.padroesdeprojetocomteste.abstractfactory;

public interface FabricaDeProdutos {
    Produto criarProduto(String nome, double preco);
}
