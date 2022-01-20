package ui;

import controller.especificarEntidadesController;
import model.GESTFEST;
import utils.Utils;

/**
 *
 * @author grupo5
 */

public class UC02_UI {
    private GESTFEST gestfest;
    private especificarEntidadesController controller;

    public UC02_UI(GESTFEST gestfest){
        this.gestfest = gestfest;
        controller = new especificarEntidadesController(gestfest);
    }

    public void run(){
    	System.out.println("\nEspecificar tipos de Entidades:");

        do{
            controller.novoTipoEntidade();
            String tipo = introduzDados();
            controller.setTipoEntidade(tipo);
            controller.adicionaTipoEntidade();
        }while(Utils.confirma("Pretende adicionar mais tipos de Entidades? (S/N)"));

        apresentaDados();

        if(Utils.confirma("Pretende inserir estes tipos de Entidades? (S/N)")){
            if(controller.inserirEntidades()){
                System.out.println("Tipos de Entidades inseridos");
            }else {
                System.out.println("Tipos de Entidades não inseridos");
            }
        }
    }

    public String introduzDados(){
        return Utils.readLineFromConsole("Insira tipo de Entidades a inserir: ");
    }

    public void apresentaDados(){
        System.out.println("\nEntidades: ");
        System.out.println(controller.getEntidadesAsString());
    }
}