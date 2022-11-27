package com.anams.View;

import java.io.Console;
import java.util.ArrayList;

import com.anams.Controller.UC7Controller;
import com.anams.Exception.ExceptionMedico;
import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;

public class UC7View {
    private Console console = System.console();
    private Clinica clinica;
    private UC7Controller controller;

    public UC7View(Clinica c){
        this.clinica = c;
        this.controller = new UC7Controller(clinica);
    }

    public void run(){
        System.out.println("---------- Adicionar Especialidade a um Médico ----------");
        try {
            inserirMedicos();
            controller.adicionarEspecialidades(getEspecialidades());
            System.out.println(controller.verNovasEspecialidades());
            String opcao = console.readLine("Pretende registar as novas especialidades (Y/N): ");
            if(opcao.equalsIgnoreCase("y")){
                controller.registarEspecialidades();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void inserirMedicos() throws ExceptionMedico{
        System.out.println(controller.procurarMedicos());
        int codigoMedico = 0;
        do{
            codigoMedico = Integer.parseInt(console.readLine("Insira o código do médico a marcar: "));
        }while(codigoMedico <= 0);
        this.controller.verificarMedico(codigoMedico);
    }

    private ArrayList<Especialidade> getEspecialidades() {
        ArrayList<Especialidade> list = new ArrayList<Especialidade>();
        if(controller.verificarEspecialidades()) {
            System.out.println("Não existem especialidades para atribuir!!!");
        }else {
            String opcao = "";
            do{
                System.out.println(controller.verEspecialidades());
                opcao = console.readLine("Insira o número da especialidade a inserir (ou 0 para sair)");
                if(opcao.equalsIgnoreCase("0")){
                    break;
                }else{
                    list.add(controller.getEspecialidade(Integer.parseInt(opcao)));
                }
            }while(!opcao.equalsIgnoreCase("0"));
        }
        return list;
    }



}
