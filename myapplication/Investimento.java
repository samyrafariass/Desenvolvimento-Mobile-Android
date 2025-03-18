package com.example.myapplication;
import android.util.Log;


public class Investimento implements Investimentos{
    protected String investimentoAtual;
    protected float entradaInvestimento;
    protected float ganhoEmInvestimento;

    public Investimento(String investimentoAtual, float entradaInvestimento, float ganhoEmInvestimento) {
        this.investimentoAtual = investimentoAtual;
        this.entradaInvestimento = entradaInvestimento;
        this.ganhoEmInvestimento = ganhoEmInvestimento;
    }

    @Override
    public void acompanharInvestimento(String inv) {

    }

    @Override
    public float calculaRetornoTotal() {
        return 0;
    }

    @Override
    public void identificaInvestimentos() {

    }

    public String getInvestimentoAtual() {
        return investimentoAtual;
    }

    public void setInvestimentoAtual(String investimentoAtual) {
        this.investimentoAtual = investimentoAtual;
    }

    public float getEntradaInvestimento() {
        return entradaInvestimento;
    }

    public void setEntradaInvestimento(float entradaInvestimento) {
        this.entradaInvestimento = entradaInvestimento;
    }

    public float getGanhoEmInvestimento() {
        return ganhoEmInvestimento;
    }

    public void setGanhoEmInvestimento(float ganhoEmInvestimento) {
        this.ganhoEmInvestimento = ganhoEmInvestimento;
    }

    public void exibirDetalhesVeiculo() {
        Log.i("Veiculo", "cor" + cor + "Modelo" + modelo + "Quantidade de Pneus" + qtdPneu + "Função" + funcao);
    }
}
