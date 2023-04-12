package com.projeto.padroesdeprojetocomteste.bridge.saque;

import com.projeto.padroesdeprojetocomteste.bridge.banco.Banco;

public class SaqueContaCorrente extends SaqueBancario {
    public SaqueContaCorrente(Banco banco) {
        super(banco);
    }

    @Override
    public void realizarSaque(double valor) {
        banco.sacar(valor);
    }
}
