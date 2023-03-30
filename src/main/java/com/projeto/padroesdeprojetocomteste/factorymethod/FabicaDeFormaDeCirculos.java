package com.projeto.padroesdeprojetocomteste.factorymethod;

public class FabicaDeFormaDeCirculos implements FabricaDeFormas {

    @Override
    public Forma criarForma() {
        return new Circulo();
    }

}
