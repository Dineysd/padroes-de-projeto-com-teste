package com.projeto.padroesdeprojetocomteste.chain.validacao;

import com.projeto.padroesdeprojetocomteste.chain.Pedido;

public class ValidadorPagamento extends ValidadorPedido {
    @Override
    protected boolean realizarValidacao(Pedido pedido) {
        // verificar se o pagamento foi realizado corretamente
        if(pedido == null) return false;

        return pedido.getPagamento().isRealizado();
    }
}
