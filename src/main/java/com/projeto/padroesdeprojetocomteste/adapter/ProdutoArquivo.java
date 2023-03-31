package com.projeto.padroesdeprojetocomteste.adapter;

public class ProdutoArquivo {
    private String nome;
    private double valor;
    private double percentual;

    public ProdutoArquivo(String nome, double valor, double percentual) {
        this.nome = nome;
        this.valor = valor;
        this.percentual = percentual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }
}

