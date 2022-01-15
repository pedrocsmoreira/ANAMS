package controller;

import java.util.Date;
import java.util.HashSet;
import model.Festival;
import model.GESTFEST;
import model.Recinto;

/**
 *
 * @author grupo5
 */

public class registarFestivalController {
    private GESTFEST gestfest;
    private Festival festival;

    public registarFestivalController(GESTFEST gestfest){
        gestfest = gestfest;
    }

    public void novoFestival(){
        this.festival = gestfest.novoFestival();
    }

    public void setDesignacao(String designacao){
        this.festival.setDesignacao(designacao);
    }

    public void setEdicao(int edicao){
        this.festival.setEdicao(edicao);
    }

    public void setLocalizacao(String localizacao){
        this.festival.setLocalizacao(localizacao);
    }

    public void setDataInicioFestival(Date dataInicioFestival){
        this.festival.setDataInicioFestival(dataInicioFestival);
    }

    public void setDataFimFestival(Date dataFimFestival){
        this.festival.setDataFimFestival(dataFimFestival);
    }

    public void setRecinto(Recinto recinto){
        this.festival.setRecinto(recinto);
    }

    public HashSet<Festival> getListaFestivais(){
        return this.gestfest.getListaFestivais();
    }

    public boolean registarFestival(){
        return this.gestfest.registaFestival(this.festival);
    }

    public String getFestivalAsString(){
        return this.festival.toString();
    }
}