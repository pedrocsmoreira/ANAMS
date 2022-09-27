package com.anams.View;

import com.anams.Controller.UC1Controller;
import com.anams.Model.Clinica;

public class UC1View {
    private Clinica clinica;
    private UC1Controller controller;

    public UC1View(Clinica c){
        this.clinica = c;
        this.controller = new UC1Controller();
    }

    public void run(){
        System.out.println("Insira o código do médico:");
        //int codigo = ;
        
    }
}