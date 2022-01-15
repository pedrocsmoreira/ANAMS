package model;

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

}