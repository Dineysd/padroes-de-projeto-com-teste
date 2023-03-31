package com.projeto.padroesdeprojetocomteste.factorymethod.fabrica;

import com.projeto.padroesdeprojetocomteste.factorymethod.forma.Forma;
import com.projeto.padroesdeprojetocomteste.factorymethod.forma.Quadrado;

public class FabricaDeFormaDeQuadrados implements FabricaDeFormas {

    @Override
    public Forma criarForma() {
        return new Quadrado();
    }
    
    

}
