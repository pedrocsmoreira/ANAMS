package com.anams.View;

import com.anams.Controller.UC6Controller;
import com.anams.Model.Clinica;

public class UC6View {
    private Clinica clinica;
    private UC6Controller controller;

    /**
     * 
     * 
     * @param c
     */
    public UC6View(Clinica c){
        this.clinica = c;
        this.controller = new UC6Controller();
    }

    /**
     * 
     * 
     * 
     */
    public void run(){
        
    }
}
