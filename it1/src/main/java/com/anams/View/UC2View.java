package com.anams.View;

import com.anams.Controller.UC2Controller;
import com.anams.Model.Clinica;

public class UC2View {
    private Clinica clinica;
    private UC2Controller controller;

    public UC2View(Clinica c){
        this.clinica = c;
        this.controller = new UC2Controller();
    }

    public void run(){
        System.out.println("Insira o código do serviço:");
        //int codigo = ;
        
    }
}