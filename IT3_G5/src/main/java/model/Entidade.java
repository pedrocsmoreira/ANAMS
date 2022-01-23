package model;

import java.util.HashSet;

/**
 *
 * @author grupo5
 */

public class Entidade {
    public int referencia;
    public String designacao;
    public HashSet<String> papeis;

    private static int codigo = 0;
    private static final int INT_DEFAULT = 0;
    private static final String STR_DEFAULT = "";

    public Entidade(){
        this.referencia = ++codigo;
        this.designacao = STR_DEFAULT;
        this.papeis =  new HashSet<>();
    }

    public Entidade(String designacao, HashSet<String> papeis){
        this.referencia = ++codigo;
        this.designacao = designacao;
        this.papeis = papeis;
    }

    public Entidade(Entidade e){
        this.referencia = e.referencia;
        this.designacao = e.designacao;
        this.papeis = e.papeis;
    }

    public int getReferencia() {
        return this.referencia;
    }

    public String getDesignacao() {
        return this.designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }

    public HashSet<String> getPapeis(){
        return this.papeis;
    }

    public void setPapeis(HashSet<String> papeis){
        this.papeis = papeis;
    }

    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Referência: " + this.referencia + "\n");
        sb.append("Designação: " + this.designacao + "\n");
        sb.append("Papeis: " + this.papeis.toString() + "\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Entidade other = (Entidade) obj;
        return this.referencia == other.referencia
                && this.designacao.equals(other.designacao)
                && this.papeis.equals(other.papeis);
    }
}