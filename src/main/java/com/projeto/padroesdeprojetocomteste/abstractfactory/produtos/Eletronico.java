package com.projeto.padroesdeprojetocomteste.abstractfactory.produtos;

public class Eletronico extends Produto{
    private String marca;
    public Eletronico(String nome, double preco, String marca) {
        super(nome, preco);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }


}
