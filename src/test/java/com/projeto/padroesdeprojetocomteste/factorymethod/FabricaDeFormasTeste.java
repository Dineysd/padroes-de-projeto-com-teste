package com.projeto.padroesdeprojetocomteste.factorymethod;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FabricaDeFormasTeste {
    @Test
    public void testeCriarRetangulo(){
        FabricaDeFormas fabrica = new FabricaDeFormaDeRetangulos();
        Forma retangulo = fabrica.criarForma();
        assertEquals("Retangulo", retangulo.geNome());
        assertEquals(6.0, retangulo.getArea());
    }
    
}
