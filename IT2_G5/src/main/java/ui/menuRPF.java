package ui;

import java.io.IOException;
import utils.Utils;
import model.GESTFEST;

/**
 *
 * @author grupo5
 */

public class menuRPF {

    private GESTFEST gestfest;
    private String opcao;

    public menuRPF(GESTFEST gestfest){
        this.gestfest = gestfest;
    }

    public void run() throws IOException{
        do{
            System.out.println("### MENU RPF ###");
            System.out.println("1. Convidar Artista");
            System.out.println("2. Criar programa do Festival");
            System.out.println("0. Sair");

            opcao = Utils.readLineFromConsole("Introduza opção: ");

            if(opcao.equals("1")){
                UC07_UI ui = new UC07_UI(gestfest);
                ui.run();
            }else if(opcao.equals("2")){
                UC08_UI ui = new UC08_UI(gestfest);
                ui.run();
            }
        }while(!opcao.equals("0"));
    }
}