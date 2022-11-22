package com.anams.View;

import java.io.Console;
import java.util.ArrayList;

import com.anams.Controller.UC7Controller;
import com.anams.Model.Cliente;
import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;
import com.anams.Utils.Data;

public class UC7View {
    private Console console = System.console();
    private Clinica clinica;
    private UC7Controller controller;

    //Adcicionar Especialidade a um Médico

    /**
     * Construtor
     *
     * @param c
     */
    public UC7View(Clinica c){
        this.clinica = c;
        this.controller = new UC7Controller(clinica);
    }

    public void run(){
        System.out.println("---------- Adicionar Especialidade a um Médico ----------");
        getEspecialidades();
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
                }else if(list.size() < 2) {
                    list.add(controller.getEspecialidade(Integer.parseInt(opcao)));
                    break;
                }else {
                    System.out.println("Não pode inserir mais especialidades neste médico!!!!");
                    break;
                }
            }while(!opcao.equalsIgnoreCase("0"));
        }
        return list;
    }



}
