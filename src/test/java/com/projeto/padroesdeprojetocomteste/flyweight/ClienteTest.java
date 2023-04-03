package com.projeto.padroesdeprojetocomteste.flyweight;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

public class ClienteTest {
    @Test
    public void testClienteFlyweight() {
        ClienteFactory factory = new ClienteFactory();

        ClienteFlyweight cliente1 = factory.getCliente("111.111.111-11", "Rua A, 123", "1111-1111");
        ClienteFlyweight cliente2 = factory.getCliente("111.111.111-11", "Rua B, 456", "2222-2222");

        assertSame(cliente1, cliente2);
        assertEquals("Rua A, 123", cliente1.getEndereco());
        assertEquals("1111-1111", cliente1.getTelefone());
    }

    @Test
    public void testFlyweight() {
        ClienteFactory factory = new ClienteFactory();
        ClienteFlyweight flyweight1 = factory.getCliente("111.111.111-11", "Rua A, 123", "1111-1111");
        ClienteFlyweight flyweight2 = factory.getCliente("111.111.111-11", "Rua A, 123", "1111-1111");
        ClienteFlyweight flyweight3 = factory.getCliente("234.222.222-22", "Rua B, 456", "2222-2222");

        assertSame(flyweight1, flyweight2); // deve ser o mesmo objeto
        assertNotSame(flyweight1, flyweight3); // deve ser objetos diferentes
    }
}
