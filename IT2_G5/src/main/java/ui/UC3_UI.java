package ui;

import model.GESTFEST;
import controller.especificarBilhetesController;
import utils.Utils;

/**
 *
 * @author grupo5
 */

public class UC3_UI {
    private GESTFEST gestfest;
    private especificarBilhetesController controller;

    public UC3_UI(GESTFEST gestfest){
        this.gestfest = gestfest;
        controller = new especificarBilhetesController(gestfest);
    }

    public void run(){
    	System.out.println("\nEspecificar Bilhetes");

    	do{
            controller.novoTipoBilhete();
            controller.setTipoBilhete(introduzDados());
            controller.adicionaTipoBilhete();
    	}while(Utils.confirma("Pretende adicionar mais tipos de Bilhetes? (S/N)"));

    	apresentaDados();

    	if(Utils.confirma("Deseja inserir estes tipos de Bilhete? (S/N)")){
            if(controller.inserirTiposBilhete()){
                System.out.println("Tipos de Bilhetes inseridos");
            }else {
                System.out.println("Tipos de Bilhetes não inseridos");
            }
    	}
    }

    public String introduzDados(){
    	return Utils.readLineFromConsole("Insira tipo de Bilhetes a inserir");
    }

    public void apresentaDados(){
        System.out.println("\nBilhetes: ");
    	System.out.println(controller.getBilhetesAsString());
    }
}