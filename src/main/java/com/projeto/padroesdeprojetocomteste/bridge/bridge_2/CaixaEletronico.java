package com.projeto.padroesdeprojetocomteste.bridge.bridge_2;

public class CaixaEletronico extends CaixaBase {
    private String conta;
    private String senha;

    public CaixaEletronico(Ponte ponte, String conta, String senha) {
        super(ponte);
        this.conta = conta;
        this.senha = senha;
    }

    @Override
    public String operacao() {
        String resultado = "Conta: " + conta + "\nSenha: " + senha + "\n";
        resultado += ponte.operacao();
        return resultado;
    }

}
