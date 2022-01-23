package model;

import java.time.LocalDate;
import java.util.HashMap;

public class PlanoBilheteira{
    private int referencia;
    private Festival festival;
    private HashMap<LocalDate, HashMap<TipoBilhete, Integer>> plano;

    private static int contador = 0;

    public PlanoBilheteira(){
        this.referencia = ++contador;
        this.festival = new Festival();
        this.plano = new HashMap<>();
    }

    public PlanoBilheteira(Festival festival, HashMap<LocalDate, HashMap<TipoBilhete, Integer>> plano){
        this.referencia = ++contador;
        this.festival = festival;
        this.plano = plano;
    }

    public PlanoBilheteira(PlanoBilheteira plano){
        this.referencia = plano.referencia;
        this.festival = plano.festival;
        this.plano = plano.plano;
    }

    public int getReferencia() {
        return referencia;
    }

    public Festival getFestival() {
        return festival;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    }

    public HashMap<LocalDate, HashMap<TipoBilhete, Integer>> getPlano() {
        return plano;
    }

    public void setPlano(HashMap<LocalDate, HashMap<TipoBilhete, Integer>> plano) {
        this.plano = plano;
    }
}