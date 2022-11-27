package com.anams.Controller;

import java.util.ArrayList;

import com.anams.Exception.ExceptionMedico;
import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;
import com.anams.Model.Medico;
import com.anams.Utils.Data;

public class UC3Controller {
    private Clinica clinica;
    private Medico m;

    public UC3Controller(Clinica c){
        this.clinica = c;
    }

    public boolean verificarEspecialidades() { if(clinica.getListaEspecialidades().size() == 0) { return false; } return true; }

    public String verEspecialidades() {
        ArrayList<Especialidade> especialidades = clinica.getListaEspecialidades();
        StringBuilder str = new StringBuilder();
        for(Especialidade e : especialidades){ str.append(e.toString()); }
        return str.toString();
    }

    public void novoMedico(){ setMedico(); }

    private void setMedico() { this.m = clinica.novoMedico(); }

    public void setCodigo(int codigo){ m.setCodigo(codigo); }

    public void setNome(String nome){ m.setNome(nome); }

    public void setDataContratacao(Data data){ m.setDataContratacao(data); }

    public void setNif(int nif){ m.setNif(nif); }

    public void setCedula(int cedula){ m.setCedula(cedula); }

    public Especialidade getEspecialidade(int num) { return clinica.getListaEspecialidades().get(num); }

    public void setEspecialidades(ArrayList<Especialidade> lista){ m.setEspecialidades(lista); }

    public void setEmail(String email){ m.setEmail(email); }

    public void setContacto(int contacto){ m.setContacto(contacto); }

    public String getMedico() { return this.m.toString(); }

    public void registarMedico() throws ExceptionMedico { clinica.registarMedico(m); }
    
}