package com.example.myapplication;

import android.util.Log;

public class Computador extends Eletronicos{
    protected int qtdMemoria;
    protected String funcao;

    public Computador(String dispositivo, String marca, String modelo, int qtdMemoria, String funcao, int preco) {
        super(dispositivo, marca, modelo);
    }

    public int getQtdMemoria() {
        return qtdMemoria;
    }

    public void setQtdMemoria(int qtdMemoria) {
        this.qtdMemoria = qtdMemoria;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void exibirDetalhesComputador() {
        Log.i("Eletronico", "Dispositivo" + dispositivo + "Marca" + marca + "Modelo" + modelo + "Quantidade de Memória" + qtdMemoria + "Função" + funcao);
    }
}
