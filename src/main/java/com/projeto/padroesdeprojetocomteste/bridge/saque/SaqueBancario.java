package com.projeto.padroesdeprojetocomteste.bridge.saque;

import com.projeto.padroesdeprojetocomteste.bridge.banco.Banco;

public abstract class SaqueBancario implements Saque {
    protected Banco banco;

    public SaqueBancario(Banco banco) {
        this.banco = banco;
    }
}
