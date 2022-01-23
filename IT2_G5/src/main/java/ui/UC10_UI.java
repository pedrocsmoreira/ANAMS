package ui;

import controller.consultarProgramaController;
import exceptions.ExcecaoNaoExiste;
import exceptions.ExcecaoProgramaNaoExiste;
import model.GESTFEST;
import utils.Utils;

/**
 *
 * @author grupo5
 */

public class UC10_UI {
    private GESTFEST gestfest;
    private consultarProgramaController controller;

    public UC10_UI(GESTFEST gestfest){
        this.gestfest = gestfest;
    }

    public void run(){
        System.out.println("Consultar programa do festival");
        
        try{
            controller.procurarPrograma(inserirFestival());
        }catch(ExcecaoNaoExiste e){
            e.printStackTrace();
        }catch(ExcecaoProgramaNaoExiste e){
            e.printStackTrace();
        }
        
        apresentarDados();
    }

    public String inserirFestival(){
        return Utils.readLineFromConsole("Insira o nome do festival a procurar");
    }

    public void apresentarDados(){
        System.out.println(controller.dadosPrograma());
    }
}