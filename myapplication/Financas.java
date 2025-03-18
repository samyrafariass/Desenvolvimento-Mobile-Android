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
        Log.i("Visualize suas despesas: " + "Gasto Semanal" + gastoSemanal + "Gasto Mensal" + gastoMensal);
    }

    @Override
    public float calcularSaldo() {
        float saldo = gastoMensal + gastoSemanal;
        return saldo;
    }

    @Override
    public void identificaTransacoes() {
        Log.i("Última transação realizada" + valorTrasacao);

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

    public void exibirDetalhesFinancas() {
        Log.i("GASTOS", "Semanal" + gastoSemanal + "Mensal" + gastoMensal + "Trasação realizada recentemente" + valorTransacao);
    }
}
