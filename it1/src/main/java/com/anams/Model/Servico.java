package com.anams.Model;

public class Servico {
    private int codigo;
    private String designacao;
    private float preco;
    private TipoServico tipoServico;

    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;

    /**
     * Construtor Vazio do Serviço
     * 
     */
    public Servico() {
        setCodigo(INT_DEFAULT);
        setDesignacao(STR_DEFAULT);
        setPreco(INT_DEFAULT);
        setTipoServico(new TipoServico());
    }

    /**
     * Construtor com parâmetros do Serviço
     * 
     * @param codigo
     * @param designacao
     * @param preco
     */
    public Servico(int codigo, String designacao, float preco) {
        setCodigo(codigo);
        setDesignacao(designacao);
        setPreco(preco);
        setTipoServico(new TipoServico());
    }

    /**
     * Construtor Completo do Serviço
     * 
     * @param codigo
     * @param designacao
     * @param preco
     * @param ts
     */
    public Servico(int codigo, String designacao, float preco, TipoServico ts) {
        setCodigo(codigo);
        setDesignacao(designacao);
        setPreco(preco);
        setTipoServico(ts);
    }
    
    /**
     * Construtor cópia do Serviço
     * 
     * @param s
     */
    public Servico(Servico s) {
        setCodigo(s.codigo);
        setDesignacao(s.designacao);
        setPreco(s.preco);
        setTipoServico(s.tipoServico);
    }

    /**
     * Define código do Serviço
     * 
     * @param codigo
     */
    public void setCodigo(int codigo) { this.codigo = codigo; }

    /**
     * Devolve código do Serviço
     * 
     * @return codigo
     */
    public int getCodigo() { return this.codigo; }

    /**
     * Define designação do Serviço
     * 
     * @param designacao
     */
    public void setDesignacao(String designacao) { this.designacao = designacao; }

    /**
     * Devolve designação do Serviço
     * 
     * @return designacao
     */
    public String getDesignacao() { return this.designacao; }

    /**
     * Define preço do Serviço
     * 
     * @param preco
     */
    public void setPreco(float preco) { this.preco = preco; }

    /**
     * Devolve preço do Serviço
     * 
     * @return preco
     */
    public float getPreco() { return this.preco; }

    /**
     * Define tipo de serviço do Serviço
     * 
     * @param ts
     */
    public void setTipoServico(TipoServico ts) { this.tipoServico = ts;}

    /**
     * Devolve tipo de serviço do Serviço
     * 
     * @return tipoServico
     */
    public TipoServico getTipoServico() { return this.tipoServico; }

    public String toString() {
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
    public boolean equals(Object outro) {
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