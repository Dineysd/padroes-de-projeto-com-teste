package com.projeto.padroesdeprojetocomteste.abstractfactory;

public class FabricaDeMoveisPlanejado implements FabricaDeProdutos{

    @Override
    public Produto criarProduto(String nome, double preco) {
        return new MovelPlanejado(nome, preco, "Bautieri Planejados");
    }

}
