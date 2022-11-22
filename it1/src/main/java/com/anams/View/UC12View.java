package com.anams.View;

import java.io.Console;
import com.anams.Model.Clinica;
import com.anams.Controller.UC12Controller;

public class UC12View {
    private Console console = System.console();
    private Clinica clinica;
    private UC12Controller controller;

    /**
     * Construtor
     * 
     * @param c
     */
    public UC12View(Clinica c){
        this.clinica = c;
        this.controller = new UC12Controller(clinica);
    }

    public void run(){
        System.out.println("---------- Consultar Marcações ----------");
    }

}
