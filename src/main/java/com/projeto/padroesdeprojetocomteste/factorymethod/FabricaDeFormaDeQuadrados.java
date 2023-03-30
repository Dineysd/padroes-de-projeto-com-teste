package com.projeto.padroesdeprojetocomteste.factorymethod;

public class FabricaDeFormaDeQuadrados implements FabricaDeFormas {

    @Override
    public Forma criarForma() {
        return new Quadrado();
    }
    
    

}
