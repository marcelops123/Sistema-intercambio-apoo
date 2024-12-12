package com.mycompany.intercambio;

import java.util.ArrayList;

public class ProgramaIntercambio {

    private int id;
    private String nome;
    private String descricao;
    private int duracao;
    private String destino;
    private String requisitos;
    private float custo;
    private String status;

    private static ArrayList<UsuarioIntercambio> participantes = new ArrayList<>();
    private static ArrayList<ProgramaIntercambio> programas = new ArrayList<>();

    public String inscreverParticipante(UsuarioIntercambio u) {
        for (int i = 0; i < participantes.size(); i++) {
            if (participantes.get(i).equals(u)) {
                return "Usuário já inscrito.";
            }
        }
        participantes.add(u);
        return "Usuário inscrito com sucesso.";
    }

    public boolean alterarStatus(String status) {
        this.status = status;
        return true;
    }

    public String gerarRelatorio() {
        String relatorio = "Programa: " + nome + "\n";
        for (int i = 0; i < participantes.size(); i++) {
            UsuarioIntercambio u = participantes.get(i);
            relatorio += "ID: " + u.getId() + ", Nome: " + u.getNome() + "\n";
        }
        return relatorio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getDestino() {
        return destino;
    }

    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }

    public String getRequisitos() {
        return requisitos;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public float getCusto() {
        return custo;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
