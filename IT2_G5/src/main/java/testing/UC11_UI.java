package ui;

public class UC11_UI{
	private GESTFEST gestfest;
	private registarPlanoBilheticaController controller;

	public UC11_UI(GESTFEST gestfest){
		this.gestfest = gestfest;
	}

	public void run(){
		System.out.println("Planeamento da Bilhética de um festival");

		try{
			controller.consultarFestival(introduzFestival());
		}catch(ExcecaoNaoExiste e){
			e.printStackTrace();
		}

		List<LocalDate> datas = controller.getDatas();
		List<TipoBilhete> tipoBilhete = controller.getTipoBilhete();
		for(LocalDate d : datas){
			controller.newPlanoDiario();
			for(TipoBilhete tp : tipoBilhete){
				controller.setPlanoDiario(tp, introduzNumBilhetes(controller.getLotacao(d),tp));
			}
			controller.setPlano(d);
		}

		apresentaDados();

		if(Utils.confirma("Prentende inserir este plano? (S/N)")){
			if(controller.registarPlano()){
				System.out.println("Plano de Bilhética inserido");
			}else {
				System.out.println("Plano não inserido");
			}
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