package com.mycompany.intercambio;

import java.util.ArrayList;

public class Avaliacao extends UsuarioIntercambio {

    private int id;
    private String comentario;
    private float nota;

    private static ArrayList<Avaliacao> avaliacoes = new ArrayList<>();

   public boolean registrarAvaliacao(int idAvaliacao) {
        if (!verificarIdExistente(idAvaliacao)) {
            System.out.println("ID inválido. Não é possível registrar a avaliação.");
            return false;
        }
        for (int i = 0; i < avaliacoes.size(); i++) {
            if (avaliacoes.get(i).id == idAvaliacao) {
                return false;
            }
        }
        avaliacoes.add(this);
        return true;
    }

    public String consultarAvaliacao(int idAvaliacao) {
        for (int i = 0; i < avaliacoes.size(); i++) {
            if (avaliacoes.get(i).id == idAvaliacao) {
                Avaliacao avaliacao = avaliacoes.get(i);
                return "ID: " + avaliacao.id + ", Comentário: " + avaliacao.comentario + ", Nota: " + avaliacao.nota;
            }
        }
        return "Avaliação não encontrada.";
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public float getNota() {
        return nota;
    }
}
