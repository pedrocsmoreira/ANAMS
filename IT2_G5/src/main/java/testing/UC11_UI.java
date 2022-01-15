package ui;

public class UC11_UI{
	private GESTFEST gestfest;
	private registarPlanoBilhetica controller;

	public UC11_UI(GESTFEST gestfest){
		this.gestfest = gestfest;
	}

	public void run(){
		System.out.println("Planeamento da Bilhética de um festival");

		controller.procuraFestival(introduzFestival());

		controller.setDatas();

		ArrayList<LocalDate> datas = controller.getDatas();
		ArrayList<TipoBilhete> tipoBilhete = controller.getTipoBilhete();
		HashMap<LocalDate, HashMap<TipoBilhete, Integer>> plano = new HashMap<>();
		for(LocalDate d : datas){
			HashMap<TipoBilhete, Integer> planoDiario = new HashMap<>();
			for(TipoBilhete tp : tipoBilhete){
				planoDiario.put(tp, introduzNumBilhetes(controller.getLotacao(d),tp));
			}
			plano.put(d, planoDiario);
		}

		apresentaDados();

		if(Utils.confirma("Prentende inserir este plano? (S/N)")){
			
		}
	}

	private String introduzFestival(){
		return Utils.readLineFromConsole("Insira o festival a trabalhar");
	}

	private Integer introduzNumBilhetes(int lotacao, TipoBilhete tp){
		int a = 0;
		do{
			a = Utils.IntFromConsole("Insira o número de Bilhetes disponíveis para o tipo" + tp.getNome());
		}while(a < 0 || a > lotacao)
		return new Integer(a);
	}

}