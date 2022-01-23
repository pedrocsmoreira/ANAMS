package ui;

import controller.consultarInformacaoController;
import exceptions.ExcecaoNaoExiste;
import model.GESTFEST;
import utils.Utils;

/**
 *
 * @author grupo5
 */

public class UC06_UI {
    private GESTFEST gestfest;
    private consultarInformacaoController controller;

    public UC06_UI(GESTFEST gestfest){
        this.gestfest = gestfest;
        this.controller = new consultarInformacaoController(gestfest);
    }

    public void run(){
        System.out.println("\nConsultar informação de um festival");
        
        String opcao;
        do{
            System.out.println("1. Consultar Festival por nome");
            System.out.println("2. Consultar Festivais por data");
            System.out.println("0. Sair");

            opcao = Utils.readLineFromConsole("Introduza opção: ");

            if(opcao.equals("1")){
                try{
                    controller.consultarFestival(introduzaNome());
                }catch(ExcecaoNaoExiste e){
                    e.printStackTrace();
                }
            }else if(opcao.equals("2")){
                try{
                    controller.consultarFestival(introduzaData());
                }catch(ExcecaoNaoExiste e){
                    e.printStackTrace();
                }
            }
        }while(!opcao.equals("0") || !opcao.equals("1") || !opcao.equals("2"));
        
        apresentaDados();

        
    }

    public Date introduzaData(){
        return Utils.readLineFromConsole("Introduza o nome do Festival a consultar");
    }

    public String introduzaNome(){
        return Utils.readLineFromConsole("Introduza o nome do Festival a consultar");
    }
    
    public void apresentaDados(){
        System.out.println(controller.apresentarFestival());
    }
}