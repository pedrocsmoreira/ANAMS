package com.anams.Controller;

import java.util.ArrayList;

import com.anams.Exception.ExceptionTipoServico.ExceptionTipoServicoExiste;
import com.anams.Model.Clinica;
import com.anams.Model.TipoServico;

public class UC2Controller {
    private Clinica clinica;
    private TipoServico tipoServico;

    public UC2Controller(Clinica c){ this.clinica = c; }

    public ArrayList<TipoServico> verTiposServico(){ return clinica.getListaTipoServicos(); }

    public void novoTipoServico(){ this.tipoServico = new TipoServico(); }




    public TipoServico apresentarDados() { return this.tipoServico; }

    public void registaTipoServico() throws ExceptionTipoServicoExiste { clinica.registarTipoServico(tipoServico); }


}
