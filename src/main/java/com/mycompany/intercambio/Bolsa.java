    package com.mycompany.intercambio;

    import java.util.ArrayList;

    public class Bolsa extends UsuarioIntercambio {

        private int id;
        private String descricao;
        private float valor;
        private String tipo;

        private static ArrayList<Bolsa> bolsas = new ArrayList<>();

        public boolean alocarBolsa(UsuarioIntercambio u) {
            for (int i = 0; i < bolsas.size(); i++) {
                if (bolsas.get(i).id == this.id) {
                    return false;
                }
            }
            bolsas.add(this);
            return true;
        }

        public float consultarValor() {
            for (int i = 0; i < bolsas.size(); i++) {
                if (bolsas.get(i).id == this.id) {
                    return bolsas.get(i).valor;
                }
            }
            return 0;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setValor(float valor) {
            this.valor = valor;
        }

        public float getValor() {
            return valor;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getTipo() {
            return tipo;
        }
    }
