package com.projeto.padroesdeprojetocomteste.abstractfactory;

public class Loja {
    private FabricaDeProdutos produtoDaFabrica;

    public Loja(FabricaDeProdutos produtoDaFabrica){
        this.produtoDaFabrica = produtoDaFabrica;
    }

    public Produto venderProduto(String nome, double preco){
        return produtoDaFabrica.criarProduto(nome, preco);
    }
    
}
