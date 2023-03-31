package com.projeto.padroesdeprojetocomteste.factorymethod.forma;

public class Retangulo extends Forma{
    private double base;
    private double altura;

    public Retangulo(){
        this.base = 2.0;
        this.altura = 3.0;
    }

    @Override
    public String geNome() {
        return "Retangulo";
    }

    @Override
    public double getArea() {
        return base * altura;
    }
    


}
