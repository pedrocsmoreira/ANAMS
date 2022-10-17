package com.anams.Menu;

import java.io.Console;

import com.anams.Model.Clinica;

public class MenuView {
    private Console console = System.console();
    private Clinica clinica;
    private String opcao;

    private static final String STR_DEFAULT = "";

    /**
     * 
     * 
     * @param c
     */
    public MenuView(Clinica c){
        this.clinica = c;
        this.opcao = STR_DEFAULT;
    }

    public void run() {
        Console console = System.console();
        do {
            System.out.println("\n\n");
            System.out.println("1. Diretor Geral");
            System.out.println("2. Diretor Clínico");
            System.out.println("3. Assistente Administrativa");
            
            System.out.println("0. Sair");

            opcao = console.readLine("Introduza opção: ");

            switch(opcao){
                case "1":
                    MenuDG dg = new MenuDG(this.clinica);
                    dg.run();
                    break;
                case "2":
                    MenuDC dc = new MenuDC(this.clinica);
                    dc.run();
                    break;
                case "3":
                    MenuAA aa = new MenuAA(this.clinica);
                    aa.run();
                    break;
            }   
        }while (!opcao.equals("0") );
    }
}
