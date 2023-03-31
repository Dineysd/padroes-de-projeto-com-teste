package com.projeto.padroesdeprojetocomteste.chain.validacao;

import com.projeto.padroesdeprojetocomteste.chain.ItemPedido;
import com.projeto.padroesdeprojetocomteste.chain.Pedido;

public class ValidadorEstoque extends ValidadorPedido {


    @Override
    protected boolean realizarValidacao(Pedido pedido) {
        // verificar se há estoque suficiente para o pedido

        if(pedido == null || pedido != null && pedido.getItens().isEmpty()) return false;
            
        for (ItemPedido item : pedido.getItens()) {
            if (!pedido.getEstoque().containsKey(item.getProduto().getNome()) || 
            pedido.getEstoque().get(item.getProduto().getNome()) < item.getQuantidade()) {
                return false;
            }
        }



        return true;
    }

}
