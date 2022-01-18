package ui;

import controller.registarEntidadeController;
import java.util.HashSet;
import model.GESTFEST;
import utils.Utils;

/**
 *
 * @author grupo5
 */

public class UC01_UI {

    private GESTFEST gestfest;
    private registarEntidadeController controller;

    public UC01_UI(GESTFEST gestfest){
        this.gestfest = gestfest;
        this.controller = new registarEntidadeController(gestfest);
    }

    public void run(){
        System.out.println("\nNova Entidade:");
        controller.novaEntidade();

        controller.setDesignacao(introduzDesignacao());
        controller.setPapeis(introduzPapeis());

        apresentaDados();

        if (Utils.confirma("Confirma os dados da Entidade? (S/N)")) {
            if (controller.registaEntidade()) {
                System.out.println("Entidade registada com sucesso.");
            }else {
                System.out.println("Entidade não registada.");
            }
        }
    }

    private String introduzDesignacao(){
        return Utils.readLineFromConsole("Introduza a designação da Entidade");
    }

    private HashSet<String> introduzPapeis(){
        HashSet<String> papeis = new HashSet<String>();
        do{
            do{
                papeis.add(Utils.readLineFromConsole("Insira os potenciais papéis desta entidade"));
            }while(Utils.confirma("Pretende inserir mais papéis? (S/N)"));
        }while(papeis.equals(new HashSet<String>()));
        return papeis;
    }

    private void apresentaDados(){
        System.out.println("\nEntidade:\n" +  controller.getEntidadeAsString());
    }
}