package com.anams.View;

import java.io.Console;

import com.anams.Model.Cliente;
import com.anams.Model.Clinica;
import com.anams.Controller.UC13Controller;
import com.anams.Exception.ExceptionEspecialidade;
import com.anams.Exception.ExceptionMedico;

public class UC13View {
    private Console console = System.console();
    private Clinica clinica;
    private UC13Controller controller;

    /**
     * Construtor
     * 
     * @param c
     */
    public UC13View(Clinica c){
        this.clinica = c;
        this.controller = new UC13Controller(clinica);
    }

    public void run(){
        System.out.println("---------- Consultar Vagas para consulta de uma Especialidade ----------");
        try{
            mostrarEspecialidades();
            int codigoEspecialidade = Integer.parseInt(console.readLine("Insira o código da especialidade a procurar: "));
            procurarEspecialidade(codigoEspecialidade);
        }catch (Exception err){
            err.printStackTrace();
        }
    }

    private void mostrarEspecialidades() throws ExceptionEspecialidade{
        System.out.println(controller.verEspecialidades());
    }

    private void procurarEspecialidade(int codigo) throws ExceptionEspecialidade{
        this.controller.verificarEspecialidade(codigo);
    }
}
