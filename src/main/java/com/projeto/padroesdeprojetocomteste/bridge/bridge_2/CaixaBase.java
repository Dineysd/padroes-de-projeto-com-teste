package com.projeto.padroesdeprojetocomteste.bridge.bridge_2;

public abstract class CaixaBase {
    protected Ponte ponte;

    public CaixaBase(Ponte ponte) {
        this.ponte = ponte;
    }

    public abstract String operacao();

}
