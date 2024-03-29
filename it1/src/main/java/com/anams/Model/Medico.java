package com.anams.Model;

import java.util.ArrayList;
import java.util.HashMap;

import com.anams.Exception.ExceptionSlot;
import com.anams.Utils.Data;

public class Medico {
    private int codigo;
    private String nome;
    private Data dataContratacao;
    private int nif;
    private int cedula;
    private int numEspecialidades;
    private ArrayList<Especialidade> especialidades;
    private String email;
    private int contacto;

    private String password;

    private CalendarioMensal calendario;

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
        setNumEspecialidades(2);
        setEspecialidades(new ArrayList<Especialidade>());
        setEmail(STR_DEFAULT);
        setContacto(INT_DEFAULT);
        
        setPassword(STR_DEFAULT);

        setCalendario(null);
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
    public Medico(int codigo, String nome, Data data, int nif, int cedula, int numEspecialidades, ArrayList<Especialidade> lista , String email, int contacto, String password) {
        setCodigo(codigo);
        setNome(nome);
        setDataContratacao(data);
        setNif(nif);
        setCedula(cedula);
        setNumEspecialidades(numEspecialidades);
        setEspecialidades(lista);
        setEmail(email);
        setContacto(contacto);

        setPassword(password);

        setCalendario(null);
    }

    public Medico(String nome, String password) {
        setCodigo(INT_DEFAULT);
        setNome(nome);
        setDataContratacao(new Data());
        setNif(INT_DEFAULT);
        setCedula(INT_DEFAULT);
        setNumEspecialidades(2);
        setEspecialidades(new ArrayList<Especialidade>());
        setEmail(STR_DEFAULT);
        setContacto(INT_DEFAULT);
        
        setPassword(password);

        setCalendario(null);
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
        setPassword(m.password);
        setCalendario(m.calendario);
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
     * 
     * 
     * @param numEspecialidades
     */
    public void setNumEspecialidades(int numEspecialidades) { this.numEspecialidades = numEspecialidades; }

    /**
     * 
     * 
     * @return
     */
    public int getNumEspecialidades() { return this.numEspecialidades; }

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

    public void setPassword(String password) { this.password = password;}

    public String getPassword() { return this.password;}

    public void setCalendario(CalendarioMensal calendario) { this.calendario = calendario;}

    public CalendarioMensal  getCalendario() { return this.calendario;}

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

    public boolean login(Medico m) {
        if(!this.nome.equals(m.nome)){
            return false;
        }
        if(!this.password.equals(m.password)){
            return false;
        }
        return true;
    }





}
