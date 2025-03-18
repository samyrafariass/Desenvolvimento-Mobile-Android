package com.example.myapplication;
import android.util.Log;

public abstract class Eletronicos {
    protected String dispositivo;
    protected String marca;
    protected String modelo;
    protected int preco;

    public Eletronicos(String dispositivo, String marca, String modelo) {
        this.dispositivo = dispositivo;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void exibirDetalhesEletronico() {
        Log.i("Eletronico", "Dispositivo" + dispositivo + "Marca" + marca + "Modelo" + modelo);
    }
}
