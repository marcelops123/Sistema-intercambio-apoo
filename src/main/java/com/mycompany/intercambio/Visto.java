package com.mycompany.intercambio;

import java.util.ArrayList;

public class Visto {

    private int id;
    private String status;
    private String tipo;

    private static ArrayList<Visto> vistos = new ArrayList<>();

    public boolean atualizarStatus(UsuarioIntercambio u) {
        for (int i = 0; i < vistos.size(); i++) {
            if (vistos.get(i).id == this.id) {
                vistos.get(i).status = u.getStatusVisto();
                return true;
            }
        }
        return false;
    }

    public String consultarStatus() {
        for (int i = 0; i < vistos.size(); i++) {
            if (vistos.get(i).id == this.id) {
                return vistos.get(i).status;
            }
        }
        return "Status não encontrado.";
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
