package com.projeto.padroesdeprojetocomteste.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ClienteFactory {
    private Map<String, ClienteFlyweight> clientes = new HashMap<>();

    public ClienteFlyweight getCliente(String cpf, String endereco, String telefone) {
        ClienteFlyweight cliente = clientes.get(cpf);

        if (cliente == null) {
            cliente = new ClienteFlyweight(endereco, telefone);
            clientes.put(cpf, cliente);
        }

        return cliente;
    }
}
