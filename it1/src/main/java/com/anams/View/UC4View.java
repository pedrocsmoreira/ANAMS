package com.anams.View;

import java.io.Console;
import java.util.ArrayList;
import java.util.Optional;

import com.anams.Controller.UC4Controller;
import com.anams.Exception.ExceptionServico.ExceptionServicoExiste;
import com.anams.Model.Clinica;
import com.anams.Model.TipoServico;

public class UC4View {
    private Console console = System.console();
    private Clinica clinica;
    private UC4Controller controller;

    public UC4View(Clinica c){
        this.clinica = c;
        this.controller = new UC4Controller(c);
    }

    /**
     * 
     */
    public void run(){
        System.out.println("---------- Registar Serviços ----------");
        novoServico();
        inserirDados();
        apresentarDados();
        if(validaDados()){
            registarServico();
        }else {
            System.out.println("Serviço não registado!!!");
        }
    }

    /**
     * 
     */
    private void novoServico(){ controller.novoServico(); }

    private void inserirDados(){
        controller.setCodigo(getCodigo());
        controller.setDesignacao(getDesignacao());
        controller.setPreco(getPreco());
        controller.setTipoServico(getTipoServico());
    }

    /**
     * 
     */
    private void apresentarDados() { System.out.println(controller.getServico().toString()); }

    /**
     * @return
     */
    private boolean validaDados() { return console.readLine("Pretende registar este serviço? (Y/N)").equals("Y")  ? true : false; }

    /**
     * @return
     */
    private int getCodigo(){ return Integer.parseInt(console.readLine("Insira o código do serviço: ")); }

    /**
     * @return
     */
    private String getDesignacao(){ return console.readLine("Insira a designação do serviço:"); }

    /**
     * @return
     */
    private float getPreco(){ return Float.parseFloat(console.readLine("Insira o preço do serviço")); }

    private TipoServico getTipoServico(){
        ArrayList<TipoServico> listaTS = clinica.getListaTipoServicos();
        for(TipoServico ts : listaTS){ System.out.println(ts.toString()); }
        int cod =  Integer.parseInt(console.readLine("Insira código do Tipo de Serviço"));
        Optional<TipoServico> optionalVariable = listaTS.stream().filter(element -> element.getCodigo() == cod).findFirst();
        TipoServico ts = optionalVariable.orElseThrow(() -> new NullPointerException());
        return ts;
    }

    private void registarServico(){
        try{
            controller.registarServico();
        }catch (ExceptionServicoExiste err) {
            err.printStackTrace();
        }
    }

}
