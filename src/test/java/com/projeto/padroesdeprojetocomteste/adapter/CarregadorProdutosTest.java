package com.projeto.padroesdeprojetocomteste.adapter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.projeto.padroesdeprojetocomteste.adapter.sistema.CarregadorProdutos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class CarregadorProdutosTest {

    @Test
    void testCarregarProdutos() throws IOException {
        // Cria um arquivo temporário com dados de exemplo
        File arquivoTemp = File.createTempFile("produtos", ".txt");
        arquivoTemp.deleteOnExit();
        String conteudoArquivo = "produto1,10.0\nproduto2,20.0\nproduto3,30.0\n";
        Files.writeString(arquivoTemp.toPath(), conteudoArquivo);

        // Carrega os produtos do arquivo temporário
        CarregadorProdutos carregador = new CarregadorProdutos();
        List<IProduto> produtos = carregador.carregarProdutos(arquivoTemp.getAbsolutePath());

        // Verifica se a lista de produtos foi carregada corretamente
        Assertions.assertEquals(3, produtos.size());
        Assertions.assertEquals("produto1", produtos.get(0).getDescricao());
        Assertions.assertEquals(10.0, produtos.get(0).getPreco());
        Assertions.assertEquals("produto2", produtos.get(1).getDescricao());
        Assertions.assertEquals(20.0, produtos.get(1).getPreco());
        Assertions.assertEquals("produto3", produtos.get(2).getDescricao());
        Assertions.assertEquals(30.0, produtos.get(2).getPreco());
    }

    @Test
    void testCarregarProdutosArquivoInexistente() {
        // Tenta carregar produtos de um arquivo inexistente
        CarregadorProdutos carregador = new CarregadorProdutos();
        Assertions.assertThrows(FileNotFoundException.class, () -> {
            carregador.carregarProdutos("arquivo_que_nao_existe.txt");
        });
    }

    @Test
    void testCarregarProdutosArquivoInvalido() throws Exception {
        // Cria um arquivo temporário com um produto inválido (preço não numérico)
        File arquivoTemp = File.createTempFile("produtos", ".txt");
        arquivoTemp.deleteOnExit();
        String conteudoArquivo = "produto1,10.0\nproduto2,preco_invalido\nproduto3,30.0\n";
        Files.writeString(arquivoTemp.toPath(), conteudoArquivo);

        // Tenta carregar produtos do arquivo temporário
        CarregadorProdutos carregador = new CarregadorProdutos();
        Assertions.assertThrows(NumberFormatException.class, () -> {
            carregador.carregarProdutos(arquivoTemp.getAbsolutePath());
        });
    }

}

