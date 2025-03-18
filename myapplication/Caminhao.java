package com.example.myapplication;

import android.util.Log;

public class Caminhao extends Veiculo{
    protected double comprimento;
    protected double largura;
    protected double altura;

    public Caminhao(String cor, String modelo, int qtdPneu, String funcao, double volume, double comprimento, double largura, double altura) {
        super(cor, modelo, qtdPneu, funcao);
    }

    public double calculaVolume(){
        double volume = comprimento * largura * altura;
        return volume;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void exibirDetalhesCaminhao() {
        Log.i("Veiculo", "cor" + cor + "Modelo" + modelo + "Quantidade de Pneus" + qtdPneu + "Função" + funcao + "Comprimento" + comprimento + "Largura" + largura + "Altura" + altura);
    }
}
