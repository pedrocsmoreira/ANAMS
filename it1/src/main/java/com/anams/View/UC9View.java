package com.anams.View;

import java.io.Console;
import com.anams.Model.Clinica;
import com.anams.Controller.UC9Controller;

public class UC9View {
    private Console console = System.console();
    private Clinica clinica;
    private UC9Controller controller;

    //Registo de Calendário

    /**
     * Construtor
     * 
     * @param c
     */
    public UC9View(Clinica c){
        this.clinica = c;
        this.controller = new UC9Controller(clinica);
    }

    public void run(){
        
    }

}
