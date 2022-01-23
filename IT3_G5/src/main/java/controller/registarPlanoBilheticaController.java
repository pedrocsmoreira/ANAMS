package controller;

import exceptions.ExcecaoNaoExiste;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import model.Festival;
import model.Entidade;
import model.GESTFEST;
import model.PlanoBilheteira;
import model.TipoBilhete;

/**
 *
 * @author grupo5
 */

public class registarPlanoBilheticaController {
    private GESTFEST gestfest;
    private Festival festival;
    private PlanoBilheteira planoBilheteira;
    private HashMap<LocalDate, HashMap<TipoBilhete, Integer>> plano;
    private HashMap<TipoBilhete, Integer> planoDiario;

    public registarPlanoBilheticaController(GESTFEST gestfest){
        this.gestfest = gestfest;
    }

    public void consultarFestival(String festival) throws ExcecaoNaoExiste{
        this.festival = gestfest.procuraFestivalString(festival);
    }

    public List<LocalDate> getDatas(){
        LocalDate startdate = convertToLocalDateViaMilisecond(festival.getDataInicioFestival());
        LocalDate enddate =  convertToLocalDateViaMilisecond(festival.getDataFimFestival());
        long numOfDaysBetween = startdate.until(enddate.plusDays(1), ChronoUnit.DAYS);
        List<LocalDate> datas = IntStream.iterate(0, i -> i + 1)
                .limit(numOfDaysBetween)
                .mapToObj(i -> startdate.plusDays(i))
                .collect(Collectors.toList());
        return datas;
    }
    
    public LocalDate convertToLocalDateViaMilisecond(Date dateToConvert) {
        return Instant.ofEpochMilli(dateToConvert.getTime())
          .atZone(ZoneId.systemDefault())
          .toLocalDate();
    }

    public List<TipoBilhete> setTipoBilhete(){
        return festival.getTipoBilhete();
    }

    public void newPlano(){
        plano = new HashMap<>();
    }

    public void newPlanoDiario(){
        planoDiario = new HashMap<>();
    }

    public int getLotacao(){
        return festival.getLotacaoPalcos();
    }

    public void setPlanoDiario(TipoBilhete tp, int numBilhetes){
        planoDiario.put(tp, numBilhetes);
    }

    public void setPlano(LocalDate d){
        plano.put(d, this.planoDiario);
    }

    public boolean registarPlano() {
        gestfest.registarPlano(planoBilheteira);
        return true;
    }

    public List<TipoBilhete> getTipoBilhete() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}