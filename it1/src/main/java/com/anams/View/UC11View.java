package com.anams.View;

import java.io.Console;
import com.anams.Model.Clinica;
import com.anams.Controller.UC11Controller;

public class UC11View {
    private Console console = System.console();
    private Clinica clinica;
    private UC11Controller controller;

    /**
     * Construtor
     * 
     * @param c
     */
    public UC11View(Clinica c){
        this.clinica = c;
        this.controller = new UC11Controller(clinica);
    }

    public void run(){
        
    }

}
