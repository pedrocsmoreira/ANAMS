package controller;

import java.util.HashSet;
import model.Festival;
import model.GESTFEST;
import model.TipoBilhete;

/**
 * 
 * @author grupo5
 */

public class especificarBilhetesController {
    private GESTFEST gestfest;
    private Festival festival;
    private TipoBilhete tipoBilhete;
    private HashSet<TipoBilhete> listaTipoBilhete;

    public especificarBilhetesController(GESTFEST gestfest){
        gestfest = gestfest;
    }

    public void novoTipoBilhete(){
    	this.tipoBilhete = new TipoBilhete();
    }

    public void setTipoBilhete(String tipo){
    	this.tipoBilhete.setTipoBilhete(tipo);
    }

    public void adicionaTipoBilhete(){
    	listaTipoBilhete.add(tipoBilhete);
    }

    public boolean inserirTiposBilhete(){
    	return gestfest.registaTipoBilhete(listaTipoBilhete);
    }

    public String getBilhetesAsString(){
        StringBuffer sb = new StringBuffer();
        for(TipoBilhete tb : listaTipoBilhete){
            sb.append(tb.toString());
        }
        return sb.toString();
    }
}