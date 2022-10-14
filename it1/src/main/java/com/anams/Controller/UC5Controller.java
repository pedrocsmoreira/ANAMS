package com.anams.Controller;

import com.anams.Exception.ExceptionConvencao.ExceptionConvencaoExiste;
import com.anams.Model.Clinica;
import com.anams.Model.Convencao;
import com.anams.Utils.Data;

public class UC5Controller {
    private Clinica clinica;
    private Convencao c;

    public UC5Controller(Clinica c){
        this.clinica = c;
        this.c = new Convencao();
    }

    public void setCodigo(int codigo) { this.c.setCodigo(codigo); }

    public void setSigla(String sigla) { this.c.setSigla(sigla); }

    public void setNome(String nome) { this.c.setNome(nome); }

    public void setDataConvencao(Data data) { this.c.setDataConvencao(data); }

    public void setWebsite(String website) { this.c.setWebsite(website); }

    public Convencao getConvencao() { return this.c; }

    public void registarConvencao() throws ExceptionConvencaoExiste { clinica.registarConvencao(c); }
}
