package com.anams.Controller;

import java.util.ArrayList;

import com.anams.Exception.ExceptionEspecialidade;
import com.anams.Exception.ExceptionMarcacao;
import com.anams.Exception.ExceptionMedico;
import com.anams.Model.Cliente;
import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;
import com.anams.Model.Marcacao;
import com.anams.Utils.Data;

public class UC11Controller {
    private Clinica clinica;
    private Marcacao marcacao;

    public UC11Controller(Clinica c){
        this.clinica = c;
    }

    public void novaMarcacao() { this.marcacao = clinica.novaMarcacao(); }

    public void setCliente(Cliente cliente) { this.marcacao.setCliente(cliente); }

    public String verEspecialidades() throws ExceptionEspecialidade{
        return clinica.consultarEspecialidades();
    }

    public void verificarEspecialidade(int codigo) throws ExceptionEspecialidade{
        marcacao.setEspecialidade(this.clinica.encontrarEspecialidade(codigo));
    }

    public String procurarMedicos() throws ExceptionMedico{
        return clinica.consultarMedicos(marcacao.getEspecialidade());
    }

    public void verificarMedico(int codigo) throws ExceptionMedico{
        marcacao.setMedico(this.clinica.encontrarMedico(codigo));
    }

    public void setData(Data data) { this.marcacao.setDia(data); }

    public String verMarcacao() { return this.marcacao.toString(); }

    public void guardarMarcacao() throws ExceptionMarcacao {
        this.clinica.registarMarcacao(marcacao);
    }

    

}
