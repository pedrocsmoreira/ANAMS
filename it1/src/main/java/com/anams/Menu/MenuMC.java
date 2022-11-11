package com.anams.Menu;

import java.io.Console;

import com.anams.Model.AA;
import com.anams.Model.Clinica;
import com.anams.View.UC9View;
import com.anams.View.UC10View;

public class MenuMC {
    Console console = System.console();
    private Clinica clinica;
    private String opcao;

    private static final String STR_DEFAULT = "";

    public MenuMC(Clinica c){
        this.clinica = c;
        this.opcao = STR_DEFAULT;
    }

    public void run() {
        if(login()){
            menu();
        }
    }

    private boolean login(){
        String username = console.readLine("Insira o username: ");
        String password = console.readLine("Insira a password: ");
        AA assistenteAdministrativa = new AA(username, password);
        return clinica.loginAA(assistenteAdministrativa);
    }

    private void menu() {
        System.out.println("--------- Menu Assistente Administrativa ----------");
        do {
            System.out.println("\n\n");
            System.out.println("1. Registar Calendário");
            System.out.println("2. Consultar Calendário de Marcações");
            
            System.out.println("0. Sair");

            opcao = console.readLine("Introduza opção: ");

            switch(opcao){
                case "1":
                    UC9View ui9 = new UC9View(this.clinica);
                    ui9.run();
                    break;
                case "2":
                    UC10View ui10 = new UC10View(this.clinica);
                    ui10.run();
                    break;
            }
        }while (!opcao.equals("0") );
    }

}
