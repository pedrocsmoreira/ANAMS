package com.anams.Controller;

import java.util.ArrayList;

import com.anams.Exception.ExceptionTipoServico.ExceptionTipoServicoExiste;
import com.anams.Model.Clinica;
import com.anams.Model.TipoServico;

public class UC2Controller {
    private Clinica clinica;
    private TipoServico tipoServico;

    public UC2Controller(Clinica c){ this.clinica = c; }

    public String verTiposServico(){
        ArrayList<TipoServico> tiposServico = clinica.getListaTipoServicos();
        StringBuilder str = new StringBuilder();
        for(TipoServico ts : tiposServico){ str.append(ts.toString());  }
        return str.toString();
    }

    public void novoTipoServico(){ setTipoServico(); }

    private void setTipoServico() { this.tipoServico = clinica.novoTipoServico(); }

    public void setNome(String nome){ this.tipoServico.setNome(nome); }

    public TipoServico apresentarDados() { return this.tipoServico; }

    public void registaTipoServico() throws ExceptionTipoServicoExiste { clinica.registarTipoServico(tipoServico); }


}
