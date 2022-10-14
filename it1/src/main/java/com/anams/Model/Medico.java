package com.anams.Model;

import java.util.ArrayList;

import com.anams.Utils.Data;

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

    /**
     * 
     * 
     * 
     */
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

    /**
     * 
     * 
     * @param codigo
     * @param nome
     * @param data
     * @param nif
     * @param cedula
     * @param lista
     * @param email
     * @param contacto
     */
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

    /**
     * 
     * 
     * @param m
     */
    public Medico(Medico m){
        this.codigo = m.codigo;
        this.nome = m.nome;
        this.dataContratacao = m.dataContratacao;
        this.nif = m.nif;
        this.cedula = m.cedula;
        this.especialidades = m.especialidades;
        this.email = m.email;
        this.contacto = m.contacto;
    }

    /**
     * 
     * 
     * @param codigo
     */
    public void setCodigo(int codigo){ this.codigo = codigo; }

    /**
     * 
     * 
     * @return codigo
     */
    public int getCodigo(){ return this.codigo; }

    /**
     * 
     * 
     * @param nome
     */
    public void setNome(String nome){ this.nome = nome; }

    /**
     * 
     * 
     * @return nome
     */
    public String getNome(){ return this.nome; }

    /**
     * @param data
     */
    public void setDataContratacao(Data data){ this.dataContratacao = data; }

    /**
     * 
     * 
     * @return dataContratacao
     */
    public Data getDataContratacao(){ return this.dataContratacao; }

    /**
     * 
     * 
     * @param nif
     */
    public void setNif(int nif){ this.nif = nif; }

    /**
     * 
     * 
     * @return nif
     */
    public int getNif(){ return this.nif; }

    /**
     * 
     * 
     * @param cedula
     */
    public void setCedula(int cedula){ this.cedula = cedula; }

    /**
     * 
     * 
     * @return cedula
     */
    public int getCedula(){ return this.cedula; }

    /**
     * 
     * 
     * @param lista
     */
    public void setEspecialidades(ArrayList<Especialidade> lista) { this.especialidades = lista; }

    /**
     * 
     * 
     * @return lista
     */
    public ArrayList<Especialidade> getEspecialidades(){ return this.especialidades; }

    /**
     * 
     * 
     * @param email
     */
    public void setEmail(String email){ this.email = email; }

    /**
     * 
     * 
     * @return email
     */
    public String getEmail(){ return this.email; }

    /**
     * 
     * 
     * @param contacto
     */
    public void setContacto(int contacto){ this.contacto = contacto; }

    /**
     * 
     * 
     * @return contacto
     */
    public int getContacto(){ return this.contacto; }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n\tCódigo -> ");
        sb.append(this.codigo);
        sb.append("\n\tNome -> ");
        sb.append(this.nome);
        sb.append("\n\tData de Contratação -> ");
        sb.append(this.dataContratacao);
        sb.append("\n\tNIF -> ");
        sb.append(this.nif);
        sb.append("\n\tCédula Profissional -> ");
        sb.append(this.cedula);
        sb.append("\n\tEspecialidades -> ");
        if(this.especialidades.isEmpty()) {
            sb.append(" (sem especialidades) ");
        }else {
            for (Especialidade e : especialidades) {
                sb.append(e + "\n");
            }
        }
        sb.append("\n\tEmail -> ");
        sb.append(this.email);
        sb.append("\n\tContacto -> ");
        sb.append(this.contacto);
        return sb.toString();
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object outro){
        if(this == outro){
            return true;
        }
        if(outro == null || this.getClass() != outro.getClass()) {
            return false;
        }
        Medico obj = (Medico) outro;
        return this.codigo == obj.codigo
                && this.nome.equals(obj.nome)
                && this.dataContratacao.equals(obj.dataContratacao)
                && this.nif == obj.nif
                && this.cedula == obj.cedula
                && this.especialidades.equals(obj.especialidades)
                && this.email.equals(obj.email)
                && this.contacto == obj.contacto;
    }

}