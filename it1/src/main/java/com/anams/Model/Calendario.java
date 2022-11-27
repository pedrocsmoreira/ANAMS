package com.anams.Model;

public class Calendario {
    private int id;
    private Marcacao[] marcacoes;

    private static int contador = 0;

    public Calendario(){
        setId(++contador);
        setMarcacoes(null);
    }

    public Calendario(Marcacao[] marcacoes){
        setId(++contador);
        setMarcacoes(marcacoes);
    }

    private void setId(int id) { this.id = id; }

    public int getId() { return this.id; }

    public void setMarcacoes(Marcacao[] marcacoes) { this.marcacoes = marcacoes; }

    public Marcacao[] getMarcacoes() { return this.marcacoes; }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n\tCódigo -> ");
        sb.append(this.id);
        sb.append("\n\tMarcações -> ");
        for(Marcacao m : marcacoes){
            sb.append(this.marcacoes);
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object outro) {
        if(this == outro) {
            return true;
        }
        if(outro == null || this.getClass() != outro.getClass()) {
            return false;
        }
        Calendario obj = (Calendario) outro;
        return this.id == obj.id
                && this.marcacoes.equals(obj.marcacoes);
    }

}
