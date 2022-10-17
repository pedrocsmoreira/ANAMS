package com.anams.Menu;

import java.io.Console;

import com.anams.Model.Clinica;
import com.anams.View.UC5View;
import com.anams.View.UC6View;

public class MenuAA {
    private Clinica clinica;
    private String opcao;

    private static final String STR_DEFAULT = "";

    public MenuAA(Clinica c){
        this.clinica = c;
        this.opcao = STR_DEFAULT;
    }

    public void run() {
        Console console = System.console();
        do {
            System.out.println("\n\n");
            System.out.println("1. Registar Convenções");
            System.out.println("2. Consulta de Informação");
            
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
            }
            
        }
        while (!opcao.equals("0") );
    }
}
