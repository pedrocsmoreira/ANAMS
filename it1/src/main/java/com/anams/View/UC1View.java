package com.anams.View;

import java.io.Console;

import com.anams.Controller.UC1Controller;
import com.anams.Model.Clinica; 
import com.anams.Model.Medico;

public class UC1View {
    private Console console = System.console();

    private Clinica clinica;
    private UC1Controller controller;

    public UC1View(Clinica c){
        this.clinica = c;
        this.controller = new UC1Controller(c);
    }

    public void run(){
        System.out.println("---------- Especificar Especialidades ----------");
        
        
    }

    
















    /*
        private Medico procurarMedicoMenu(){
            Medico m = new Medico();
            String opcao = "";
            do{
                System.out.println("1 - Pesquisar Médico por código");
                System.out.println("2 - Pesquisar Médico por nome");
                System.out.println("3 - Pesquisar Médico por cédula profissional");
                System.out.println("4 - Pesquisar por NIF");

                System.out.println("0 - Sair");
                opcao = console.readLine();

                switch(opcao){
                    case "1":
                        m = procurarMedicoCodigo();
                        break;
                    case "2":
                        m = procurarMedicoNome();
                        break;
                    case "3":
                        m = procurarMedicoCedula();
                        break;
                    case "4":
                        m = procurarMedicoNif();
                        break;
                    default:
                        break;
                }
            }while(false);
            return m;
        }

        private Medico procurarMedicoCodigo(){
            int codigo = Integer.parseInt(console.readLine("Insira o código a procurar: "));
            return controller.procurarMedicoCodigo(codigo);
        }

        private Medico procurarMedicoNome(){
            String nome = console.readLine("Insira o nome a procurar: ");
            return controller.procurarMedicoNome(nome);
        }

        private Medico procurarMedicoCedula(){
            int cedula = Integer.parseInt(console.readLine("Insira a cédula profissional a procurar: "));
            return controller.procurarMedicoCedula(cedula);
        }

        private Medico procurarMedicoNif(){
            int nif = Integer.parseInt(console.readLine("Insira o NIF a procurar: "));
            return controller.procurarMedicoNif(nif);
        }
     */

}