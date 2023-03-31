package com.projeto.padroesdeprojetocomteste.chain;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Pedido {

    private Pagamento pagamento;
    private List<ItemPedido> itens;
    private Map<String, Integer> estoque;
    private double valorTotal;

    public Pedido(){
        this.itens = new ArrayList<>();
    }
    public Pagamento getPagamento() {
        return pagamento;
    }
    public List<ItemPedido> getItens() {
        return itens;
    }

    public void adicionarItem(ItemPedido item) {
        this.itens.add(item);
    }

    public Map<String, Integer> getEstoque() {
        return estoque;
    }

    public void setEstoque(Map<String, Integer> estoque) {
        this.estoque = estoque;
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (ItemPedido itemPedido : itens) {
            valorTotal += itemPedido.calcularValor();
        }
        adicionarValorDoPedidoAoPagamento();
        return valorTotal;
    }

    private void adicionarValorDoPedidoAoPagamento(){
        this.pagamento = new Pagamento(this.valorTotal);
    }

    public double getValorTotal() {
        return valorTotal;
    }




    
}

