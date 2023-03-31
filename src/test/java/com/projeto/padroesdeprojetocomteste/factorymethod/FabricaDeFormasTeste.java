package com.projeto.padroesdeprojetocomteste.factorymethod;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.projeto.padroesdeprojetocomteste.factorymethod.fabrica.FabicaDeFormaDeCirculos;
import com.projeto.padroesdeprojetocomteste.factorymethod.fabrica.FabricaDeFormaDeQuadrados;
import com.projeto.padroesdeprojetocomteste.factorymethod.fabrica.FabricaDeFormaDeRetangulos;
import com.projeto.padroesdeprojetocomteste.factorymethod.fabrica.FabricaDeFormas;
import com.projeto.padroesdeprojetocomteste.factorymethod.forma.Forma;

public class FabricaDeFormasTeste {
    @Test
    public void testeCriarRetangulo(){
        FabricaDeFormas fabrica = new FabricaDeFormaDeRetangulos();
        Forma retangulo = fabrica.criarForma();
        assertEquals("Retangulo", retangulo.geNome());
        assertEquals(6.0, retangulo.getArea(), 0.01);
    }

    @Test
    public void testeCriarQuadrado(){
        FabricaDeFormas fabrica = new FabricaDeFormaDeQuadrados();
        Forma quadrado = fabrica.criarForma();
        assertEquals("Quadrado", quadrado.geNome());
        assertEquals(4.0, quadrado.getArea(), 0.01);
    }
    @Test
    public void testeCriarCirculo(){
        FabricaDeFormas fabrica = new FabicaDeFormaDeCirculos();
        Forma circulo = fabrica.criarForma();
        assertEquals("Circulo", circulo.geNome());
        assertEquals(Math.PI, circulo.getArea(), 0.01);
    }
    
}
