package com.projeto.padroesdeprojetocomteste.abstractfactory.fabrica;

import com.projeto.padroesdeprojetocomteste.abstractfactory.produtos.MovelPlanejado;
import com.projeto.padroesdeprojetocomteste.abstractfactory.produtos.Produto;

public class FabricaDeMoveisPlanejado implements FabricaDeProdutos{

    @Override
    public Produto criarProduto(String nome, double preco) {
        return new MovelPlanejado(nome, preco, "Bautieri Planejados");
    }

}
