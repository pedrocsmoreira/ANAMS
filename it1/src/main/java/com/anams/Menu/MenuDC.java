package com.anams.Menu;

import java.io.Console;

import com.anams.Model.DC;
import com.anams.Model.Clinica;
import com.anams.View.UC3View;
import com.anams.View.UC4View;
import com.anams.View.UC6View;
import com.anams.View.UC7View;

public class MenuDC {
    Console console = System.console();
    private Clinica clinica;
    private String opcao;

    private static final String STR_DEFAULT = "";

    public MenuDC(Clinica c){
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
        DC diretorClinico = new DC(username, password);
        return clinica.loginDC(diretorClinico);
    }

    private void menu(){
        do {
            System.out.println("\n\n");
            System.out.println("1. Registar Médicos");
            System.out.println("2. Registar Serviços");
            System.out.println("3. Consultar Médicos por Especialidade");
            System.out.println("4. Adicionar Especialidade a um Médico");
            
            System.out.println("0. Sair");

            opcao = console.readLine("Introduza opção: ");

            switch(opcao){
                case "1":
                    UC3View ui3 = new UC3View(this.clinica);
                    ui3.run();
                    break;
                case "2":
                    UC4View ui4 = new UC4View(this.clinica);
                    ui4.run();
                    break;
                case "3":
                    UC6View ui6 = new UC6View(this.clinica);
                    ui6.run();
                    break;
                case "4":
                    UC7View ui7 = new UC7View(this.clinica);
                    ui7.run();
                    break;
            }
        }while (!opcao.equals("0") );
    }

    
}