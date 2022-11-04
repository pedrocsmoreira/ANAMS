package com.anams.Menu;

import java.io.Console;


import com.anams.Model.Clinica;

public class MenuCliente {
    Console console = System.console();
    private Clinica clinica;
    private String opcao;

    private static final String STR_DEFAULT = "";

    public MenuCliente(Clinica c){
        this.clinica = c;
        this.opcao = STR_DEFAULT;
    }

    public void run(){
        System.out.println("--------- Menu Cliente ----------");
        do {
            System.out.println("\n\n");
            System.out.println("1. Login");
            System.out.println("2. Registo");
            
            System.out.println("0. Sair");

            opcao = console.readLine("Introduza opção: ");

            switch(opcao){
                case "1":
                    login();
                    break;
                case "2":
                    registar();
                    break;
            }
            
        }
        while (!opcao.equals("0") );
    }

    private boolean login(){
        String username = console.readLine();
        String password = console.readLine();
        //cliente login
        return false;
    }

    private void registar(){

    }

    private void menu(){
        System.out.println("--------- Menu Cliente ----------");
        do {
            System.out.println("\n\n");
            System.out.println("1. Efetuar Marcação");
            System.out.println("2. Consultar Marcações");
            
            System.out.println("0. Sair");

            opcao = console.readLine("Introduza opção: ");

            switch(opcao){
                case "1":
                    login();
                    break;
                case "2":
                    registar();
                    break;
            }
            
        }
        while (!opcao.equals("0") );
    }
}
