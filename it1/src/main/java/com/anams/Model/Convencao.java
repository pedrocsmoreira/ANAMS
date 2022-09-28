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

    public Convencao(){
        this.codigo = INT_DEFAULT;
        this.sigla = STR_DEFAULT;
        this.nome = STR_DEFAULT;
        this.dataConvencao = new Data();
        this.website = STR_DEFAULT;
    }

    public Convencao(int codigo, String sigla, String nome, Data data, String website){
        this.codigo = codigo;
        this.sigla = sigla;
        this.nome = nome;
        this.dataConvencao = data;
        this.website = website;
    }

    public void setCodigo(int codigo){ this.codigo = codigo; }
    
    public int getCodigo(){ return this.codigo; }

    public void setSigla(String sigla){ this.sigla = sigla; }
    
    public String getSigla(){ return this.sigla; }

    public void setNome(String nome){ this.nome = nome; }
    
    public String getNome(){ return this.nome; }

    public void setDataConvencao(Data data){ this.dataConvencao = data; }
    
    public Data getData(){ return this.dataConvencao; }

    public void setWebsite(String web){ this.website = web; }
    
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