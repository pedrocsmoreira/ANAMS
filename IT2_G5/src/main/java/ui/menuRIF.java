package ui;

import java.io.IOException;
import utils.Utils;
import model.GESTFEST;

/**
 *
 * @author grupo5
 */

public class menuRIF {

    private GESTFEST gestfest;
    private String opcao;

    public menuRIF(GESTFEST gestfest){
        this.gestfest = gestfest;
    }

    public void run() throws IOException{
        do{
            System.out.println("### MENU RESPONSAVEL ###");
            System.out.println("1. Registar Festival");
            System.out.println("2. Associar Entidade a Festival");
            System.out.println("3. Consultar Informação Festival");
            System.out.println("0. Sair");
            
            opcao = Utils.readLineFromConsole("Introduza opção: ");
            
            if(opcao.equals("1")){
                UC04_UI ui = new UC04_UI(gestfest);
                ui.run();
            }else if(opcao.equals("2")){
                UC05_UI ui = new UC05_UI(gestfest);
                ui.run();
            }else if(opcao.equals("3")){
                menuRPF ui = new menuRPF(gestfest);   
                ui.run();
            }
        }while(!opcao.equals("0"));
    }
}