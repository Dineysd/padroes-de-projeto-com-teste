package com.projeto.padroesdeprojetocomteste.factorymethod.fabrica;

import com.projeto.padroesdeprojetocomteste.factorymethod.forma.Forma;
import com.projeto.padroesdeprojetocomteste.factorymethod.forma.Retangulo;

public class FabricaDeFormaDeRetangulos implements FabricaDeFormas{

    @Override
    public Forma criarForma() {
        // TODO Auto-generated method stub
        return new Retangulo();
    }

}
