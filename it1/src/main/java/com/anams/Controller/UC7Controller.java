package com.anams.Controller;

import java.util.ArrayList;

import com.anams.Exception.ExceptionMedico;
import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;
import com.anams.Model.Medico;

public class UC7Controller {
    private Clinica clinica;
    private Medico medico;
    private ArrayList<Especialidade> esp;

    public UC7Controller(Clinica c){
        this.clinica = c;
    }

    public String procurarMedicos() throws ExceptionMedico{
        return clinica.consultarMedicos();
    }

    public void verificarMedico(int codigo) throws ExceptionMedico{
        medico = this.clinica.encontrarMedico(codigo);
    }

    public boolean verificarEspecialidades() { if(clinica.getListaEspecialidades().size() == 0) { return false; } return true; }

    public String verEspecialidades() {
        ArrayList<Especialidade> especialidades = clinica.getListaEspecialidades();
        StringBuilder str = new StringBuilder();
        for(Especialidade e : especialidades){ str.append(e.toString()); }
        return str.toString();
    }

    public Especialidade getEspecialidade(int num) { return clinica.getListaEspecialidades().get(num); }

    public void adicionarEspecialidades(ArrayList<Especialidade> especialidades) {
        esp.addAll(especialidades);
    }

    public void registarEspecialidades(){
        esp.addAll(medico.getEspecialidades());
        medico.setEspecialidades(esp);
    }

    public String verNovasEspecialidades() {
        StringBuilder str = new StringBuilder();
        for(Especialidade e : esp){ str.append(e.toString()); }
        return str.toString();
    }

    
}
