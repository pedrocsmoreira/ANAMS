package com.anams.Menu;

import java.io.Console;

import com.anams.Model.DG;
import com.anams.Model.Clinica;
import com.anams.View.UC1View;
import com.anams.View.UC2View;
import com.anams.View.UC6View;

public class MenuDG {
    Console console = System.console();
    private Clinica clinica;
    private String opcao;

    private static final String STR_DEFAULT = "";

    public MenuDG(Clinica c){
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
        DG diretorGeral = new DG(username, password);
        return clinica.loginDG(diretorGeral);
    }

    private void menu(){
        do {
            System.out.println("\n\n");
            System.out.println("1. Especificar Especialidades");
            System.out.println("2. Especificar Tipos de Serviço");
            System.out.println("3. Consultar Médicos por Especialidade");
            
            System.out.println("0. Sair");

            opcao = console.readLine("Introduza opção: ");

            switch(opcao){
                case "1":
                    UC1View ui1 = new UC1View(this.clinica);
                    ui1.run();
                    break;
                case "2":
                    UC2View ui2 = new UC2View(this.clinica);
                    ui2.run();
                    break;
                case "3":
                    UC6View ui6 = new UC6View(this.clinica);
                    ui6.run();
                    break;
            }            
        }while (!opcao.equals("0") );
    }

}
