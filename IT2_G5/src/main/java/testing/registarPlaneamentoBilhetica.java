package controller;

import model.Festival;
import model.GESTFEST;

/**
 *
 * @author grupo5
 */

public class registarPlaneamentoBilhetica {
    private GESTFEST gestfest;
    private Festival festival;

    public registarPlaneamentoBilhetica(GESTFEST gestfest){
        this.gestfest = gestfest;
    }

    public void procurarFestival(String festival){
        festival = gestfest.procurarFestival(festival);
    }

    public ArrayList<LocalDate> getDatas(){
        LocalDate dataInicio = festival.getDataInicio();
        LocalDate dataFim = festival.getDataFim();
        ArrayList<LocalDate> datas = new ArrayList<>();
        
        return datas;
    }
}