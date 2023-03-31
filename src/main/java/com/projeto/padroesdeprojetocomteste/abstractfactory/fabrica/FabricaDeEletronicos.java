package com.projeto.padroesdeprojetocomteste.abstractfactory.fabrica;

import com.projeto.padroesdeprojetocomteste.abstractfactory.produtos.Eletronico;
import com.projeto.padroesdeprojetocomteste.abstractfactory.produtos.Produto;

public class FabricaDeEletronicos implements FabricaDeProdutos {

    @Override
    public Produto criarProduto(String nome, double preco) {
        return new Eletronico(nome, preco, "Sonic");
    }

}
