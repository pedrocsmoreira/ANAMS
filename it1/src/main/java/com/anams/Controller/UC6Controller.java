package com.anams.Controller;

import java.util.ArrayList;

import com.anams.Model.Clinica;
import com.anams.Exception.ExceptionMedico.ExceptionMedicoNaoExiste;
import com.anams.Exception.ExceptionServico.ExceptionServicoNaoExiste;
import com.anams.Exception.ExceptionTipoServico.ExceptionTipoServicoNaoExiste;
import com.anams.Exception.ExceptionConvencao.ExceptionConvencaoNaoExiste;
import com.anams.Exception.ExceptionEspecialidade.ExceptionEspecialidadeNaoExiste;

public class UC6Controller {
    private Clinica clinica;

    public UC6Controller(Clinica c){
        this.clinica = c;
    }

    public String consultarMedicos() {
        return clinica.consultarMedicos();
    }

    public String consultarMedicosEspecialidade(int codigo) throws ExceptionEspecialidadeNaoExiste, ExceptionMedicoNaoExiste{
        return clinica.consultarMedicosEspecialidade(codigo);
    }

    public String consultarMedicoID(int id) throws ExceptionMedicoNaoExiste{
        return clinica.consultarMedicoID(id);
    }

    public String consultarMedicoNome(String nome) throws ExceptionMedicoNaoExiste{
        return clinica.consultarMedicoNome(nome);
    }

    public String consultarMedicoCedula(int cedula) throws ExceptionMedicoNaoExiste{
        return clinica.consultarMedicoCedula(cedula);
    }

    public String consultarMedicoContacto(int contacto) throws ExceptionMedicoNaoExiste{
        return clinica.consultarMedicoContacto(contacto);
    }

    public String consultarMedicoEmail(String email) throws ExceptionMedicoNaoExiste{
        return clinica.consultarMedicoEmail(email);
    }
    
    public String consultarServicos(){
        return clinica.consultarServicos();
    }

    public String consultarServicosTipo(int codigo) throws ExceptionTipoServicoNaoExiste, ExceptionServicoNaoExiste{
        return clinica.consultarServicosTipo(codigo);
    }

    public String consultarEspecialidades() throws ExceptionEspecialidadeNaoExiste{
        return clinica.consultarEspecialidades();
    }
    
    public String consultarTipoServico() throws ExceptionTipoServicoNaoExiste{
        return clinica.consultarTipoServico();
    }

    public String consultarConvencoes() throws ExceptionConvencaoNaoExiste{
        return clinica.consultarConvencoes();
    }
    
}
