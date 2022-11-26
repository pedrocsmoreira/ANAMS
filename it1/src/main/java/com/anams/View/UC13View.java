package com.anams.View;

import java.io.Console;

import com.anams.Model.Cliente;
import com.anams.Model.Clinica;
import com.anams.Controller.UC13Controller;

public class UC13View {
    private Console console = System.console();
    private Clinica clinica;
    private UC13Controller controller;

    private Cliente cliente;

    /**
     * Construtor
     * 
     * @param c
     */
    public UC13View(Clinica c){
        this.clinica = c;
        this.controller = new UC13Controller(clinica);
    }

    public void run(Cliente cliente){
        this.cliente = cliente;
        System.out.println("---------- Consultar Vagas para consulta de uma Especialidade ----------");
    }

}
