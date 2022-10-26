package com.anams.Model;

import com.anams.Utils.Data;

public class Convencao {
    private int codigo;
    private String sigla;
    private String nome;
    private Data dataConvencao;
    private String website;

    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;

    /**
     * Construtor vazio da Convenção
     * 
     */
    public Convencao(){
        setCodigo(INT_DEFAULT);
        setSigla(STR_DEFAULT);
        setNome(STR_DEFAULT);
        setDataConvencao(new Data());
        setWebsite(STR_DEFAULT);
    }

    /**
     * Construtor Completo da Convenção
     * 
     * @param codigo
     * @param sigla
     * @param nome
     * @param data
     * @param website
     */
    public Convencao(int codigo, String sigla, String nome, Data data, String website){
        setCodigo(codigo);
        setSigla(sigla);
        setNome(nome);
        setDataConvencao(data);
        setWebsite(website);
    }

    /**
     * Construtor Cópia da Convenção
     * 
     * @param c
     */
    public Convencao(Convencao c){
        setCodigo(c.codigo);
        setSigla(c.sigla);
        setNome(c.nome);
        setDataConvencao(c.dataConvencao);
        setWebsite(c.website);
    }

    /**
     * Define código da Convenção
     * 
     * @param codigo
     */
    public void setCodigo(int codigo){ this.codigo = codigo; }
    
    /**
     * Devolve código da Convenção
     * 
     * @return codigo
     */
    public int getCodigo(){ return this.codigo; }

    /**
     * Define código da Convenção
     * 
     * @param sigla
     */
    public void setSigla(String sigla){ this.sigla = sigla; }
    
    /**
     * Devolve sigla da Convenção
     * 
     * @return sigla
     */
    public String getSigla(){ return this.sigla; }

    /**
     * Define código da Convenção
     * 
     * @param nome
     */
    public void setNome(String nome){ this.nome = nome; }
    
    /**
     * Devolve nome da Convenção
     * 
     * @return nome
     */
    public String getNome(){ return this.nome; }

    /**
     * Define código da Convenção
     * 
     * @param data
     */
    public void setDataConvencao(Data data){ this.dataConvencao = data; }
    
    /**
     * Devolve data da Convenção
     * 
     * @return dataConvencao
     */
    public Data getData(){ return this.dataConvencao; }

    /**
     * Define código da Convenção
     * 
     * @param web
     */
    public void setWebsite(String web){ this.website = web; }
    
    /**
     * Devolve website da Convenção
     * 
     * @return website
     */
    public String getWebsite(){ return this.website; }

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