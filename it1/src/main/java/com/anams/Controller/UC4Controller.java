package com.anams.Controller;

import java.util.ArrayList;

import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;
import com.anams.Model.Servico;
import com.anams.Model.TipoServico;
import com.anams.Utils.Data;
import com.anams.Exception.ExceptionServico.ExceptionServicoExiste;

public class UC4Controller {
    private Clinica clinica;
    private Servico s;

    public UC4Controller(Clinica c){
        this.clinica = c;
    }

    public void novoServico(){ this.s = new Servico(); }
    
    public void setCodigo(int codigo){ s.setCodigo(codigo); }

    public void setDesignacao(String designacao){ s.setDesignacao(designacao); }

    public void setPreco(float preco){ s.setPreco(preco); }

    public void setTipoServico(TipoServico ts){ s.setTipoServico(ts); }

    public Servico getServico() { return this.s; }

    public void registarServico() throws ExceptionServicoExiste { clinica.registarServico(s); }

}
