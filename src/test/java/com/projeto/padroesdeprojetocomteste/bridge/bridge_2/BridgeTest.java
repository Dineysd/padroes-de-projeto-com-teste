package com.projeto.padroesdeprojetocomteste.bridge.bridge_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BridgeTest {
    @Test
    public void testBridgeBancoBradesco() {
        Ponte bancoBradesco = new BancoBradesco();
        CaixaEletronico caixaA = new CaixaEletronico(bancoBradesco, "123456", "senha123");
        String resultado = caixaA.operacao();
        assertEquals("Conta: 123456\nSenha: senha123\nOperacão Banco Bradesco", resultado);
    }

    @Test
    public void testBridgeUniBank() {
        Ponte uniBank = new UniBank();
        CaixaEletronico caixaB = new CaixaEletronico(uniBank, "987654", "outraSenha");
        String resultado = caixaB.operacao();
        assertEquals("Conta: 987654\nSenha: outraSenha\nOperação UniBank", resultado);
    }

    @Test
    public void testBridgeBancoBradescoComOutraConta() {
        Ponte bancoBradesco = new BancoBradesco();
        CaixaEletronico caixaA = new CaixaEletronico(bancoBradesco, "111222", "senha123");
        String resultado = caixaA.operacao();
        assertEquals("Conta: 111222\nSenha: senha123\nOperacão Banco Bradesco", resultado);
    }

}
