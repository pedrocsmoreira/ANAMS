package com.anams.View;

import com.anams.Controller.UC3Controller;
import com.anams.Model.Clinica;

public class UC3View {
    private Clinica clinica;
    private UC3Controller controller;

    public UC3View(Clinica c){
        this.clinica = c;
        this.controller = new UC3Controller();
    }

    public void run(){
        System.out.println("Insira o código do médico:");
        //int codigo = ;
        
    }
}
