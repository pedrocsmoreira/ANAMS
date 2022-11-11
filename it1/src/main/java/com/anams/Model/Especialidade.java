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
     * Construtor vazio da Especialidade
     * 
     */
    public Especialidade() {
        setCodigo(INT_DEFAULT);
        setDesignacao(STR_DEFAULT);
        setAcronimo(STR_DEFAULT);
        setDataArranque(new Data());
    }

    /**
     * Construtor Completo da Especialidade
     * 
     * @param codigo
     * @param designacao
     * @param acronimo
     * @param data
     */
    public Especialidade(int codigo, String designacao, String acronimo, Data data) {
        setCodigo(codigo);
        setDesignacao(designacao);
        setAcronimo(acronimo);
        setDataArranque(data);
    }

    /**
     * Construtor Cópia da Especialidade
     * 
     * @param e
     */
    public Especialidade(Especialidade e) {
        setCodigo(e.codigo);
        setDesignacao(e.designacao);
        setAcronimo(e.acronimo);
        setDataArranque(e.dataArranque);
    }

    /**
     * Define código da Especialidade
     * 
     * @param codigo
     */
    public void setCodigo(int codigo) { this.codigo = codigo; }

    /**
     * Devolve código da Especialidade
     * 
     * @return codigo
     */
    public int getCodigo() { return this.codigo; }

    /**
     * Define Designação da Especialidade
     * 
     * @param designacao
     */
    public void setDesignacao(String designacao) { this.designacao = designacao; }

    /**
     * Devolve Designação da Especialidade
     * 
     * @return designacao
     */
    public String getDesignacao() { return this.designacao; }

    /**
     * Define Acrónimo da Especialidade
     * 
     * @param acronimoString
     */
    public void setAcronimo(String acronimoString) { this.acronimo = acronimo; }

    /**
     * Devolve Acrónimo da Especialidade
     * 
     * @return acronimo
     */
    public String getAcronimo() { return this.acronimo; }

    /**
     * Define Data de Arranque da Especialidade
     * 
     * @param data
     */
    public void setDataArranque(Data data) { this.dataArranque = data; }

    /**
     * Devolve Data de Arranque da Especialidade
     * 
     * @return dataArranque
     */
    public Data getDataArranque() { return this.dataArranque; }

    public String toString() {
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
    public boolean equals(Object outro) {
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