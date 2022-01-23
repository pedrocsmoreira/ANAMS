package ui;

import java.io.IOException;
import utils.Utils;
import model.GESTFEST;

/**
 *
 * @author grupo5
 */

public class menuAPG {

    private GESTFEST gestfest;
    private String opcao;

    public menuAPG(GESTFEST gestfest){
        this.gestfest = gestfest;
    }

    public void run() throws IOException{
        do{
            System.out.println("### MENU ADMINISTRADOR ###");
            System.out.println("1. Registar Entidade");
            System.out.println("2. Especificar Entidades");
            System.out.println("3. Especificar Bilhetes");
            System.out.println("4. Consultar Informação Festival");
            System.out.println("0. Sair");

            opcao = Utils.readLineFromConsole("Introduza opção: ");

            if(opcao.equals("1")){
                UC01_UI ui = new UC01_UI(gestfest);
                ui.run();
            }else if(opcao.equals("2")){
                UC02_UI ui = new UC02_UI(gestfest);
                ui.run();
            }else if(opcao.equals("3")){
                UC03_UI ui = new UC03_UI(gestfest);
                ui.run();
            }else if(opcao.equals("4")){
                UC06_UI ui = new UC06_UI(gestfest);
                ui.run();
            }
        }while(!opcao.equals("0"));
    }
}