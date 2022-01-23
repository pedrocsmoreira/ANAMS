package controller;

import java.util.HashSet;
import model.Entidade;
import model.GESTFEST;

/**
 *
 * @author grupo5
 */

public class registarEntidadeController {
    private GESTFEST gestfest;
    private Entidade entidade;

    public registarEntidadeController(GESTFEST gestfest){
        this.gestfest = gestfest;
    }

    public void novaEntidade(){
        this.entidade = new Entidade();
    }

    public void setDesignacao(String designacao){
        this.entidade.setDesignacao(designacao);
    }

    public void setPapeis(HashSet<String> papeis){
        this.entidade.setPapeis(papeis);
    }

    public boolean registaEntidade(){
        return this.gestfest.registaEntidade(this.entidade);
    }

    public String getEntidadeAsString(){
        return this.entidade.toString();
    }
}