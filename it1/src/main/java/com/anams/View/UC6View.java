package com.anams.View;

import java.io.Console;
import java.util.ArrayList;

import com.anams.Controller.UC6Controller;
import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;
import com.anams.Model.TipoServico;

import com.anams.Exception.ExceptionMedico.ExceptionMedicoExiste;
import com.anams.Exception.ExceptionMedico.ExceptionMedicoNaoExiste;
import com.anams.Exception.ExceptionServico.ExceptionServicoExiste;
import com.anams.Exception.ExceptionServico.ExceptionServicoNaoExiste;
import com.anams.Exception.ExceptionTipoServico.ExceptionTipoServicoExiste;
import com.anams.Exception.ExceptionTipoServico.ExceptionTipoServicoNaoExiste;
import com.anams.Exception.ExceptionConvencao.ExceptionConvencaoExiste;
import com.anams.Exception.ExceptionConvencao.ExceptionConvencaoNaoExiste;
import com.anams.Exception.ExceptionEspecialidade.ExceptionEspecialidadeExiste;
import com.anams.Exception.ExceptionEspecialidade.ExceptionEspecialidadeNaoExiste;

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
                    consultarMedicos();
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
                default:
                    break;
            }
        }while(!op.equals("0"));
    }

    private void consultarMedicos() {
        System.out.println(this.controller.consultarMedicos());
    }

    private void consultarMedicosEspecialidade() {
        consultarMedicos();
        String op = "";
        do{
            op = console.readLine("Insira o código a Especialidade a consultar: (Use S para sair)");
        }while(!op.equalsIgnoreCase("S"));
        int codigo = Integer.parseInt(op);
        try{
            System.out.println(this.controller.consultarMedicosEspecialidade(codigo));
        }catch (ExceptionEspecialidadeNaoExiste e){
            e.printStackTrace();
        }catch (ExceptionMedicoNaoExiste e){
            e.printStackTrace();
        }
    }

    private void consultarMedicoID() {
        consultarMedicos();
        String op = "";
        do{
            op = console.readLine("Insira o ID a consultar: (Use S para sair)");
        }while(!op.equalsIgnoreCase("S"));
        int id = Integer.parseInt(op);
        try{
            System.out.println(this.controller.consultarMedicoID(id));
        }catch (ExceptionMedicoNaoExiste e){
            e.printStackTrace();
        }
    }

    private void consultarMedicoNome() {
        consultarMedicos();
        String op = "";
        do{
            op = console.readLine("Insira o ID a consultar: (Use S para sair)");
        }while(!op.equalsIgnoreCase("S"));
        try{
            System.out.println(this.controller.consultarMedicoNome(op));
        }catch (ExceptionMedicoNaoExiste e){
            e.printStackTrace();
        }
    }

    private void consultarMedicoCedula() {
        consultarMedicos();
        String op = "";
        do{
            op = console.readLine("Insira o ID a consultar: (Use S para sair)");
        }while(!op.equalsIgnoreCase("S"));
        int cedula = Integer.parseInt(op);
        try{
            System.out.println(this.controller.consultarMedicoCedula(cedula));
        }catch (ExceptionMedicoNaoExiste e){
            e.printStackTrace();
        }
    }

    private void consultarMedicoContacto() {
        consultarMedicos();
        String op = "";
        do{
            op = console.readLine("Insira o ID a consultar: (Use S para sair)");
        }while(!op.equalsIgnoreCase("S"));
        int contacto = Integer.parseInt(op);
        try{
            System.out.println(this.controller.consultarMedicoContacto(contacto));
        }catch (ExceptionMedicoNaoExiste e){
            e.printStackTrace();
        }
    }

    private void consultarMedicoEmail() {
        consultarMedicos();
        String op = "";
        do{
            op = console.readLine("Insira o ID a consultar: (Use S para sair)");
        }while(!op.equalsIgnoreCase("S"));
        try{
            System.out.println(this.controller.consultarMedicoEmail(op));
        }catch (ExceptionMedicoNaoExiste e){
            e.printStackTrace();
        }
    }




    

    private void servicoMenu(){
        String op = "";
        do{
            System.out.println("\n\n");
            System.out.println("1. Consultar Lista de Serviços");
            System.out.println("2. Consultar Serviços por Tipo de Serviço");

            System.out.println("0. Sair");

            op = console.readLine("Introduza opção: ");

            switch(op){
                case "1":
                    consultarServicos();
                    break;
                case "2":
                    consultarServicosTipo();
                    break;
                default:
                    break;
            }
        }while(!op.equals("0"));
    }

    private void consultarServicos(){
        System.out.println(this.controller.consultarServicos());
    }


    private void consultarServicosTipo(){
        consultarTipoServico();
        String op = "";
        do{
            op = console.readLine("Insira o código do Tipo de Serviço a consultar: (Use S para sair)");
        }while(!op.equalsIgnoreCase("S"));
        int codigo = Integer.parseInt(op);
        try{
            System.out.println(this.controller.consultarServicosTipo(codigo));
        }catch (ExceptionTipoServicoNaoExiste e){
            e.printStackTrace();
        }catch (ExceptionServicoNaoExiste e){
            e.printStackTrace();
        }
    }



    private void especialidadeMenu(){
        String op = "";
        do{
            System.out.println("\n\n");
            System.out.println("1. Consultar Lista de Especialidades");

            System.out.println("0. Sair");

            op = console.readLine("Introduza opção: ");

            switch(op){
                case "1":
                    consultarEspecialidades();
                    break;
                default:
                    break;
            }
        }while(!op.equals("0"));
    }

    private void consultarEspecialidades(){
        try{
            System.out.println(this.controller.consultarEspecialidades());
        }catch (ExceptionEspecialidadeNaoExiste e){
            e.printStackTrace();
        }
    }



    private void tipoServicoMenu(){
        String op = "";
        do{
            System.out.println("\n\n");
            System.out.println("1. Consultar Lista de Tipos de Serviços");

            System.out.println("0. Sair");

            op = console.readLine("Introduza opção: ");

            switch(op){
                case "1":
                    consultarTipoServico();
                    break;
                default:
                    break;
            }
        }while(!op.equals("0"));
    }

    private void consultarTipoServico(){
        try{
            System.out.println(this.controller.consultarTipoServico());
        }catch (ExceptionTipoServicoNaoExiste e){
            e.printStackTrace();
        }
    }

    private void convencaoMenu(){
        String op = "";
        do{
            System.out.println("\n\n");
            System.out.println("1. Consultar Lista de Convenções");

            System.out.println("0. Sair");

            op = console.readLine("Introduza opção: ");

            switch(op){
                case "1":
                    consultarConvencoes();
                    break;
                default:
                    break;
            }
        }while(!op.equals("0"));
    }
    
    private void consultarConvencoes(){
        try{
            System.out.println(this.controller.consultarConvencoes());
        }catch (ExceptionConvencaoNaoExiste e){
            e.printStackTrace();
        }
    }



}
