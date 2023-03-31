package com.projeto.padroesdeprojetocomteste.adapter;

public class ProdutoArquivoAdapter implements IProduto {
    private ProdutoArquivo produtoArquivo;

    public ProdutoArquivoAdapter(ProdutoArquivo produtoArquivo) {
        this.produtoArquivo = produtoArquivo;
    }

    @Override
    public String getDescricao() {
        return produtoArquivo.getNome();
    }

    @Override
    public double getPreco() {
        return produtoArquivo.getValor();
    }

    @Override
    public double getPercentual() {
        return produtoArquivo.getPercentual();
    }
}

