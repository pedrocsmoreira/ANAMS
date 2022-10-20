package com.anams.View;

import java.io.Console;

import com.anams.Controller.UC5Controller;
import com.anams.Exception.ExceptionConvencao.ExceptionConvencaoExiste;
import com.anams.Model.Clinica;
import com.anams.Utils.Data;

public class UC5View {
    private Console console = System.console();

    private Clinica clinica;
    private UC5Controller controller;

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
        novaConvencao();
        inserirDados();
        apresentarDados();
        if(console.readLine("Pretende registar esta convenção? (Y/N)").equals("Y")){
            registarConvencao();
        }else {
            System.out.println("Convenção não registada!!!");
        }
    }

    /**
     * 
     */
    private void novaConvencao(){ controller.novaConvencao(); }

    /**
     * 
     */
    private void inserirDados(){
        controller.setCodigo(setCodigo());
        controller.setSigla(setSigla());
        controller.setNome(setNome());
        controller.setDataConvencao(setDataConvencao());
        controller.setWebsite(setWebsite());
    }

    /**
     * 
     */
    private void apresentarDados(){
        System.out.println("Convenção:");
        System.out.println(controller.getConvencao().toString());
    }

    /**
     * 
     * 
     * @return
     */
    public int setCodigo() { return Integer.parseInt(console.readLine("Insira o código do serviço: ")); }

    /**
     * 
     * 
     * @return
     */
    private String setSigla(){ return console.readLine("Insira a sigla do médico: "); }

    /**
     * 
     * 
     * @return
     */
    private String setNome(){ return console.readLine("Insira o nome do médico: "); }

    /**
     * 
     * 
     * @return
     */
    public Data setDataConvencao() {
        String strData = console.readLine("Insira a data de convenção (formato dia/mês/ano):");
        String str[] = strData.split("/");
        int day = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int year = Integer.parseInt(str[2]);
        return new Data(day,month,year);
    }

    /**
     * @return
     */
    public String setWebsite() { return console.readLine("Insira o website:"); }


    /**
     * 
     */
    private void registarConvencao(){
        try{
            controller.registarConvencao();
        }catch (ExceptionConvencaoExiste err) {
            err.printStackTrace();
        }
    }

}
