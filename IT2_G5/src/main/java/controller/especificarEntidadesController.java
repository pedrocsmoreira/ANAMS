package controller;

import java.util.HashSet;
import model.Festival;
import model.GESTFEST;
import model.TipoEntidade;

/**
 *
 * @author grupo5
 */

public class especificarEntidadesController {
    private GESTFEST gestfest;
    private Festival festival;
    private TipoEntidade tipoEntidade;
    private HashSet<TipoEntidade> ListaTipoEntidade;
    
    public especificarEntidadesController(GESTFEST gestfest){
        gestfest = gestfest;
    }

    public void novoTipoEntidade(){
        this.tipoEntidade = new TipoEntidade();
    }

    public void setTipoEntidade(String tipo){
        this.tipoEntidade.setTipoEntidade(tipo);
    }

    public void adicionaTipoEntidade(){
        this.ListaTipoEntidade.add(tipoEntidade);
    }

    public boolean inserirEntidades(){
        return gestfest.registaTipoEntidade(ListaTipoEntidade);
    }

    public String getEntidadesAsString(){
        StringBuffer sb = new StringBuffer();
        for(TipoEntidade te : ListaTipoEntidade){
            sb.append(getEntidadeAsString(te));
        }
        return sb.toString();
    }

    private String getEntidadeAsString(TipoEntidade te){
        return te.toString() + "\n ----------- \n";
    }

}