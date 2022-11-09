package com.anams.View;

import java.io.Console;
import com.anams.Model.Clinica;
import com.anams.Controller.UC10Controller;

public class UC10View {
    private Console console = System.console();
    private Clinica clinica;
    private UC10Controller controller;

    /**
     * Construtor
     * 
     * @param c
     */
    public UC10View(Clinica c){
        this.clinica = c;
        this.controller = new UC10Controller(clinica);
    }

    public void run(){

    }

}
