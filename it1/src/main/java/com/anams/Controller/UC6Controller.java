package com.anams.Controller;

import java.util.ArrayList;

import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;
import com.anams.Model.TipoServico;

import com.anams.Exception.ExceptionMedico.ExceptionMedicoExiste;
import com.anams.Exception.ExceptionMedico.ExceptionMedicoNaoExiste;
import com.anams.Exception.ExceptionServico.ExceptionServicoExiste;
import com.anams.Exception.ExceptionServico.ExceptionServicoNaoExiste;
import com.anams.Exception.ExceptionTipoServico.ExceptionTipoServicoExiste;
import com.anams.Exception.ExceptionTipoServico.ExceptionTipoServicoNaoExiste;
import com.anams.Exception.ExceptionConvencao.ExceptionConvencaoExiste;
import com.anams.Exception.ExceptionConvencao.ExceptionConvencaoNaoExiste;
import com.anams.Exception.ExceptionEspecialidade.ExceptionEspecialidadeExiste;
import com.anams.Exception.ExceptionEspecialidade.ExceptionEspecialidadeNaoExiste;

public class UC6Controller {
    private Clinica clinica;

    public UC6Controller(Clinica c){
        this.clinica = c;
    }

    public String consultarMedicos() {
        return clinica.consultarMedicos();
    }

    public String consultarMedicosEspecialidade(int codigo) throws ExceptionEspecialidadeNaoExiste{
        try{
            this.clinica.consultarMedicosEspecialidade(codigo);
        }catch (ExceptionEspecialidadeNaoExiste e){
            throw e;
        }
        return clinica.consultarMedicosEspecialidade(codigo);
    }

    public String consultarMedicoID(int id) {
        return clinica.consultarMedicoID(id);
    }

    public String consultarMedicoNome(String nome) {
        return clinica.consultarMedicoNome(nome);
    }

    public String consultarMedicoCedula(int cedula) {
        return clinica.consultarMedicoCedula(cedula);
    }

    public String consultarMedicoContacto(int contacto) {
        return clinica.consultarMedicoContacto(contacto);
    }

    public String consultarMedicoEmail(String email) {
        return clinica.consultarMedicoEmail(email);
    }
    
    public String consultarServicos(){
        return clinica.consultarServicos();
    }

    public String consultarServicosTipo(int codigo){
        return clinica.consultarServicosTipo(codigo);
    }

    public String consultarEspecialidades(){
        return clinica.consultarEspecialidades();
    }
    
    public String consultarTipoServico(){
        return clinica.consultarTipoServico();
    }

    public String consultarConvencoes(){
        return clinica.consultarConvencoes();
    }
    
}
