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
    }

    /**
     * Criar nova convenção, sem dados
     * 
     */
    public void novaConvencao(){ this.c = new Convencao(); }

    /**
     * Definir o código de uma convenção
     * 
     * @param codigo
     */
    public void setCodigo(int codigo) { this.c.setCodigo(codigo); }

    /**
     * Definir a sigla de uma convenção
     * 
     * @param sigla
     */
    public void setSigla(String sigla) { this.c.setSigla(sigla); }

    /**
     * Definir o nome de uma convenção
     * 
     * @param nome
     */
    public void setNome(String nome) { this.c.setNome(nome); }

    /**
     * Definir a data de uma convenção
     * 
     * @param data
     */
    public void setDataConvencao(Data data) { this.c.setDataConvencao(data); }

    /**
     * Definir o website de uma convenção
     * 
     * @param website
     */
    public void setWebsite(String website) { this.c.setWebsite(website); }

    /**
     * Devolver uma convenção
     * 
     * @return c
     */
    public Convencao getConvencao() { return this.c; }

    /**
     * Registar convenção na clínica
     * 
     * @throws ExceptionConvencaoExiste
     */
    public void registarConvencao() throws ExceptionConvencaoExiste { clinica.registarConvencao(c); }
}
