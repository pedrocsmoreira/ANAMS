package com.anams.View;

import java.io.Console;

import com.anams.Controller.UC5Controller;
import com.anams.Model.Clinica;
import com.anams.Utils.Data;

public class UC5View {
    private Console console = System.console();
    private Clinica clinica;
    private UC5Controller controller;

    /**
     * 
     * 
     * @param c
     */
    public UC5View(Clinica c){
        this.clinica = c;
        this.controller = new UC5Controller(c);
    }

    /**
     * 
     * 
     */
    public void run(){
        System.out.println("---------- Registar Convenções ----------");
        controller.setCodigo(setCodigo());
        controller.setSigla(setSigla());
        controller.setNome(setNome());
        controller.setDataConvencao(setDataConvencao());
        controller.setWebsite(setWebsite());
        System.out.println("Convenção:");
        System.out.println(controller.getConvencao().toString());
        if(console.readLine("Pretende registar esta convenção? (Y/N)").equals("Y")){
            controller.registarConvencao();
        }else {
            System.out.println("Convenção não registada!!!");
        }
    }

    public int setCodigo() { return Integer.parseInt(console.readLine("Insira o código do serviço: ")); }

    private String setSigla(){ return console.readLine("Insira a sigla do médico: "); }

    private String setNome(){ return console.readLine("Insira o nome do médico: "); }

    public Data setDataConvencao() {
        String strData = console.readLine("Insira a data de convenção (formato dia/mês/ano):");
        String str[] = strData.split("/");
        int day = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int year = Integer.parseInt(str[2]);
        return new Data(day,month,year);
    }

    public String setWebsite() { return console.readLine("Insira o website:"); }

}
