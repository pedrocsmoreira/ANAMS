package com.anams.Model;

public class TipoServico {
    private int codigo;
    private String nome;

    private static int contador = 0;

    private static final String STR_DEFAULT = "";

    /**
     * Construtor do Tipo de Serviço
     * 
     */
    public TipoServico() {
        setCodigo(++contador);
        setNome(STR_DEFAULT);
    }

    /**
     * Construtor Completo do Tipo de Serviço
     * 
     * @param nome
     */
    public TipoServico(String nome) {
        setCodigo(++contador);
        setNome(nome);
    }

    /**
     * Construtor Cópia do Tipo de Serviço
     * 
     * @param ts
     */
    public TipoServico(TipoServico ts) {
        setCodigo(ts.codigo);
        setNome(ts.nome);
    }

    /**
     * Define código do Tipo de Serviço
     * 
     * @param codigo
     */
    private void setCodigo(int codigo) { this.codigo = codigo; }

    /**
     * Devolve código do Tipo de Serviço
     * 
     * @return codigo
     */
    public int getCodigo() { return this.codigo; }

    /**
     * Define nome do Tipo de Serviço
     * 
     * @param nome
     */
    public void setNome(String nome) { this.nome = nome; }

    /**
     * Devolve nome do Tipo de Serviço
     * 
     * @return
     */
    public String getNome() { return this.nome; }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\tCódigo -> ");
        sb.append(this.codigo);
        sb.append("\n\tNome -> ");
        sb.append(this.nome);
        return sb.toString();
    }

    @Override
    public boolean equals(Object outro) {
        if(this == outro){ return true; }
        if(outro == null || this.getClass() != outro.getClass()){ return false; }
        TipoServico obj = (TipoServico) outro;
        return this.codigo == obj.codigo && this.nome.equalsIgnoreCase(obj.nome);
    }

}