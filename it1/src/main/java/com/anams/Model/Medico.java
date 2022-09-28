package com.anams.Model;

import java.util.ArrayList;
import com.anams.Extra.Data;

public class Medico {
    private int codigo;
    private String nome;
    private Data dataContratacao;
    private int nif;
    private int cedula;
    private ArrayList<Especialidade> especialidades;
    private String email;
    private int contacto;

    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;

    public Medico(){
        this.codigo = INT_DEFAULT;
        this.nome = STR_DEFAULT;
        this.dataContratacao = new Data();
        this.nif = INT_DEFAULT;
        this.cedula = INT_DEFAULT;
        this.especialidades = new ArrayList<Especialidade>();
        this.email = STR_DEFAULT;
        this.contacto = INT_DEFAULT;
    }

    public Medico(int codigo, String nome, Data data, int nif, int cedula, ArrayList<Especialidade> lista , String email, int contacto){
        this.codigo = codigo;
        this.nome = nome;
        this.dataContratacao = data;
        this.nif = nif;
        this.cedula = cedula;
        this.especialidades = lista;
        this.email = email;
        this.contacto = contacto;
    }

    public void setCodigo(int codigo){ this.codigo = codigo; }

    public int getCodigo(){ return this.codigo; }

    public void setNome(String nome){ this.nome = nome; }

    public String getNome(){ return this.nome; }

    public void setDataContratacao(Data data){ this.dataContratacao = data; }

    public Data getDataContratacao(){ return this.dataContratacao; }

    public void setNif(int nif){ this.nif = nif; }

    public int getNif(){ return this.nif; }

    public void setCedula(int cedula){ this.cedula = cedula; }

    public int getCedula(){ return this.cedula; }

    public void setEspecialidades(ArrayList<Especialidade> lista) { this.especialidades = lista; }

    public ArrayList<Especialidade> getEspecialidades(){ return this.especialidades; }

    public void setEmail(String email){ this.email = email; }

    public String getEmail(){ return this.email; }

    public void setContacto(int contacto){ this.contacto = contacto; }

    public int getContacto(){ return this.contacto; }

}