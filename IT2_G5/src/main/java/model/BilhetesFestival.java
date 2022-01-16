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

    
    private static int contador = 0;
    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;

    private BilhetesFestival(){
	this.referencia = ++contador;
	this.designacao = STR_DEFAULT;
	this.preco = INT_DEFAULT;
    }

    private BilhetesFestival(String designacao, TipoBilhete tipo, int preco){
	this.referencia = ++contador;
	this.designacao = designacao;
	this.preco = preco;
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
