package com.anams.View;

import java.io.Console;

import com.anams.Controller.UC5Controller;
import com.anams.Model.Clinica;

public class UC5View {
    private Console console = System.console();

    private Clinica clinica;
    private UC5Controller controller;

    public UC5View(Clinica c){
        this.clinica = c;
        this.controller = new UC5Controller(c);
    }

    public void run(){
        System.out.println("---------- Consultar Informação ----------");
        
        
    }
}
