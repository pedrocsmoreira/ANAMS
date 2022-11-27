package com.anams.View;

import java.io.Console;

import com.anams.Model.Cliente;
import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;
import com.anams.Controller.UC11Controller;
import com.anams.Exception.ExceptionEspecialidade;
import com.anams.Exception.ExceptionMedico;

public class UC11View {
    private Console console = System.console();
    private Clinica clinica;
    private UC11Controller controller;

    private Cliente cliente;

    /**
     * Construtor
     * 
     * @param c
     */
    public UC11View(Clinica clinica){
        this.clinica = clinica;
        this.controller = new UC11Controller(clinica);
    }

    public void run(Cliente cliente){
        this.cliente = cliente;
        System.out.println("---------- Efetuar Marcação ----------");
        inserirDados();
    }

    private void novaMarcacao(){
        controller.novaMarcacao();
    }

    private void inserirDados(){
        try{
            mostrarEspecialidades();
            int codigo = Integer.parseInt(console.readLine("Insira o código da especialidade a procurar: "));
            procurarEspecialidade(codigo);
            procurarMedicos();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void mostrarEspecialidades() throws ExceptionEspecialidade{
        System.out.println(controller.verEspecialidades());
    }

    private void procurarEspecialidade(int codigo) throws ExceptionEspecialidade{
        this.controller.verificarEspecialidade(codigo);
    }

    private void procurarMedicos() throws ExceptionMedico{
        System.out.println(controller.procurarMedicos());
    }

}
