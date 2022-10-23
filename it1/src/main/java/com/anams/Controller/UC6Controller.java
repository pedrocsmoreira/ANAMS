package com.anams.Controller;

import java.util.ArrayList;

import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;
import com.anams.Exception.ExceptionEspecialidade.ExceptionEspecialidadeNaoExiste;
import com.anams.Exception.ExceptionMedico.ExceptionMedicoNaoExiste;

public class UC6Controller {
    private Clinica clinica;

    public UC6Controller(Clinica c){
        this.clinica = c;
    }

    public String verEspecialidades() throws ExceptionEspecialidadeNaoExiste{
        ArrayList<Especialidade> lst = this.clinica.getListaEspecialidades();
        if(lst.size() == 0) { throw new ExceptionEspecialidadeNaoExiste(); }
        StringBuilder str = new StringBuilder();
        for(Especialidade e : lst){
            str.append(e.toString());
            str.append("\n");
        }
        return str.toString();
    }

    public Especialidade verificarCodigo(int codigo) throws ExceptionEspecialidadeNaoExiste{
        return this.clinica.verificarCodigo(codigo);
    }

    public String procurarMedicos(Especialidade e) throws ExceptionMedicoNaoExiste{
        return clinica.procurarMedicos(e);
    }



}
