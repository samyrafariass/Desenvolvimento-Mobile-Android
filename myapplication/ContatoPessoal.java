package com.example.myapplication;
import android.util.Log;


public class ContatoPessoal implements IContato {
    protected String remetente;
    protected String modoDeEnvio;
    protected String destinatario;
    protected String conteudoMensagem;
    protected String assuntoMensagem;

    public ContatoPessoal(String remetente, String modoDeEnvio, String destinatario, String conteudoMensagem, String assuntoMensagem) {
        this.remetente = remetente;
        this.modoDeEnvio = modoDeEnvio;
        this.destinatario = destinatario;
        this.conteudoMensagem = conteudoMensagem;
        this.assuntoMensagem = assuntoMensagem;
    }

    @Override
    public void notificaContato() {

    }

    @Override
    public void anotarRecado() {

    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getModoDeEnvio() {
        return modoDeEnvio;
    }

    public void setModoDeEnvio(String modoDeEnvio) {
        this.modoDeEnvio = modoDeEnvio;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getConteudoMensagem() {
        return conteudoMensagem;
    }

    public void setConteudoMensagem(String conteudoMensagem) {
        this.conteudoMensagem = conteudoMensagem;
    }

    public String getAssuntoMensagem() {
        return assuntoMensagem;
    }

    public void setAssuntoMensagem(String assuntoMensagem) {
        this.assuntoMensagem = assuntoMensagem;
    }

    public void exibirDetalhesVeiculo() {
        Log.i("Veiculo", "cor" + cor + "Modelo" + modelo + "Quantidade de Pneus" + qtdPneu + "Função" + funcao);
    }
}
