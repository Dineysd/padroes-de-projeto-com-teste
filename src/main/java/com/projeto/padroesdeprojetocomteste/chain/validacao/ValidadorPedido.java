package com.projeto.padroesdeprojetocomteste.chain.validacao;

import com.projeto.padroesdeprojetocomteste.chain.Pedido;

public abstract class ValidadorPedido {
    private ValidadorPedido proximoValidador;

    public void setProximoValidador(ValidadorPedido proximoValidador) {
        this.proximoValidador = proximoValidador;
    }

    public boolean validar(Pedido pedido) {
        if (realizarValidacao(pedido)) {
            if (proximoValidador != null) {
                return proximoValidador.validar(pedido);
            }
            return true;
        }
        return false;
    }

    protected abstract boolean realizarValidacao(Pedido pedido);
}
