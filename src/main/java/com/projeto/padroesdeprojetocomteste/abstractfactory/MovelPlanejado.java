package com.projeto.padroesdeprojetocomteste.abstractfactory;

public class MovelPlanejado extends Produto {
    String marca;

    public MovelPlanejado(String nome, double preco, String marca) {
        super(nome, preco);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

}
