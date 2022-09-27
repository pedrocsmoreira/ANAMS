package com.anams.Model;

import java.util.ArrayList;
import java.util.Optional;

public class Clinica {
    private String nome;
    private String endereco;
    private int nif;
    private int contacto;
    private String website;

    private ArrayList<Especialidade> listaEspecialidades;
    private ArrayList<Medico> listaMedicos;
    private ArrayList<TipoServico> listaTipoServicos;
    private ArrayList<Servico> listaServicos;
    private ArrayList<Convencao> listaConvencoes;

    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;

    public Clinica(){
        this.nome = STR_DEFAULT;
        this.endereco = STR_DEFAULT;
        this.nif = INT_DEFAULT;
        this.contacto = INT_DEFAULT;
        this.website = STR_DEFAULT;
        this.listaEspecialidades = new ArrayList<Especialidade>();
        this.listaMedicos = new ArrayList<Medico>();
        this.listaTipoServicos = new ArrayList<TipoServico>();
        this.listaServicos = new ArrayList<Servico>();
        this.listaConvencoes =  new ArrayList<Convencao>();
    }

    public void setNome(String nome){ this.nome = nome; }

    public String getNome(){ return this.nome; }

    public void setEndereco(String endereco){ this.endereco = endereco; }

    public String getEndereco(){ return this.endereco; }

    public void setNif(int nif){ this.nif = nif; }

    public int getNif(){ return this.nif; }

    public void setContacto(int contacto){ this.contacto = contacto; }

    public int getContacto(){ return this.contacto; }

    public void setWebsite(String website){ this.website = website; }

    public String getWebsite(){ return this.website; }



    public void setListaEspecialidades(ArrayList<Especialidade> listaEspecialidades){ this.listaEspecialidades = listaEspecialidades; }

    public ArrayList<Especialidade> getListaEspecialidades(){ return this.listaEspecialidades; }

    public void setListaMedicos(ArrayList<Medico> listaMedicos){ this.listaMedicos = listaMedicos; }

    public ArrayList<Medico> getListaMedicos(){ return this.listaMedicos; }

    public void setListaTipoServicos(ArrayList<TipoServico> listaTipoServicos){ this.listaTipoServicos = listaTipoServicos; }

    public ArrayList<TipoServico> getListaTipoServicos(){ return this.listaTipoServicos; }

    public void setListaServicos(ArrayList<Servico> listaServicos){ this.listaServicos = listaServicos; }

    public ArrayList<Servico> getListaServicos(){ return this.listaServicos; }

    public void setListaConvencoes(ArrayList<Convencao> listaConvencoes){ this.listaConvencoes = listaConvencoes; }

    public ArrayList<Convencao> getListaConvencoes(){ return this.listaConvencoes; }



    public void inserirEspecialidade(Especialidade e){ this.listaEspecialidades.add(e); }

    public void inserirMedico(Medico m){ this.listaMedicos.add(m); }

    public void inserirTipoServico(TipoServico ts){ this.listaTipoServicos.add(ts); }

    public void inserirServico(Servico s){this.listaServicos.add(s); }

    public void inserirConvencao(Convencao c){ this.listaConvencoes.add(c); }

    

    public void removerEspecialidadeCodigo(int codigo){
        Optional<Especialidade> optionalVariable = listaEspecialidades.stream().filter(element -> (element.getCodigo() == codigo)).findFirst();
        Especialidade esp = optionalVariable.orElseThrow(() -> new NullPointerException());
    }

    public void removerEspecialidadeDesignacao(String designacao){
        Optional<Especialidade> optionalVariable = listaEspecialidades.stream().filter(element -> element.getDesignacao().equals(designacao)).findFirst();
        Especialidade esp = optionalVariable.orElseThrow(() -> new NullPointerException());
    }

    public void removerEspecialidadeAcronimo(String acronimo){
        Optional<Especialidade> optionalVariable = listaEspecialidades.stream().filter(element -> element.getAcronimo().equals(acronimo)).findFirst();
        Especialidade esp = optionalVariable.orElseThrow(() -> new NullPointerException());
    }
}