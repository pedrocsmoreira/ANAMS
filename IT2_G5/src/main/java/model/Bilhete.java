package model;

/**
 *
 * @author grupo5
 */

public class Bilhete {
    private int referencia;
    private String designacao;
    private TipoBilhete tipo;
    private int preco;

    private static int contador = 0;
    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;
    private static final float FLOAT_DEFAULT = 0;

    public Bilhete(){
        this.referencia = ++contador;
        this.designacao = STR_DEFAULT;
        this.tipo = new TipoBilhete();
        this.preco = INT_DEFAULT;
    }

    public Bilhete(String designacao, TipoBilhete tipo, int preco){
        this.referencia = ++contador;
        this.designacao = designacao;
        this.tipo = tipo;
        this.preco = preco;
    }

    public Bilhete(Bilhete bilhete){
        this.referencia = bilhete.referencia;
        this.bilhete = bilhete.bilhete;
        this.precoTotal = bilhete.precoTotal;
        this.quantidade  =  bilhete.quantidade;
        this.desconto = bilhete.desconto;
    }

    public int getReferencia() {
        return referencia;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}