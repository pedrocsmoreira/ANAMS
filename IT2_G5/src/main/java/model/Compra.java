package model;

/**
 *
 * @author grupo5
 */

public class Compra {
    private int referencia;
    private Bilhete bilhete;
    private float precoTotal;
    private LocalDate data;
    private int quantidade;
    private float desconto;

    private static int contador = 0;
    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;
    private static final float FLOAT_DEFAULT = 0;

    public Compra(){
        this.referencia = ++contador;
        this.bilhete = new Bilhete();
        this.precoTotal = INT_DEFAULT;
        this.quantidade  =  INT_DEFAULT;
        this.desconto = FLOAT_DEFAULT;
    }

    public Compra(Bilhete bilhete, float precoTotal, LocalDate data, int quantidade, float desconto){
        this.referencia = ++contador;
        this.bilhete = bilhete;
        this.precoTotal = precoTotal;
        this.data = LocalDate.now();
        this.quantidade  =  quantidade;
        this.desconto = desconto;
    }

    public Compra(Compra compra){
        this.referencia = bilhete.referencia;
        this.bilhete = bilhete.bilhete;
        this.precoTotal = bilhete.precoTotal;
        this.data = bilhete.data;
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

    public int getPrecoTotal() {
        return preco;
    }

    public void setPrecoTotal(int precoTotal) {
        this.precoTotal = precoTotal;
    }
}