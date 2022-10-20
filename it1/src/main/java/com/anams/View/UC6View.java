package com.anams.View;

import java.io.Console;

import com.anams.Controller.UC6Controller;
import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;

public class UC6View {
    private Console console = System.console();
    private Clinica clinica;
    private UC6Controller controller;

    /**
     * Construtor
     * 
     * @param c
     */
    public UC6View(Clinica c){
        this.clinica = c;
        this.controller = new UC6Controller(c);
    }

    /**
     * Função principal do controller 
     * 
     */
    public void run(){
        String op = "";
        System.out.println("---------- Consultar Informação ----------");
        System.out.println(this.clinica.toString());
        do{
            menu();
            op = console.readLine("Pretende consultar mais informação? (Y/N)");
        }while(!op.equals("Y"));
    }

    private void menu(){
        String op = "";
        do{
            System.out.println("\n\n");
            System.out.println("1. Consultar Informação de Médicos");
            System.out.println("2. Consultar Informação de Serviços");
            System.out.println("3. Consultar Informação de Especialidades");
            System.out.println("4. Consultar Informação de Tipos de Serviço");
            System.out.println("5. Consultar Informação de Convenção");
            
            System.out.println("0. Sair");

            op = console.readLine("Introduza opção: ");

            switch(op){
                case "1":
                    medicoMenu();
                    break;
                case "2":
                    servicoMenu();
                    break;
                case "3":
                    especialidadeMenu();
                    break;
                case "4":
                    tipoServicoMenu();
                    break;
                case "5":
                    convencaoMenu();
                    break;
            }
        }while(!op.equals("0"));
    }

    private void medicoMenu(){
        String op = "";
        do{
            System.out.println("\n\n");
            System.out.println("1. Consultar Lista de Médicos");
            System.out.println("2. Consultar Médicos por Especialidade");
            System.out.println("3. Consultar Médico por ID");
            System.out.println("4. Consultar Médico por Nome");
            System.out.println("5. Consultar Médico por Cédula Profissional");
            System.out.println("6. Consultar Médico por contacto");
            System.out.println("7. Consultar Médico por email");

            System.out.println("0. Sair");

            op = console.readLine("Introduza opção: ");

            switch(op){
                case "1":
                    consultarMedico();
                    break;
                case "2":
                    consultarMedicosEspecialidade();
                    break;
                case "3":
                    consultarMedicoID();
                    break;
                case "4":
                    consultarMedicoNome();
                    break;
                case "5":
                    consultarMedicoCedula();
                    break;
                case "6":
                    consultarMedicoContacto();
                    break;
                case "7":
                    consultarMedicoEmail();
                    break;
            }
        }while(!op.equals("0"));
    }

    private void consultarMedico() {
    }

    private void consultarMedicosEspecialidade() {
    }

    private void consultarMedicoID() {
    }

    private void consultarMedicoNome() {
    }

    private void consultarMedicoCedula() {
    }

    private void consultarMedicoContacto() {
    }

    private void consultarMedicoEmail() {
    }




    

    private void servicoMenu(){
        String op = "";
        do{
            
        }while(!op.equals("0"));
    }

    private void especialidadeMenu(){
        String op = "";
        do{
            
        }while(!op.equals("0"));
    }

    private void tipoServicoMenu(){
        String op = "";
        do{
            
        }while(!op.equals("0"));
    }

    private void convencaoMenu(){
        String op = "";
        do{
            
        }while(!op.equals("0"));
    }



}
