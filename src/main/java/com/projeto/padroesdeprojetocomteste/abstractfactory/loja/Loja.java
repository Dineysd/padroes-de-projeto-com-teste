package com.projeto.padroesdeprojetocomteste.abstractfactory.loja;

import com.projeto.padroesdeprojetocomteste.abstractfactory.fabrica.FabricaDeProdutos;
import com.projeto.padroesdeprojetocomteste.abstractfactory.produtos.Produto;

public class Loja {
    private FabricaDeProdutos produtoDaFabrica;

    public Loja(FabricaDeProdutos produtoDaFabrica){
        this.produtoDaFabrica = produtoDaFabrica;
    }

    public Produto venderProduto(String nome, double preco){
        return produtoDaFabrica.criarProduto(nome, preco);
    }
    
}
