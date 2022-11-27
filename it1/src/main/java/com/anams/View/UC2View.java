package com.anams.View;

import java.io.Console;

import com.anams.Controller.UC2Controller;
import com.anams.Exception.ExceptionTipoServico;
import com.anams.Model.Clinica;

public class UC2View {
    private Console console = System.console();
    private Clinica clinica;
    private UC2Controller controller;

    public UC2View(Clinica c){
        this.clinica = c;
        this.controller = new UC2Controller(c);
    }

    /**
     * 
     */
    public void run(){
        String opcao = "";
        System.out.println("---------- Especificar Tipos de Serviço ----------");
        apresentarTiposServico();
        do{
            opcao = console.readLine("Pretende especificar um novo tipo de serviço? (Y/N) ");
            if(opcao.equalsIgnoreCase("Y")){
                novoTipoServico();
                inserirTipoServico();
                apresentarDados();
                if(console.readLine("Pretende inserir este tipo de serviço?").equals("")){
                    registaTipoServico();
                }else{
                    System.out.println("Tipo de Serviço não registado!!!");
                }
            }
        }while(!opcao.equalsIgnoreCase("N"));
    }

    /**
     * 
     */
    private void apresentarTiposServico() { System.out.println(controller.verTiposServico()); }

    /**
     * 
     */
    private void novoTipoServico() { controller.novoTipoServico(); }

    /**
     * 
     */
    private void inserirTipoServico() { controller.setNome(getNome()); }

    /**
     * @return
     */
    private String getNome() { return console.readLine("Insira o nome do Tipo de Serviço: "); }

    /**
     * 
     */
    private void apresentarDados() { System.out.println(controller.apresentarDados().toString()); }

    /**
     * 
     */
    private void registaTipoServico() {
        try{
            controller.registaTipoServico();
        }catch (ExceptionTipoServico err) {
            err.printStackTrace();
        }
    }

}
