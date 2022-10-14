package com.anams.View;

import java.io.Console;
import java.util.ArrayList;

import com.anams.Controller.UC1Controller;
import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;
import com.anams.Utils.Data;

public class UC1View {
    private Console console = System.console();
    private Clinica clinica;
    private UC1Controller controller;

    public UC1View(Clinica c){
        this.clinica = c;
        this.controller = new UC1Controller(c);
    }

    public void run(){
        String opcao = "";
        System.out.println("---------- Especificar Especialidades ----------");
        apresentarEspecialidades();
        do{
            opcao = console.readLine("Pretende especificar uma nova especialidade?? (Y/N) ");
            if(opcao.equals("Y")){
                controller.novaEspecialidade();
                inserirEspecialidade();
                apresentarDados();
            }
        }while(opcao != "N");
    }

    private void apresentarEspecialidades() {
        ArrayList<Especialidade> especialidades = controller.verEspecialidades();
        for(Especialidade e : especialidades){ System.out.println(e.toString()); }
    }

    private void inserirEspecialidade(){ 
        controller.setCodigo(getCodigo());
        controller.setDesignacao(getDesignacao());
        controller.setAcronimo(getAcronimo());
        controller.setDataArranque(getDataArranque());
    }

    private int getCodigo() { return Integer.parseInt(console.readLine("Insira o código da nova especialidade: ")); }

    private String getDesignacao() { return console.readLine("Insira a designação da nova especialidade: "); }

    private String getAcronimo() { return console.readLine("Insira o acrónimo da nova especialidade: "); }

    private Data getDataArranque(){
        String strData = console.readLine("Insira a data de arranque (formato dia/mês/ano):");
        String str[] = strData.split("/");
        int day = Integer.parseInt(str[0]);
        int month = Integer.parseInt(str[1]);
        int year = Integer.parseInt(str[2]);
        return new Data(day,month,year);
    }

    private void apresentarDados() { System.out.println(controller.getDados().toString()); }



}
