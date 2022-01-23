package model;

/**
 *
 * @author grupo5
 */

public class Bilhete {
    private int referencia;
    private String designacao;
    private Festival festival;
    private TipoBilhete tipo;
    private int preco;

    private static int contador = 0;
    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;
    private static final float FLOAT_DEFAULT = 0;

    public Bilhete(){
        this.referencia = ++contador;
        this.designacao = STR_DEFAULT;
        this.festival = new Festival();
        this.tipo = new TipoBilhete();
        this.preco = INT_DEFAULT;
    }

    public Bilhete(String designacao, Festival festival, TipoBilhete tipo, int preco){
        this.referencia = ++contador;
        this.designacao = designacao;
        this.festival = festival;
        this.tipo = tipo;
        this.preco = preco;
    }

    public Bilhete(Bilhete bilhete){
        this.referencia = bilhete.referencia;
        this.designacao = bilhete.designacao;
        this.tipo  =  bilhete.tipo;
        this.preco = bilhete.preco;
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

    public Festival getFestival() {
        return festival;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    }

    public TipoBilhete getTipo() {
        return tipo;
    }

    public void setTipo(TipoBilhete tipo) {
        this.tipo = tipo;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}