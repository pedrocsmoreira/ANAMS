package com.anams.View;

import java.io.Console;
import java.util.ArrayList;

import com.anams.Controller.UC3Controller;
import com.anams.Exception.ExceptionMedico.ExceptionMedicoExiste;
import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;
import com.anams.Model.Medico;
import com.anams.Utils.Data;

public class UC3View {
    private Console console = System.console();
    private Clinica clinica;
    private UC3Controller controller;

    public UC3View(Clinica c){
        this.clinica = c;
        this.controller = new UC3Controller(clinica);
    }

    public void run(){
        System.out.println("---------- Registar Médicos ----------");
        inserirDados();
        apresentaDados();
        if(validaDados()){
            registarMedico();
        }else {
            System.out.println("Médico não registado!!!");
        }
    }

    private void inserirDados(){
        controller.setCodigo(getCodigo());
        controller.setNome(getNome());
        controller.setDataContratacao(getData());
        controller.setNif(getNif());
        controller.setCedula(getCedula());
        controller.setEspecialidades(getEspecialidades());
        controller.setEmail(getEmail());
        controller.setContacto(getContacto());
    }

    private void apresentaDados(){ System.out.println(controller.getMedico().toString()); }

    private boolean validaDados() { return console.readLine("Pretende registar este médico? (Y/N)").equals("Y")  ? true : false;  }
    
    private int getCodigo(){ return Integer.parseInt(console.readLine("Insira o código do médico:")); }

    private String getNome(){ return console.readLine("Insira o nome do médico:"); }

    private Data getData(){
        String strData = console.readLine("Insira a data de contratação (formato dia/mês/ano):");
        String str[] = strData.split("/");
        int day = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int year = Integer.parseInt(str[2]);
        return new Data(day,month,year);
    }

    private int getNif(){ return Integer.parseInt(console.readLine("Insira NIF do médico")); }

    private int getCedula(){ return Integer.parseInt(console.readLine("Insira o número da cédula profissional:")); }

    private ArrayList<Especialidade> getEspecialidades(){
        ArrayList<Especialidade> especialidades = clinica.getListaEspecialidades();
        ArrayList<Especialidade> list = new ArrayList<Especialidade>();
        String opcao;
        do{
            for(Especialidade e : especialidades){ System.out.println(e.toString()); }
            opcao = console.readLine("Insira o número da especialidade a inserir (ou 0 para sair)");
            if(list.size() < 2){
                list.add(especialidades.get(Integer.parseInt(opcao)));
            }else {
                System.out.println("Não pode inserir mais especialidades neste médico!!!!");
                opcao = "0";
            }
        }while(!opcao.equals("0"));
        return list;
    }

    private String getEmail(){ return console.readLine("Insira o email do médico:"); }

    private int getContacto(){ return Integer.parseInt(console.readLine("Insira o contacto do médico:")); }

    private void registarMedico(){
        try{
            controller.registarMedico();
        }catch (ExceptionMedicoExiste err){
            err.printStackTrace();
        }
    }

}
