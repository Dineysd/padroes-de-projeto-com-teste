package com.projeto.padroesdeprojetocomteste.factorymethod.forma;

public class Circulo extends Forma {
    private double raio;

    public Circulo(){
        this.raio = 1.0;
    }

    @Override
    public String geNome() {
        return "Circulo";
    }

    @Override
    public double getArea() {
        return Math.PI * raio *raio ;
    }

}
