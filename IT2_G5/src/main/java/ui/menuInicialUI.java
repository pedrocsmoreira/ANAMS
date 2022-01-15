package ui;

import java.io.IOException;
import utils.Utils;
import model.GESTFEST;

/**
 *
 * @author grupo5
 */

public class menuInicialUI {

    private GESTFEST gestfest;
    private String opcao;

    public menuInicialUI(GESTFEST gestfest){
        this.gestfest = gestfest;
    }

    public void run() throws IOException{
        do{
            System.out.println("### MENU PRINCIPAL ###");
            System.out.println("1. Administrador da Plataforma");
            System.out.println("2. Responsável pelo Festival");
            System.out.println("3. Responsável pela Programação");
            System.out.println("4. Responsável pela Bilhética");
            System.out.println("0. Sair");

            opcao = Utils.readLineFromConsole("Introduza opção: ");

            if(opcao.equals("1")){
                menuAPG ui = new menuAPG(gestfest);
                ui.run();
            }else if(opcao.equals("2")){
                menuRIF ui = new menuRIF(gestfest);
                ui.run();
            }else if(opcao.equals("3")){
                menuRPF ui = new menuRPF(gestfest);
                ui.run();
            }else if(opcao.equals("4")){
                menuRBF ui = new menuRBF(gestfest);
                ui.run();
            }
        }while(!opcao.equals("0"));
    }
}