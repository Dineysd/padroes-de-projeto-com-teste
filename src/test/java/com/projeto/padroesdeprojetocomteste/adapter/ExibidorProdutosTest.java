package com.projeto.padroesdeprojetocomteste.adapter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.projeto.padroesdeprojetocomteste.adapter.sistema.CarregadorProdutos;
import com.projeto.padroesdeprojetocomteste.adapter.sistema.ExibidorProdutos;
import com.projeto.padroesdeprojetocomteste.adapter.strategy.ExibidorProdutosComPromocao;
import com.projeto.padroesdeprojetocomteste.adapter.strategy.ExibidorProdutosSemPromocao;

public class ExibidorProdutosTest {

    @Test
    public void testExibirProdutosSemPromocao() throws IOException {
        // Cria uma lista de produtos sem promoção
        // Cria um arquivo temporário com dados de exemplo
        File arquivoTemp = File.createTempFile("produtos", ".txt");
        arquivoTemp.deleteOnExit();
        String conteudoArquivo = "produto 1,10.0\nproduto 2,20.0\nproduto 3,30.0\n";
        Files.writeString(arquivoTemp.toPath(), conteudoArquivo);

        // Carrega os produtos do arquivo temporário
        CarregadorProdutos carregador = new CarregadorProdutos();
        List<IProduto> produtos = carregador.carregarProdutos(arquivoTemp.getAbsolutePath());
        ExibidorProdutos exibidorProdutos = new ExibidorProdutos(new ExibidorProdutosSemPromocao());
        List<String> exibirProdutos = exibidorProdutos.exibirProdutos(produtos);
        
        // Verifica se os produtos foram exibidos corretamente
        assertEquals(3, exibirProdutos.size());
        assertEquals("produto 1 - 10.0", exibirProdutos.get(0));
        assertEquals("produto 2 - 20.0", exibirProdutos.get(1));
        assertEquals("produto 3 - 30.0", exibirProdutos.get(2));
    }

    @Test
    public void testExibirProdutosComPromocao() throws IOException {
        // Cria uma lista de produtos sem promoção
        // Cria um arquivo temporário com dados de exemplo
        File arquivoTemp = File.createTempFile("produtos", ".txt");
        arquivoTemp.deleteOnExit();
        String conteudoArquivo = "produto 1,10.0,1.0\nproduto 2,20.0,3.0\nproduto 3,30.0,5.0\n";
        Files.writeString(arquivoTemp.toPath(), conteudoArquivo);

        // Carrega os produtos do arquivo temporário
        CarregadorProdutos carregador = new CarregadorProdutos();
        List<IProduto> produtos = carregador.carregarProdutos(arquivoTemp.getAbsolutePath());
        // exibir produto
        ExibidorProdutos exibidorProdutos = new ExibidorProdutos(new ExibidorProdutosComPromocao());
        List<String> exibirProdutos = exibidorProdutos.exibirProdutos(produtos);
        
        // Verifica se os produtos foram exibidos corretamente
        assertEquals(3, exibirProdutos.size());
        assertEquals("produto 1 - 10.0 (Promoção: 1.0% de desconto)", exibirProdutos.get(0));
        assertEquals("produto 2 - 20.0 (Promoção: 3.0% de desconto)", exibirProdutos.get(1));
        assertEquals("produto 3 - 30.0 (Promoção: 5.0% de desconto)", exibirProdutos.get(2));
    }
}
