package com.anams.Menu;

import java.io.Console;

import com.anams.Model.Cliente;
import com.anams.Model.Clinica;
import com.anams.Utils.Data;
import com.anams.View.UC11View;
import com.anams.View.UC12View;
import com.anams.View.UC13View;

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
        }while (!opcao.equals("0") );
    }

    private boolean login(){
        String username = console.readLine();
        String password = console.readLine();
        //cliente login
        return false;
    }

    private void registar(){
        String nome = console.readLine("Insira o nome do cliente: ");
        String endereco = console.readLine("Insira a morada do Cliente: ");
        int nif = Integer.parseInt(console.readLine("Insira o NIF do Cliente: "));
        Data dataNascimento = new Data();
        int contacto = Integer.parseInt(console.readLine("Insira o contacto do Cliente: "));
        String email = console.readLine("Insira o email do Cliente: ");
        Cliente cl = new Cliente(nome, endereco, nif, dataNascimento, contacto, email);

    }

    private void menu(){
        System.out.println("--------- Menu Cliente ----------");
        do {
            System.out.println("\n\n");
            System.out.println("1. Efetuar Marcação");
            System.out.println("2. Consultar Marcações");
            System.out.println("3. Consultar vagas para Consultas por Especialidade");

            System.out.println("0. Sair");

            opcao = console.readLine("Introduza opção: ");

            switch(opcao){
                case "1":
                    UC11View ui11 = new UC11View(this.clinica);
                    ui11.run();
                    break;
                case "2":
                    UC12View ui12 = new UC12View(this.clinica);
                    ui12.run();
                    break;
                case "3":
                    UC13View ui13 = new UC13View(this.clinica);
                    ui13.run();
                    break;
            }   
        }while (!opcao.equals("0") );
    }
}
