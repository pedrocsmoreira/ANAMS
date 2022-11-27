package com.anams.Controller;

import java.util.ArrayList;

import com.anams.Exception.ExceptionEspecialidade;
import com.anams.Exception.ExceptionMedico;
import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;

//Consultar Vagas para consulta de uma especialidade

public class UC13Controller {
    private Clinica clinica;
    private Especialidade e;

    public UC13Controller(Clinica c){
        this.clinica = c;
    }
    
    public String verEspecialidades() throws ExceptionEspecialidade{
        ArrayList<Especialidade> lst = this.clinica.getListaEspecialidades();
        if(lst.size() == 0) { throw new ExceptionEspecialidade(); }
        StringBuilder str = new StringBuilder();
        for(Especialidade e : lst){
            str.append(e.toString());
            str.append("\n");
        }
        return str.toString();
    }

    public void verificarEspecialidade(int codigo) throws ExceptionEspecialidade{
        e = this.clinica.encontrarEspecialidade(codigo);
    }




}
