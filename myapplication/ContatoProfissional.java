package com.example.myapplication;
import android.util.Log;


public class ContatoProfissional implements IContato {
    protected String remetente;
    protected String modoDeEnvio;
    protected String destinatario;
    protected String conteudoMensagem;
    protected String prioridadeRetorno;

    public ContatoProfissional(String remetente, String modoDeEnvio, String destinatario, String conteudoMensagem, String prioridadeRetorno) {
        this.remetente = remetente;
        this.modoDeEnvio = modoDeEnvio;
        this.destinatario = destinatario;
        this.conteudoMensagem = conteudoMensagem;
        this.prioridadeRetorno = prioridadeRetorno;
    }

    @Override
    public void notificaContato() {
        Log.i("Nova mensagem do setor de TI, VERIFIQUE!");

    }

    @Override
    public void anotarRecado(String msg) {
          Log.i("Segue recado deixado pelo TI:" + msg);

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

    public void exibirDetalhesContatoProfissional() {
         Log.i("Remetente" + remetente + "Modo de Envio" + modoDeEnvio + "Destinatario" + destinatario + "Conteúdo da Mensagem" + conteudoMensagem + "Assunto da Mensagem" + assuntoMensagem + "Prioridade da Mensagem para retorno" + prioridadeRetorno)
    }
}
