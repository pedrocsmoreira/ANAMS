package com.anams.View;

import java.io.Console;

import com.anams.Controller.UC6Controller;
import com.anams.Model.Clinica;

public class UC6View {
    private Console console = System.console();

    private Clinica clinica;
    private UC6Controller controller;

    public UC6View(Clinica c){
        this.clinica = c;
        this.controller = new UC6Controller(c);
    }

    public void run(){
        System.out.println("---------- Consultar Informação ----------");
        
        
    }
}
