package com.anams.View;

import java.io.Console;

import com.anams.Model.Cliente;
import com.anams.Model.Clinica;
import com.anams.Controller.UC12Controller;

public class UC12View {
    private Console console = System.console();
    private Clinica clinica;
    private UC12Controller controller;

    private Cliente cliente;

    /**
     * Construtor
     * 
     * @param c
     */
    public UC12View(Clinica clinica){
        this.clinica = clinica;
        this.cliente = cliente;
        this.controller = new UC12Controller(clinica);
    }

    public void run(Cliente cliente){
        this.cliente = cliente;
        System.out.println("---------- Consultar Marcações ----------");
        procurarMarcacoes();
        
    }

    private void procurarMarcacoes(){

    }




}
