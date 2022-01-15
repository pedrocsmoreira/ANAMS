package ui;

import java.io.IOException;
import utils.Utils;
import model.GESTFEST;

/**
 *
 * @author grupo5
 */

public class menuUNR {

    private GESTFEST gestfest;
    private String opcao;

    public menuUNR(GESTFEST gestfest){
        this.gestfest = gestfest;
    }

    public void run() throws IOException{
        do{
            System.out.println("### MENU UTILIZADOR NÃO REGISTADO ###");
            System.out.println("1. Comprar Bilhete");
            System.out.println("0. Sair");

            opcao = Utils.readLineFromConsole("Introduza opção: ");

            if(opcao.equals("1")){
                UC12_UI ui = new UC12_UI(gestfest);
                ui.run();
            }
        }while(!opcao.equals("0"));
    }
}