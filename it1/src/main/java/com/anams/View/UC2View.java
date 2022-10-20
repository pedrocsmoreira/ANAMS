package com.anams.View;

import java.io.Console;
import java.util.ArrayList;

import com.anams.Controller.UC2Controller;
import com.anams.Exception.ExceptionTipoServico.ExceptionTipoServicoExiste;
import com.anams.Model.Clinica;
import com.anams.Model.TipoServico;

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
        String op1 = "";
        String op2 = "";
        System.out.println("---------- Especificar Tipos de Serviço ----------");
        apresentarTiposServico();
        do{
            op1 = console.readLine("Pretende especificar um novo tipo de serviço? (Y/N) ");
            if(op1.equalsIgnoreCase("Y")){
                novoTipoServico();
                inserirTipoServico();
                apresentarDados();
                do{
                    op2 = console.readLine("Pretende inserir este tipo de serviço?");
                    if(op2.equals("Y")){ registaTipoServico(); }
                }while(!op2.equals("Y"));
            }
        }while(!op1.equalsIgnoreCase("Y"));
    }

    /**
     * 
     */
    private void apresentarTiposServico(){
        ArrayList<TipoServico> tiposServico = controller.verTiposServico();
        for(TipoServico ts : tiposServico){ System.out.println(ts.toString());  }
    }

    /**
     * 
     */
    private void novoTipoServico(){ controller.novoTipoServico(); }

    /**
     * 
     */
    private void inserirTipoServico(){
        controller.setNome(getNome());
    }

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
        }catch (ExceptionTipoServicoExiste err) {
            err.printStackTrace();
        }
    }

}
