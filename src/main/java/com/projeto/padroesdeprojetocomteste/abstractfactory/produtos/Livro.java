package com.projeto.padroesdeprojetocomteste.abstractfactory.produtos;

public class Livro extends Produto {

    private String autor;

    public Livro(String nome, double preco, String autor) {
        super(nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

}
