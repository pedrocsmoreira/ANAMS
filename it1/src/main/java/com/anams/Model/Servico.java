package com.anams.Model;

public class Servico {
    private int codigo;
    private String designacao;
    private float preco;
    private TipoServico tipoServico;

    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;

    public Servico(){
        this.codigo = INT_DEFAULT;
        this.designacao = STR_DEFAULT;
        this.preco = INT_DEFAULT;
        this.tipoServico = new TipoServico();
    }

    public Servico(int codigo, String designacao, float preco){
        this.codigo = codigo;
        this.designacao = designacao;
        this.preco = preco;
        this.tipoServico = new TipoServico();
    }

    public Servico(int codigo, String designacao, float preco, TipoServico ts){
        this.codigo = codigo;
        this.designacao = designacao;
        this.preco = preco;
        this.tipoServico = ts;
    }

    public void setCodigo(int codigo){ this.codigo = codigo; }

    public int getCodigo(){ return this.codigo; }

    public void setDesignacao(String designacao){ this.designacao = designacao; }

    public String getDesignacao(){ return this.designacao; }

    public void setPreco(float preco){ this.preco = preco; }

    public float getPreco(){ return this.preco; }

    public void setTipoServico(TipoServico ts) { this.tipoServico = ts;}

    public TipoServico getTipoServico(){ return this.tipoServico; }

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