package controller;

import exceptions.ExcecaoNaoExiste;
import java.util.HashMap;
import java.util.HashSet;
import model.Festival;
import model.Entidade;
import model.GESTFEST;

/**
 *
 * @author grupo5
 */

public class associarEntidadeController {
    private GESTFEST gestfest;
    private Festival festival;
    private Entidade entidade;
    private HashSet<Entidade> listaEntidades;
    private HashMap<Entidade, HashSet<String>> listaEntidadesPapeis;

    public associarEntidadeController(GESTFEST gestfest){
        this.gestfest = gestfest;
    }

    public void consultarFestival(String festival) throws ExcecaoNaoExiste{
        this.festival = gestfest.procuraFestival(festival);
    }

    public void consultarEntidade(String entidade) throws ExcecaoNaoExiste{
        this.entidade = gestfest.procuraEntidade(entidade);
    }

    public void associaEntidades(){
        this.gestfest.associaEntidadeFestival(festival, listaEntidades);
    }

    public String getFestivalAsString(){
        return this.festival.toString();
    }

    public String getEntidadesAsString(){
        StringBuffer sb = new StringBuffer();
        for(Entidade e : listaEntidades){
            sb.append(getEntidadeAsString(e));
        }
        return sb.toString();
    }

    public String getEntidadeAsString(Entidade entidade){
        return entidade.toString() + "\n";
    }

    public void inserirPapel(String papel) throws ExcecaoNaoExiste{
        if(!entidade.papeis.contains(papel)){
            System.out.println("Papel não corresponde a entidade selecionada!!!");
        }
    }
}