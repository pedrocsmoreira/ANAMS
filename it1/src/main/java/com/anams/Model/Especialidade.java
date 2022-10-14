package com.anams.Model;

import com.anams.Utils.Data;

public class Especialidade {
    private int codigo;
    private String designacao;
    private String acronimo;
    private Data dataArranque;

    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;
    
    /**
     * 
     * 
     */
    public Especialidade(){
        this.codigo = INT_DEFAULT;
        this.designacao = STR_DEFAULT;
        this.acronimo =STR_DEFAULT;
        this.dataArranque = new Data();
    }

    /**
     * 
     * 
     * @param codigo
     * @param designacao
     * @param acronimo
     * @param data
     */
    public Especialidade(int codigo, String designacao, String acronimo, Data data){
        this.codigo = codigo;
        this.designacao = designacao;
        this.acronimo = acronimo;
        this.dataArranque = data;
    }

    /**
     * 
     * 
     * @param e
     */
    public Especialidade(Especialidade e){
        this.codigo = e.codigo;
        this.designacao = e.designacao;
        this.acronimo = e.acronimo;
        this.dataArranque = e.dataArranque;
    }

    /**
     * 
     * 
     * @param codigo
     */
    public void setCodigo(int codigo){ this.codigo = codigo; }

    /**
     * 
     * 
     * @return codigo
     */
    public int getCodigo(){ return this.codigo; }

    /**
     * 
     * 
     * @param designacao
     */
    public void setDesignacao(String designacao){ this.designacao = designacao; }

    /**
     * 
     * 
     * @return designacao
     */
    public String getDesignacao(){ return this.designacao; }

    /**
     * 
     * 
     * @param acronimoString
     */
    public void setAcronimo(String acronimoString){ this.acronimo = acronimo; }

    /**
     * 
     * 
     * @return acronimo
     */
    public String getAcronimo(){ return this.acronimo; }

    /**
     * 
     * 
     * @param data
     */
    public void setDataArranque(Data data) { this.dataArranque = data; }

    /**
     * 
     * 
     * @return dataArranque
     */
    public Data getDataArranque(){ return this.dataArranque; }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
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

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
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