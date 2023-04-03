package com.projeto.padroesdeprojetocomteste.flyweight;

public class ClienteFlyweight {
    private String endereco;
    private String telefone;

    public ClienteFlyweight(String endereco, String telefone) {
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }
}
