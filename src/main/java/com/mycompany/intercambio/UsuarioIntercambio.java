package com.mycompany.intercambio;

import java.util.ArrayList;

public class UsuarioIntercambio extends Usuario {

    private String statusVisto;

    private static ArrayList<UsuarioIntercambio> usuariosIntercambio = new ArrayList<>();

    public String consultarStatusVisto() {
        for (int i = 0; i < usuariosIntercambio.size(); i++) {
            if (usuariosIntercambio.get(i).getId() == this.getId()) {
                return usuariosIntercambio.get(i).statusVisto;
            }
        }
        return "Status do visto não encontrado.";
    }

    public void setStatusVisto(String statusVisto) {
        this.statusVisto = statusVisto;
    }

    public String getStatusVisto() {
        return statusVisto;
    }
}
