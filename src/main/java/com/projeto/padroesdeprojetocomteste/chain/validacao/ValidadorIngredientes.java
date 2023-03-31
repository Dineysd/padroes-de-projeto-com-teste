package com.projeto.padroesdeprojetocomteste.chain.validacao;

import com.projeto.padroesdeprojetocomteste.chain.ItemPedido;
import com.projeto.padroesdeprojetocomteste.chain.Pedido;

public class ValidadorIngredientes extends ValidadorPedido {
    @Override
    protected boolean realizarValidacao(Pedido pedido) {
        // verificar se os ingredientes estão disponíveis
        if(pedido == null || pedido != null && pedido.getItens().isEmpty()) return false;
            
        for (ItemPedido item : pedido.getItens()) {
            if (!pedido.getEstoque().containsKey(item.getNome())) {
                return false;
            }
        }

        return true;
    }
}
