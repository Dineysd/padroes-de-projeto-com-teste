package com.projeto.padroesdeprojetocomteste.bridge.saque;

import com.projeto.padroesdeprojetocomteste.bridge.banco.Banco;

public class SaqueContaPoupanca extends SaqueBancario {
    public SaqueContaPoupanca(Banco banco) {
        super(banco);
    }

    @Override
    public void realizarSaque(double valor) {
        banco.sacar(valor);
    }
}
