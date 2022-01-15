package ui;

import java.io.IOException;
import utils.Utils;
import model.GESTFEST;

/**
 *
 * @author grupo5
 */

public class menuRBF {

    private GESTFEST gestfest;
    private String opcao;

    public menuRBF(GESTFEST gestfest){
        this.gestfest = gestfest;
    }

    public void run() throws IOException{
        do{
            System.out.println("### MENU RBF ###");
            System.out.println("1. Planear Bilhética do Festival");
            System.out.println("0. Sair");

            opcao = Utils.readLineFromConsole("Introduza opção: ");

            if(opcao.equals("1")){
                UC11_UI ui = new UC11_UI(gestfest);
                ui.run();
            }
        }while(!opcao.equals("0"));
    }
}