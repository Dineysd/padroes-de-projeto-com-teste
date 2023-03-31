package com.projeto.padroesdeprojetocomteste.adapter.sistema;

import java.util.List;

import com.projeto.padroesdeprojetocomteste.adapter.IProduto;
import com.projeto.padroesdeprojetocomteste.adapter.strategy.StrategyExibicaoProdutos;

public class ExibidorProdutos {

    private final StrategyExibicaoProdutos strategy;

    public ExibidorProdutos(StrategyExibicaoProdutos strategy) {
        this.strategy = strategy;
    }

    public List<String> exibirProdutos(List<IProduto> produtos) {
        return strategy.exibirProdutos(produtos);
    }
}

