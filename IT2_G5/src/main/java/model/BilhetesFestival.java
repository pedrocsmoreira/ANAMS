package model;

/**
 *
 * @author grupo5
 */

public class BilhetesFestival {
    private int referencia;
    private String designacao;
    private TipoBilhete tipo;
    private int preco;
    private LocalDate data;
    private int quantidade;
    private float desconto;

    private static int contador = 0;
    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;
    private static final float FLOAT_DEFAULT = 0;

    public BilhetesFestival(){
        this.referencia = ++contador;
        this.designacao = STR_DEFAULT;
        this.tipo = new TipoBilhete();
        this.preco = INT_DEFAULT;
        this.quantidade  =  INT_DEFAULT;
        this.desconto = FLOAT_DEFAULT;
    }

    public BilhetesFestival(String designacao, TipoBilhete tipo, int preco, int quantidade, float desconto){
        this.referencia = ++contador;
        this.designacao = designacao;
        this.tipo = tipo;
        this.preco = preço;
        this.quantidade  =  quantidade;
        this.desconto = desconto;
    }

    public BilhetesFestival(BilhetesFestival bilheteFestival){
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

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}