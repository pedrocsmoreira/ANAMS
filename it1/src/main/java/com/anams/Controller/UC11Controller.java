package com.anams.Controller;

import java.util.ArrayList;

import com.anams.Exception.ExceptionEspecialidade.ExceptionEspecialidadeNaoExiste;
import com.anams.Exception.ExceptionMedico.ExceptionMedicoNaoExiste;
import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;
import com.anams.Model.Marcacao;

public class UC11Controller {
    private Clinica clinica;
    private Marcacao marcacao;

    public UC11Controller(Clinica c){
        this.clinica = c;
    }

    public void novaMarcacao() { this.marcacao = new Marcacao(); }

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

    public void verificarEspecialidade(int codigo) throws ExceptionEspecialidadeNaoExiste{
        marcacao.setEspecialidade(this.clinica.verificarEspecialidadeCodigo(codigo));
    }

    public String procurarMedicos() throws ExceptionMedicoNaoExiste{
        return clinica.procurarMedicos(marcacao.getEspecialidade());
    }

    public void verificarMedico(int codigo) throws ExceptionEspecialidadeNaoExiste{
        marcacao.setMedico(this.clinica.verificarMedicoCodigo(codigo));
    }



    

}
