package com.anams.Menu;

import java.io.Console;

import com.anams.Model.AA;
import com.anams.Model.Clinica;
import com.anams.View.UC13View;
import com.anams.View.UC5View;
import com.anams.View.UC6View;

public class MenuAA {
    Console console = System.console();
    private Clinica clinica;
    private String opcao;

    private static final String STR_DEFAULT = "";

    public MenuAA(Clinica c){
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
            System.out.println("1. Registar Convenções");
            System.out.println("2. Consultar Médicos por Especialidade");
            System.out.println("3. Consultar vagas para Consultas por Especialidade");
            
            System.out.println("0. Sair");

            opcao = console.readLine("Introduza opção: ");

            switch(opcao){
                case "1":
                    UC5View ui = new UC5View(this.clinica);
                    ui.run();
                    break;
                case "2":
                    UC6View ui2 = new UC6View(this.clinica);
                    ui2.run();
                    break;
                case "3":
                    UC13View ui13 = new UC13View(this.clinica);
                    ui13.run();
                    break;
            }
            
        }while (!opcao.equals("0") );
    }

}
