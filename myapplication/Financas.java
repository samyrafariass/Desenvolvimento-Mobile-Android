package com.example.myapplication;
import android.util.Log;


public class Financas implements IFinancas{
    protected float gastoSemanal;
    protected float  gastoMensal;
    protected float valorTrasacao;

    public Financas(float gastoSemanal, float gastoMensal, float valorTrasacao) {
        this.gastoSemanal = gastoSemanal;
        this.gastoMensal = gastoMensal;
        this.valorTrasacao = valorTrasacao;
    }

    @Override
    public void acompanharDespesa() {

    }

    @Override
    public float calcularSaldo() {
        return 0;
    }

    @Override
    public void identificaTransacoes() {

    }

    public float getGastoSemanal() {
        return gastoSemanal;
    }

    public void setGastoSemanal(float gastoSemanal) {
        this.gastoSemanal = gastoSemanal;
    }

    public float getGastoMensal() {
        return gastoMensal;
    }

    public void setGastoMensal(float gastoMensal) {
        this.gastoMensal = gastoMensal;
    }

    public float getValorTrasacao() {
        return valorTrasacao;
    }

    public void setValorTrasacao(float valorTrasacao) {
        this.valorTrasacao = valorTrasacao;
    }

    public void exibirDetalhesVeiculo() {
        Log.i("Veiculo", "cor" + cor + "Modelo" + modelo + "Quantidade de Pneus" + qtdPneu + "Função" + funcao);
    }
}
