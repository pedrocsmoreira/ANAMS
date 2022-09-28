package com.anams.Controller;

import java.util.ArrayList;

import com.anams.Extra.Data;
import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;
import com.anams.Model.Medico;

public class UC3Controller {
    private Clinica clinica;
    private Medico m;

    public UC3Controller(Clinica c){
        this.clinica = c;
        this.m = new Medico();
    }

    public void setCodigo(int codigo){ m.setCodigo(codigo); }

    public void setNome(String nome){ m.setNome(nome); }

    public void setDataContratacao(Data data){ m.setDataContratacao(data); }

    public void setNif(int nif){ m.setNif(nif); }

    public void setCedula(int cedula){ m.setCedula(cedula); }

    public void setEspecialidades(ArrayList<Especialidade> lista){ m.setEspecialidades(lista); }

    public void setEmail(String email){ m.setEmail(email); }

    public void setContacto(int contacto){ m.setContacto(contacto); }

    public void registarMedico(){ clinica.registarMedico(m); }
    
}
