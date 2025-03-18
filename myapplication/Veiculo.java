package com.example.myapplication;
import android.util.Log;

public abstract class Veiculo {
    protected String cor;
    protected String modelo;
    protected int qtdPneu;
    protected String funcao;

    public Veiculo(String cor, String modelo, int qtdPneu, String funcao) {
        this.cor = cor;
        this.modelo = modelo;
        this.qtdPneu = qtdPneu;
        this.funcao = funcao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getQtdPneu() {
        return qtdPneu;
    }

    public void setQtdPneu(int qtdPneu) {
        this.qtdPneu = qtdPneu;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void exibirDetalhesVeiculo() {
        Log.i("Veiculo", "cor" + cor + "Modelo" + modelo + "Quantidade de Pneus" + qtdPneu + "Função" + funcao);
    }
}
