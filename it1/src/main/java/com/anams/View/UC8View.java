package com.anams.View;

import java.io.Console;

import com.anams.Controller.UC8Controller;
import com.anams.Model.Clinica;

public class UC8View {
    private Console console = System.console();
    private Clinica clinica;
    private UC8Controller controller;

    /**
     * Construtor
     * 
     * @param c
     */
    public UC8View(Clinica c){
        this.clinica = c;
        this.controller = new UC8Controller(clinica);
    }

    public void run(){
        
    }

}
