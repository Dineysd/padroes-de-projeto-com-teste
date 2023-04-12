package com.projeto.padroesdeprojetocomteste.brigge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.projeto.padroesdeprojetocomteste.bridge.banco.Banco;
import com.projeto.padroesdeprojetocomteste.bridge.banco.BancoBrasil;
import com.projeto.padroesdeprojetocomteste.bridge.banco.BancoItau;
import com.projeto.padroesdeprojetocomteste.bridge.saque.Saque;
import com.projeto.padroesdeprojetocomteste.bridge.saque.SaqueContaCorrente;

public class CaixaEletronicaTest {
    @Test
    public void testSaqueContaCorrenteBancoItau() {
        Banco bancoA = new BancoItau();
        Saque saqueContaCorrente = new SaqueContaCorrente(bancoA);
        saqueContaCorrente.realizarSaque(100.00);

        assertEquals("Saque realizado no Banco Itau: 100.00", bancoA.valorSacado());
    }

    @Test
    public void testSaqueContaCorrenteBancoBrasil() {
        Banco bancob = new BancoBrasil();
        Saque saqueContaCorrente = new SaqueContaCorrente(bancob);
        saqueContaCorrente.realizarSaque(200.00);

        assertEquals("Saque realizado no Banco do Brasil: 200.0", bancob.valorSacado());
    }

}
