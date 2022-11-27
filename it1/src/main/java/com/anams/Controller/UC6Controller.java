package com.anams.Controller;

import java.util.ArrayList;

import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;
import com.anams.Exception.ExceptionEspecialidade;
import com.anams.Exception.ExceptionMedico;

public class UC6Controller {
    private Clinica clinica;
    private Especialidade e;

    public UC6Controller(Clinica c){
        this.clinica = c;
    }

    public String verEspecialidades() throws ExceptionEspecialidade{
        return clinica.consultarEspecialidades();
    }

    public void verificarCodigo(int codigo) throws ExceptionEspecialidade{
        e = this.clinica.encontrarEspecialidade(codigo);
    }

    public String procurarMedicos() throws ExceptionMedico{
        return clinica.consultarMedicos(e);
    }

}
