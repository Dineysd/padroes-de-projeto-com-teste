package com.projeto.padroesdeprojetocomteste.bridge.banco;

public class BancoItau implements Banco {
    private double valor;

    @Override
    public void sacar(double valor) {
        System.out.println("Saque realizado no Banco Itau: " + valor);
        this.valor = valor;
    }

    @Override
    public String valorSacado() {
        return "Saque realizado no Banco Itau: " + valor;
    }
}
