package ui;

public class UC13_UI{
	private GESTFEST gestfest;
	private consultarBilheticaController controller;

	public UC13_UI(GESTFEST gestfest){
		this.gestfest = gestfest;
	}

	public void run(){
		System.out.println("Consultar Bilhética de um festival");

		try{
			controller.consultarFestival(introduzFestival());
		}catch(ExcecaoNaoExiste e){
			e.printStackTrace();
		}

		apresentaDados();
	}

	private String introduzFestival(){
		return Utils.readLineFromConsole("Insira o festival a trabalhar");
	}

	private void apresentaDados(){
		System.out.println(controller.apresentaDados());
	}
}