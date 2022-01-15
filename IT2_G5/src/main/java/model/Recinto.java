package model;

import java.util.HashSet;

public class Recinto{
    private int referencia;
    private String designacao;
    private HashSet<Palco> palcos;
    private int lotacao;

    private int contador = 0;
    private final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;

    public Recinto(){
	this.referencia = INT_DEFAULT;
        this.designacao = STR_DEFAULT;
        this.palcos = new HashSet<>();
        this.lotacao = INT_DEFAULT;
    }

    public Recinto(String designacao){
        this.referencia = ++contador;
        this.designacao = designacao;
        this.palcos = palcos;
        this.lotacao = INT_DEFAULT;
    }

    public Recinto(Recinto r){
        this.referencia = r.referencia;
        this.designacao = r.designacao;
        this.palcos = r.palcos;
        this.lotacao = r.lotacao;
    }

    public int getReferencia(){
	return this.referencia;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public HashSet<Palco> getPalcos() {
        return palcos;
    }

    public void setPalcos(HashSet<Palco> palcos) {
        this.palcos = palcos;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    //falta toString e equals
}