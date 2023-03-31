package com.projeto.padroesdeprojetocomteste.factorymethod.fabrica;

import com.projeto.padroesdeprojetocomteste.factorymethod.forma.Circulo;
import com.projeto.padroesdeprojetocomteste.factorymethod.forma.Forma;

public class FabicaDeFormaDeCirculos implements FabricaDeFormas {

    @Override
    public Forma criarForma() {
        return new Circulo();
    }

}
