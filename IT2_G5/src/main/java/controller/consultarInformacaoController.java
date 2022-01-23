package controller;

import exceptions.ExcecaoNaoExiste;
import java.util.ArrayList;
import java.util.Date;
import model.Festival;
import model.GESTFEST;

/**
 *
 * @author grupo5
 */

public class consultarInformacaoController {
    private GESTFEST gestfest;
    private Festival festival;
    private ArrayList<Festival> festivais;
    
    public consultarInformacaoController(GESTFEST gestfest){
        this.gestfest = gestfest;
    }
    
    public void consultarFestivalString(String festival) throws ExcecaoNaoExiste{
        this.festival = gestfest.procuraFestivalString(festival);
    }
    
    public void consultarFestivalData(Date data) throws ExcecaoNaoExiste{
        this.festivais = gestfest.procuraFestivalData(data);
    }

    public String apresentarFestival(){
        return festival.toString();
    }
    
    public ArrayList<String> apresentarFestivais(){
        ArrayList<String> fest = new ArrayList<>();
        for(Festival f : this.festivais){
            fest.add(f.toString());
        }
        return fest;
    }
}