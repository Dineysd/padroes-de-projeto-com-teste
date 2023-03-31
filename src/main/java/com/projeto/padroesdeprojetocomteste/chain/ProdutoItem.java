package com.projeto.padroesdeprojetocomteste.chain;

public class ProdutoItem {

    private String nome;
    private double preco;

    public ProdutoItem(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public ProdutoItem(){}

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }



}
