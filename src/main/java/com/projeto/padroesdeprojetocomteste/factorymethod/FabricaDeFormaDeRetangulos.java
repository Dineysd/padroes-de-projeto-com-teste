package com.projeto.padroesdeprojetocomteste.factorymethod;

public class FabricaDeFormaDeRetangulos implements FabricaDeFormas{

    @Override
    public Forma criarForma() {
        // TODO Auto-generated method stub
        return new Retangulo();
    }

}
