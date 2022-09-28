package com.anams.Model;

public class TipoServico {
    private int codigo;
    private String nome;

    private static int contador = 0;

    private static final String STR_DEFAULT = "";

    /**
     * 
     */
    public TipoServico(){
        this.codigo = ++contador;
        this.nome = STR_DEFAULT;
    }

    /**
     * @param nome
     */
    public TipoServico(String nome){
        this.codigo = ++contador;
        this.nome = nome;
    }

    /**
     * @return codigo
     */
    public int getCodigo(){ return this.codigo; }

    /**
     * @param nome
     */
    public void setNome(String nome){ this.nome = nome; }

    /**
     * @return
     */
    public String getNome(){ return this.nome; }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n\tCódigo -> ");
        sb.append(this.codigo);
        sb.append("\n\tNome -> ");
        sb.append(this.nome);
        return sb.toString();
    }

    @Override
    public boolean equals(Object outro){
        if(this == outro){ return true; }
        if(outro == null || this.getClass() != outro.getClass()){ return false; }
        TipoServico obj = (TipoServico) outro;
        return this.codigo == obj.codigo && this.nome.equals(obj.nome);
    }

}