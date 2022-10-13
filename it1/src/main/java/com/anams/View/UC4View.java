package com.anams.View;

import java.io.Console;

import com.anams.Controller.UC4Controller;
import com.anams.Model.Clinica;

public class UC4View {
    private Console console = System.console();

    private Clinica clinica;
    private UC4Controller controller;

    public UC4View(Clinica c){
        this.clinica = c;
        this.controller = new UC4Controller(c);
    }

    public void run(){
        System.out.println("---------- Consultar Informação ----------");
        
        
    }
}