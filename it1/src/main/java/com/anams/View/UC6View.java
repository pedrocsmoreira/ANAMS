package com.anams.View;

import java.io.Console;

import com.anams.Controller.UC6Controller;
import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;

import com.anams.Exception.ExceptionMedico;
import com.anams.Exception.ExceptionEspecialidade;

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
        this.controller = new UC6Controller(clinica);
    }

    public void run(){
        System.out.println("--------- Consultar Informação ----------");
        try{
            mostrarEspecialidades();
            int codigo = Integer.parseInt(console.readLine("Insira o código da especialidade a procurar: "));
            procurarEspecialidade(codigo);
            procurarMedicos();
        }catch (Exception err){
            err.printStackTrace();
        }
    }

    private void mostrarEspecialidades() throws ExceptionEspecialidade{
        System.out.println(controller.verEspecialidades());
    }

    private void procurarEspecialidade(int codigo) throws ExceptionEspecialidade{
        this.controller.verificarCodigo(codigo);
    }

    private void procurarMedicos() throws ExceptionMedico{
        System.out.println(controller.procurarMedicos());
    }



}
