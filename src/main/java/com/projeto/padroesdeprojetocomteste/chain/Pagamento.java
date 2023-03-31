package com.projeto.padroesdeprojetocomteste.chain;

public class Pagamento {
    private double valor;
    private boolean realizado;
    
    public Pagamento(double valor) {
        this.valor = valor;
        this.realizado = false;
    }
    
    public double getValor() {
        return valor;
    }
    
    public boolean isRealizado() {
        return realizado;
    }
    
    public void realizar() {
        // Lógica para realizar o pagamento
        this.realizado = true;
    }

}
