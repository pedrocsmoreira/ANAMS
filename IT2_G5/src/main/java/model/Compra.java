package model;

/**
 *
 * @author grupo5
 */

public class Compra {
    private int referencia;
    private Bilhete bilhete;
    private int precoTotal;
    private LocalDate data;
    private int quantidade;
    private float desconto;

    private static int contador = 0;
    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;
    private static final float FLOAT_DEFAULT = 0;

    public Compra(){
        this.referencia = ++contador;
        this.designacao = STR_DEFAULT;
        this.tipo = new TipoBilhete();
        this.preco = INT_DEFAULT;
        this.quantidade  =  INT_DEFAULT;
        this.desconto = FLOAT_DEFAULT;
    }

    public Compra(Bilhete bilhete, int precoTotal, int quantidade, float desconto){
        this.referencia = ++contador;
        this.bilhete = bilhete;
        this.precoTotal = preco;
        this.data = LocalDate.now();
        this.quantidade  =  quantidade;
        this.desconto = desconto;
    }

    public Compra(BilhetesFestival bilheteFestival){
        this.referencia = bilheteFestival.referencia;
        this.designacao = bilheteFestival.designacao;
        this.tipo = bilheteFestival.tipo;
        this.preco = bilheteFestival.preço;
        this.quantidade  =  bilheteFestival.quantidade;
        this.desconto = bilheteFestival.desconto;
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