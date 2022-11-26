package com.anams.Controller;

import com.anams.Model.Clinica;

public class MenuCLController {
    Clinica clinica;

    public MenuCLController(Clinica c) {
        this.clinica = c;
    }

    private boolean verificarClientes(){
        if(!clinica.verificarClientes()){
            return false;
        }

        return true;
    }
}
