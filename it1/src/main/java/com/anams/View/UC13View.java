package com.anams.View;

import java.io.Console;
import com.anams.Model.Clinica;
import com.anams.Controller.UC13Controller;

//Consultar Vagas para consulta de uma especialidade

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
        
    }

}
