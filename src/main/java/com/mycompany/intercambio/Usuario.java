package com.mycompany.intercambio;

import java.util.ArrayList;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String telefone;

    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    public boolean autenticar() {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).id == this.id && usuarios.get(i).email.equals(this.email)) {
                return true;
            }
        }
        return false;
    }

    public boolean cadastrarUsuario() {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).id == this.id || usuarios.get(i).email.equals(this.email)) {
                return false;
            }
        }
        usuarios.add(this);
        return true;
    }

    public boolean verificarIdExistente(int id) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).id == id) {
                return true;
            }
        }
        return false;
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

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }
}
