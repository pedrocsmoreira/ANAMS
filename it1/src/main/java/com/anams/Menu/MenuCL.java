package com.anams.Menu;

import java.io.Console;

import com.anams.Model.Cliente;
import com.anams.Model.Clinica;
import com.anams.Utils.Data;
import com.anams.View.UC11View;
import com.anams.View.UC12View;
import com.anams.View.UC13View;

public class MenuCL {
    Console console = System.console();
    private Clinica clinica;
    private String opcao;

    private Cliente cliente;

    private static final String STR_DEFAULT = "";

    public MenuCL(Clinica c){
        this.clinica = c;
        this.opcao = STR_DEFAULT;
    }

    public void run(){
        if(verificarClientes()){
            if(login()){
                menu();
            }
        }
    }

    private boolean verificarClientes() {
        if(!controller.verificarClientes()) {
            return false;
        }
        return true;
    }

    private boolean login(){
        String username = console.readLine();
        String password = console.readLine();
        Cliente tentativa = new Cliente();
        if(!cliente-login(tentativa)){
            return false;
        }
        cliente = tentativa;
        return true;
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
                    UC11View ui11 = new UC11View(this.clinica, cliente);
                    ui11.run(cliente);
                    break;
                case "2":
                    UC12View ui12 = new UC12View(this.clinica, cliente);
                    ui12.run();
                    break;
                case "3":
                    UC13View ui13 = new UC13View(this.clinica, cliente);
                    ui13.run();
                    break;
                default:
                    System.out.println("Opção Inválida!!!!");
                    break;
            }
        }while (!opcao.equalsIgnoreCase("0") );
    }

}
