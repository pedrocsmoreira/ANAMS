package com.anams.Model;

import com.anams.Extra.Data;

public class Especialidade {
    private int codigo;
    private String designacao;
    private String acronimo;
    private Data dataArranque;

    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;
    
    public Especialidade(){
        this.codigo = INT_DEFAULT;
        this.designacao = STR_DEFAULT;
        this.acronimo =STR_DEFAULT;
        this.dataArranque = new Data();
    }

    public void setCodigo(int codigo){ this.codigo = codigo; }

    public int getCodigo(){ return this.codigo; }

    public void setDesignacao(String designacao){ this.designacao = designacao; }

    public String getDesignacao(){ return this.designacao; }

    public void setAcronimo(String acronimoString){ this.acronimo = acronimo; }

    public String getAcronimo(){ return this.acronimo; }

    public void setDataArranque(Data data) { this.dataArranque = data; }

    public Data getDataArranque(){ return this.dataArranque; }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n\tCódigo -> ");
        sb.append(this.codigo);
        sb.append("\n\tDesignação -> ");
        sb.append(this.designacao);
        sb.append("\n\tAcrónimo -> ");
        sb.append(this.acronimo);
        sb.append("\n\tData de Arranque -> ");
        sb.append(this.dataArranque);
        return sb.toString();
    }

    @Override
    public boolean equals(Object outro){
        if(this == outro){
            return true;
        }
        if(outro == null || this.getClass() != outro.getClass()) {
            return false;
        }
        Especialidade obj = (Especialidade) outro;
        return this.codigo == obj.codigo
                && this.designacao.equals(obj.designacao)
                && this.acronimo.equals(obj.acronimo)
                && this.dataArranque.equals(obj.dataArranque);
    }

}