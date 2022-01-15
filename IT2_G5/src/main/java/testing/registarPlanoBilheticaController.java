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

public class registarPlanoBilheticaController {
    private GESTFEST gestfest;
    private Festival festival;
    private List<LocalDate> datas;

    public registarPlanoBilheticaController(GESTFEST gestfest){
        this.gestfest = gestfest;
    }

    public void consultarFestival(String festival) throws ExcecaoNaoExiste{
        this.festival = gestfest.procuraFestival(festival);
    }

    public List<LocalDate> getDatas(){
        LocalDate startdate = festival.getDataInicio();
        LocalDate enddate =  festival.getDataFim();
        long numOfDaysBetween = startdate.until(enddate.plusDays(1), ChronoUnit.DAYS);
        datas = IntStream.iterate(0, i -> i + 1)
                .limit(numOfDaysBetween)
                .mapToObj(i -> startdate.plusDays(i))
                .collect(Collectors.toList());
        return datas;
    }

    public List<TipoBilhete> setTipoBilhete(){
        return festival.getTipoBilhete();
    }
}