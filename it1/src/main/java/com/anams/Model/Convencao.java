package com.anams.Model;

import com.anams.Extra.Data;

public class Convencao {
    private int codigo;
    private String sigla;
    private String nome;
    private Data dataConvencao;
    private String website;

    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;

    /**
     * 
     */
    public Convencao(){
        this.codigo = INT_DEFAULT;
        this.sigla = STR_DEFAULT;
        this.nome = STR_DEFAULT;
        this.dataConvencao = new Data();
        this.website = STR_DEFAULT;
    }

    /**
     * @param codigo
     * @param sigla
     * @param nome
     * @param data
     * @param website
     */
    public Convencao(int codigo, String sigla, String nome, Data data, String website){
        this.codigo = codigo;
        this.sigla = sigla;
        this.nome = nome;
        this.dataConvencao = data;
        this.website = website;
    }

    /**
     * @param codigo
     */
    public void setCodigo(int codigo){ this.codigo = codigo; }
    
    /**
     * @return
     */
    public int getCodigo(){ return this.codigo; }

    /**
     * @param sigla
     */
    public void setSigla(String sigla){ this.sigla = sigla; }
    
    /**
     * @return
     */
    public String getSigla(){ return this.sigla; }

    /**
     * @param nome
     */
    public void setNome(String nome){ this.nome = nome; }
    
    /**
     * @return
     */
    public String getNome(){ return this.nome; }

    /**
     * @param data
     */
    public void setDataConvencao(Data data){ this.dataConvencao = data; }
    
    /**
     * @return
     */
    public Data getData(){ return this.dataConvencao; }

    /**
     * @param web
     */
    public void setWebsite(String web){ this.website = web; }
    
    /**
     * @return
     */
    public String getWebsite(){ return this.website; }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n\tCódigo -> ");
        sb.append(this.codigo);
        sb.append("\n\tSigla -> ");
        sb.append(this.sigla);
        sb.append("\n\tNome -> ");
        sb.append(this.nome);
        sb.append("\n\tData de Convenção -> ");
        sb.append(this.dataConvencao);
        sb.append("\n\tWebsite -> ");
        sb.append(this.website);
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
        Convencao obj = (Convencao) outro;
        return this.codigo == obj.codigo
                && this.sigla.equals(obj.sigla)
                && this.nome.equals(obj.nome)
                && this.dataConvencao.equals(obj.dataConvencao)
                && this.website.equals(obj.website);
    }

}