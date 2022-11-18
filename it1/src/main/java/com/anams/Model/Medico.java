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
     * Construtor Vazio do Médico
     * 
     */
    public Medico() {
        setCodigo(INT_DEFAULT);
        setNome(STR_DEFAULT);
        setDataContratacao(new Data());
        setNif(INT_DEFAULT);
        setCedula(INT_DEFAULT);
        setEspecialidades(new ArrayList<Especialidade>());
        setEmail(STR_DEFAULT);
        setContacto(INT_DEFAULT);
    }

    /**
     * Construtor Completo do Médico
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
    public Medico(int codigo, String nome, Data data, int nif, int cedula, ArrayList<Especialidade> lista , String email, int contacto) {
        setCodigo(codigo);
        setNome(nome);
        setDataContratacao(data);
        setNif(nif);
        setCedula(cedula);
        setEspecialidades(lista);
        setEmail(email);
        setContacto(contacto);
    }

    /**
     * Construtor Cópia do Médico
     * 
     * @param m
     */
    public Medico(Medico m) {
        setCodigo(m.codigo);
        setNome(m.nome);
        setDataContratacao(m.dataContratacao);
        setNif(m.nif);
        setCedula(m.cedula);
        setEspecialidades(m.especialidades);
        setEmail(m.email);
        setContacto(m.contacto);
    }

    /**
     * Define código do Médico
     * 
     * @param codigo
     */
    public void setCodigo(int codigo) { this.codigo = codigo; }

    /**
     * Devolve código do Médico
     * 
     * @return codigo
     */
    public int getCodigo() { return this.codigo; }

    /**
     * Define nome do Médico
     * 
     * @param nome
     */
    public void setNome(String nome) { this.nome = nome; }

    /**
     * Devolve nome do Médico
     * 
     * @return nome
     */
    public String getNome() { return this.nome; }

    /**
     * Define data de contratação do Médico
     * 
     * @param data
     */
    public void setDataContratacao(Data data) { this.dataContratacao = data; }

    /**
     * Devolve data de contratação do Médico
     * 
     * @return dataContratacao
     */
    public Data getDataContratacao() { return this.dataContratacao; }

    /**
     * Define nif do Médico
     * 
     * @param nif
     */
    public void setNif(int nif) { this.nif = nif; }

    /**
     * Devolve nif do Médico
     * 
     * @return nif
     */
    public int getNif() { return this.nif; }

    /**
     * Define cédula profissional do Médico
     * 
     * @param cedula
     */
    public void setCedula(int cedula) { this.cedula = cedula; }

    /**
     * Devolve cédula profissional do Médico
     * 
     * @return cedula
     */
    public int getCedula() { return this.cedula; }

    /**
     * Define especialidades do Médico
     * 
     * @param lista
     */
    public void setEspecialidades(ArrayList<Especialidade> lista) { this.especialidades = lista; }

    /**
     * Devolve especialidades do Médico
     * 
     * @return lista
     */
    public ArrayList<Especialidade> getEspecialidades() { return this.especialidades; }

    /**
     * Define email do Médico
     * 
     * @param email
     */
    public void setEmail(String email) { this.email = email; }

    /**
     * Devolve email do Médico
     * 
     * @return email
     */
    public String getEmail() { return this.email; }

    /**
     * Define contacto do Médico
     * 
     * @param contacto
     */
    public void setContacto(int contacto) { this.contacto = contacto; }

    /**
     * Devolve contacto do Médico
     * 
     * @return contacto
     */
    public int getContacto() { return this.contacto; }

    public String toString() {
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

    @Override
    public boolean equals(Object outro) {
        if(this == outro){
            return true;
        }
        if(outro == null || this.getClass() != outro.getClass()) {
            return false;
        }
        Medico obj = (Medico) outro;
        return this.codigo == obj.codigo
                && this.nome.equalsIgnoreCase(obj.nome)
                && this.dataContratacao.equals(obj.dataContratacao)
                && this.nif == obj.nif
                && this.cedula == obj.cedula
                && this.especialidades.equals(obj.especialidades)
                && this.email.equalsIgnoreCase(obj.email)
                && this.contacto == obj.contacto;
    }

}
