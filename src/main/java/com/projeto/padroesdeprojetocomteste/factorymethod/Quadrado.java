package com.projeto.padroesdeprojetocomteste.factorymethod;

public class Quadrado extends Forma {
    private double lado;
    
    public Quadrado(){
        this.lado = 2.0;
    }

    @Override
    public String geNome() {
        return "Quadrado";
    }

    @Override
    public double getArea() {
        return lado * lado;
    }

}
