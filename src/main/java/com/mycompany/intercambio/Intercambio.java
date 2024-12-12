package com.mycompany.intercambio;

import java.util.ArrayList;
import java.util.Date;

public class Intercambio extends Usuario {

    private int id;
    private String destino;
    private String tipo;
    private int duracao;
    private Date dataInicio;
    private Date dataFim;
    private String status;

    private static ArrayList<UsuarioIntercambio> participantes = new ArrayList<>();
    private static ArrayList<Intercambio> intercambios = new ArrayList<>();

    public void inscreverParticipante(UsuarioIntercambio user) {
        for (int i = 0; i < participantes.size(); i++) {
            if (participantes.get(i).equals(user)) {
                return;
            }
        }
        participantes.add(user);
    }

    public void alterarStatus(String status) {
        this.status = status;
    }

    public String gerarRelatorio() {
        String relatorio = "";
        for (int i = 0; i < participantes.size(); i++) {
            UsuarioIntercambio user = participantes.get(i);
            relatorio += "ID: " + user.getId() + ", Nome: " + user.getNome() + "\n";
        }
        return relatorio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDestino() {
        return destino;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
