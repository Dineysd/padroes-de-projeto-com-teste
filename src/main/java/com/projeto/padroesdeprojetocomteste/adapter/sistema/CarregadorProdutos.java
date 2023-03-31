package com.projeto.padroesdeprojetocomteste.adapter.sistema;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.projeto.padroesdeprojetocomteste.adapter.IProduto;
import com.projeto.padroesdeprojetocomteste.adapter.ProdutoArquivo;
import com.projeto.padroesdeprojetocomteste.adapter.ProdutoArquivoAdapter;

public class CarregadorProdutos {
    public List<IProduto> carregarProdutos(String nomeArquivo) throws FileNotFoundException {
        List<IProduto> produtos = new ArrayList<>();
        Scanner scanner = new Scanner(new File(nomeArquivo));
        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();
            String[] partes = linha.split(",");
            String nome = partes[0];
            double valor = Double.parseDouble(partes[1]);
            double percentual = 0;
            if (partes.length == 3) {
                percentual = Double.parseDouble(partes[2]);
            }

            IProduto produto = new ProdutoArquivoAdapter(new ProdutoArquivo(nome, valor, percentual));
            produtos.add(produto);
        }
        scanner.close();
        return produtos;
    }
}

