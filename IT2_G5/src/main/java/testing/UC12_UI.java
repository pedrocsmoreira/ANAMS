package ui;

public class UC11_UI{
	private GESTFEST gestfest;
	private comprarBilhetesController controller;

	public UC11_UI(GESTFEST gestfest){
		this.gestfest = gestfest;
	}

	public void run(){
		System.out.println("Compra de Bilhetes");

		controller.procuraFestival(introduzFestival());

		ArrayList<TipoBilhete> tipoBilhete = controller.getTipoBilhete();
		for (TipoBilhete tp : tipoBilhete) {
			System.out.println(tp);
		}
		controller.setTipoBilhete(introduzTipoBilhete(tipoBilhete.length()));

		controller.setNumBilhetes(introduzNumBilhetes(controller.getBilhetesDisponiveis()));

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

	private int introduzTipoBilhete(int num){
		int a = 0;
		do{
			a = Utils.IntFromConsole("Insira o número do tipo de Bilhete que pretende aquirir");
		}while(a < 0 || a > num);
		return a;
	}

	private int introduzNumBilhetes(int numBilhetes){
		System.out.println("Existem " + numBilhetes + " bilhetes disponíveis do tipo selecionado");
		int a = 0;
		if(Utils.confirma("Pretende aquirir bilhetes deste tipo?")){
			do{
				a = Utils.IntFromConsole("Insira o número de bilhetes que pretende aquirir");
			}while(a < 0 || a > numBilhetes);
		}
		return a;
	}
}