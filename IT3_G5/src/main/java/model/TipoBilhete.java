package model;

public class TipoBilhete{
    private String tipo;

    private static final String STR_DEFAULT = "";

    public TipoBilhete(){
	this.tipo = STR_DEFAULT;
    }

    public TipoBilhete(String tipo){
        this.tipo = tipo;
    }

    public TipoBilhete(TipoBilhete tb){
        this.tipo = tb.tipo;
    }

    public void setTipoBilhete(String tipo){
	this.tipo = tipo;
    }

    public String getTipoBilhete(){
	return this.tipo;
    }

    //falta toString e equals
}