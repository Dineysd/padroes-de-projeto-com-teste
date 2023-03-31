package com.projeto.padroesdeprojetocomteste.abstractfactory;

public class FabricaDeEletronicos implements FabricaDeProdutos {

    @Override
    public Produto criarProduto(String nome, double preco) {
        return new Eletronico(nome, preco, "Sonic");
    }

}
