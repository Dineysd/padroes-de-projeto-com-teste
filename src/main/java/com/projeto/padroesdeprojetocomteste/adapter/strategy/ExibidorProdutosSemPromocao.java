package com.projeto.padroesdeprojetocomteste.adapter.strategy;

import java.util.ArrayList;
import java.util.List;

import com.projeto.padroesdeprojetocomteste.adapter.IProduto;

public class ExibidorProdutosSemPromocao implements StrategyExibicaoProdutos {

    @Override
    public List<String> exibirProdutos(List<IProduto> produtos) {
        List<String> listaProdutos = new ArrayList<>();
        for (IProduto produto : produtos) {
            listaProdutos.add(produto.getDescricao() + " - " + produto.getPreco());
        }
        return listaProdutos;
    }
}

