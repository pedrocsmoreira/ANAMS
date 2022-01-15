package model;

public class Palco{
    private int referencia;
    private String designacao;
    private int lotacao;

    private int contador = 0;
    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;

    public Palco(){
        this.referencia = ++contador;
	this.designacao = STR_DEFAULT;
        this.lotacao = INT_DEFAULT;
    }

    public Palco(String designacao, int lotacao){
        this.referencia = ++contador;
	this.designacao = designacao;
        this.lotacao = lotacao;
    }

    public Palco(Palco p){
        this.referencia = p.referencia;
	this.designacao = p.designacao;
        this.lotacao = p.lotacao;
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

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }
}