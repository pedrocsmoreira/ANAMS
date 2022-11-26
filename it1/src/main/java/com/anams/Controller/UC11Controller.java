package com.anams.Controller;

import com.anams.Model.Clinica;
import com.anams.Model.Marcacao;

public class UC11Controller {
    private Clinica clinica;
    private Marcacao marcacao;

    //Efetuar Marcação

    public UC11Controller(Clinica c){
        this.clinica = c;
    }

    public void novaMarcacao() { this.marcacao = new Marcacao(); }

    

}
