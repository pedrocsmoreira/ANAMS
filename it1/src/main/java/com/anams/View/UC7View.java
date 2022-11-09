package com.anams.View;

import java.io.Console;

import com.anams.Controller.UC7Controller;
import com.anams.Model.Clinica;

public class UC7View {
    private Console console = System.console();
    private Clinica clinica;
    private UC7Controller controller;

    /**
     * Construtor
     * 
     * @param c
     */
    public UC7View(Clinica c){
        this.clinica = c;
        this.controller = new UC7Controller(clinica);
    }

    public void run(){
        
    }

}
