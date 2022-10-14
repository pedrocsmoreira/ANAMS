package com.anams.Model;

public class Servico {
    private int codigo;
    private String designacao;
    private float preco;
    private TipoServico tipoServico;

    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;

    /**
     * 
     * 
     * 
     */
    public Servico(){
        this.codigo = INT_DEFAULT;
        this.designacao = STR_DEFAULT;
        this.preco = INT_DEFAULT;
        this.tipoServico = new TipoServico();
    }

    /**
     * 
     * 
     * @param codigo
     * @param designacao
     * @param preco
     */
    public Servico(int codigo, String designacao, float preco){
        this.codigo = codigo;
        this.designacao = designacao;
        this.preco = preco;
        this.tipoServico = new TipoServico();
    }

    /**
     * 
     * 
     * @param codigo
     * @param designacao
     * @param preco
     * @param ts
     */
    public Servico(int codigo, String designacao, float preco, TipoServico ts){
        this.codigo = codigo;
        this.designacao = designacao;
        this.preco = preco;
        this.tipoServico = ts;
    }
    
    /**
     * 
     * 
     * @param s
     */
    public Servico(Servico s){
        this.codigo = s.codigo;
        this.designacao = s.designacao;
        this.preco = s.preco;
        this.tipoServico = s.tipoServico;
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
     * @param preco
     */
    public void setPreco(float preco){ this.preco = preco; }

    /**
     * @return preco
     */
    public float getPreco(){ return this.preco; }

    /**
     * 
     * 
     * @param ts
     */
    public void setTipoServico(TipoServico ts) { this.tipoServico = ts;}

    /**
     * 
     * 
     * @return tipoServico
     */
    public TipoServico getTipoServico(){ return this.tipoServico; }

    /* 
     * 
     * 
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n\tCódigo -> ");
        sb.append(this.codigo);
        sb.append("\n\tDesignação -> ");
        sb.append(this.designacao);
        sb.append("\n\tPreço -> ");
        sb.append(this.preco);
        sb.append("\n\tTipo de Serviço -> ");
        sb.append(this.tipoServico);
        return sb.toString();
    }

    /* 
     * 
     * 
     */
    @Override
    public boolean equals(Object outro){
        if(this == outro){
            return true;
        }
        if(outro == null || this.getClass() != outro.getClass()) {
            return false;
        }
        Servico obj = (Servico) outro;
        return this.codigo == obj.codigo
                && this.designacao.equals(obj.designacao)
                && this.preco == obj.preco
                && this.tipoServico.equals(obj.tipoServico);
    }

}