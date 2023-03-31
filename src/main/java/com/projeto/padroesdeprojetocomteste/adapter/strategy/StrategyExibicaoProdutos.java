package com.projeto.padroesdeprojetocomteste.adapter.strategy;

import java.util.List;

import com.projeto.padroesdeprojetocomteste.adapter.IProduto;

public interface StrategyExibicaoProdutos {

    List<String> exibirProdutos(List<IProduto> produtos);

}
