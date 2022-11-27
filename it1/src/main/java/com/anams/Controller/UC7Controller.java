package com.anams.Controller;

import java.util.ArrayList;

import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;

public class UC7Controller {
    private Clinica clinica;

    public UC7Controller(Clinica c){
        this.clinica = c;
    }

    public boolean verificarEspecialidades() { if(clinica.getListaEspecialidades().size() == 0) { return false; } return true; }

    public String verEspecialidades() {
        ArrayList<Especialidade> especialidades = clinica.getListaEspecialidades();
        StringBuilder str = new StringBuilder();
        for(Especialidade e : especialidades){ str.append(e.toString()); }
        return str.toString();
    }

    public Especialidade getEspecialidade(int num) { return clinica.getListaEspecialidades().get(num); }

    
}
