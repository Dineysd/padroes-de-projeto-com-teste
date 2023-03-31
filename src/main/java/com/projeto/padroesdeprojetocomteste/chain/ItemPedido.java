package com.projeto.padroesdeprojetocomteste.chain;

public class ItemPedido {

    private ProdutoItem produto;
    private int quantidade;
    private double valorItem;
    private String nome;

    public ItemPedido(int quantidade){
        this.quantidade = quantidade;
        this.produto = new ProdutoItem();
    }

    public ProdutoItem getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorItem() {
        return valorItem;
    }

    public void setProduto(ProdutoItem produto) {
        this.produto = produto;
    }

    public double calcularValor() {
        return produto.getPreco() * quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }






}
