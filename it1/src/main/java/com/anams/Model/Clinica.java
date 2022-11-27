package com.anams.Model;

import java.util.ArrayList;
import java.util.Optional;

import com.anams.Exception.ExceptionCliente;
import com.anams.Exception.ExceptionConvencao;
import com.anams.Exception.ExceptionEspecialidade;
import com.anams.Exception.ExceptionMarcacao;
import com.anams.Exception.ExceptionMedico;
import com.anams.Exception.ExceptionServico;
import com.anams.Exception.ExceptionTipoServico;

public class Clinica {
    private String nome;
    private String endereco;
    private int nif;
    private int contacto;
    private String website;

    private static byte[] salt = new byte[16];

    private DC diretorClinico = new DC("root", "root");
    private DG diretorGeral = new DG("root", "root");
    private AA assistenteAdministrativa = new AA("root", "root");

    private ArrayList<Especialidade> listaEspecialidades;
    private ArrayList<Medico> listaMedicos;
    private ArrayList<TipoServico> listaTipoServico;
    private ArrayList<Servico> listaServicos;
    private ArrayList<Convencao> listaConvencoes;
    private ArrayList<Cliente> listaClientes;

    private ArrayList<Marcacao> listaMarcacoes;
    private ArrayList<Calendario> listaCalendarios;

    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;

    /**
     * Construtor vazio
     *
     */
    public Clinica() {
        setNome(STR_DEFAULT);
        setEndereco(STR_DEFAULT);
        setNif(INT_DEFAULT);
        setContacto(INT_DEFAULT);
        setWebsite(STR_DEFAULT);
        this.listaEspecialidades = new ArrayList<Especialidade>();
        this.listaMedicos = new ArrayList<Medico>();
        this.listaTipoServico = new ArrayList<TipoServico>();
        this.listaServicos = new ArrayList<Servico>();
        this.listaConvencoes =  new ArrayList<Convencao>();
        this.listaClientes = new ArrayList<Cliente>();
        this.listaMarcacoes = new ArrayList<Marcacao>();
        this.listaCalendarios = new ArrayList<Calendario>();
    }

    /**
     * Construtor com parâmetros
     *
     * @param nome
     * @param endereco
     * @param nif
     * @param contacto
     * @param website
     */
    public Clinica(String nome, String endereco, int nif, int contacto, String website) {
        setNome(nome);
        setEndereco(endereco);
        setNif(nif);
        setContacto(contacto);
        setWebsite(website);
        this.listaEspecialidades = new ArrayList<Especialidade>();
        this.listaMedicos = new ArrayList<Medico>();
        this.listaTipoServico = new ArrayList<TipoServico>();
        this.listaServicos = new ArrayList<Servico>();
        this.listaConvencoes =  new ArrayList<Convencao>();
        this.listaClientes =  new ArrayList<Cliente>();
        this.listaMarcacoes = new ArrayList<Marcacao>();
        this.listaCalendarios = new ArrayList<Calendario>();
    }

    /**
     * Define Nome da Clinica
     *
     * @param nome
     */
    public void setNome(String nome) { this.nome = nome; }

    /**
     * Devolve Nome da Clinica
     *
     * @return nome
     */
    public String getNome() { return this.nome; }

    /**
     * Define Endereco da Clinica
     *
     * @param endereco
     */
    public void setEndereco(String endereco) { this.endereco = endereco; }

    /**
     * Devolve Endereco da Clinica
     *
     * @return endereco
     */
    public String getEndereco() { return this.endereco; }

    /**
     * Define o NIF da Clinica
     *
     * @param nif
     */
    public void setNif(int nif) { this.nif = nif; }

    /**
     * Devolve o NIF da Clinica
     *
     * @return nif
     */
    public int getNif() { return this.nif; }

    /**
     * Define Contacto da Clinica
     *
     * @param contacto
     */
    public void setContacto(int contacto) { this.contacto = contacto; }

    /**
     * Devolve Contacto da Clinica
     *
     * @return contacto
     */
    public int getContacto() { return this.contacto; }

    /**
     * Define Website da Clinica
     *
     * @param website
     */
    public void setWebsite(String website) { this.website = website; }

    /**
     * Devolve Website da Clinica
     *
     * @return website
     */
    public String getWebsite() { return this.website; }



    /**
     *
     *
     * @param assistenteAdministrativa
     */
    public void setAssistenteAdministrativa(AA assistenteAdministrativa) { this.assistenteAdministrativa = assistenteAdministrativa; }

    /**
     *
     *
     * @return assistenteAdministrativa
     */
    public AA getAssistenteAdministrativa() { return this.assistenteAdministrativa; }

    /**
     *
     *
     * @param diretorClinico
     */
    public void setDiretorClinico(DC diretorClinico) { this.diretorClinico = diretorClinico; }

    /**
     *
     *
     * @return diretorClinico
     */
    public DC getDiretorClinico() { return this.diretorClinico; }

    /**
     *
     *
     * @param diretorGeral
     */
    public void setDiretorGeral(DG diretorGeral) { this.diretorGeral = diretorGeral; }

    /**
     *
     *
     * @return diretorGeral
     */
    public DG getDiretorGeral() { return this.diretorGeral; }


    /**
     * Define Lista de Especialidades registadas na Clínica
     *
     * @param listaEspecialidades
     */
    public void setListaEspecialidades(ArrayList<Especialidade> listaEspecialidades) { this.listaEspecialidades = listaEspecialidades; }

    /**
     * Devolve Lista de Especialidades registadas na Clínica
     *
     * @return
     */
    public ArrayList<Especialidade> getListaEspecialidades() { return this.listaEspecialidades; }

    /**
     * Define Lista de Médicos registadas na Clínica
     *
     * @param listaMedicos
     */
    public void setListaMedicos(ArrayList<Medico> listaMedicos) { this.listaMedicos = listaMedicos; }

    /**
     * Devolve Lista de Médicos registadas na Clínica
     *
     * @return listaMedicos
     */
    public ArrayList<Medico> getListaMedicos() { return this.listaMedicos; }

    /**
     * Define Lista de Tipos de Serviços registadas na Clínica
     *
     * @param listaTipoServicos
     */
    public void setListaTipoServicos(ArrayList<TipoServico> listaTipoServicos) { this.listaTipoServico = listaTipoServicos; }

    /**
     * Devolve Lista de Tipos de Serviços registadas na Clínica
     *
     * @return listaTipoServicos
     */
    public ArrayList<TipoServico> getListaTipoServicos() { return this.listaTipoServico; }

    /**
     * Define Lista de Serviços registadas na Clínica
     *
     * @param listaServicos
     */
    public void setListaServicos(ArrayList<Servico> listaServicos) { this.listaServicos = listaServicos; }

    /**
     * Devolve Lista de Serviços registadas na Clínica
     *
     * @return listaServicos
     */
    public ArrayList<Servico> getListaServicos() { return this.listaServicos; }

    /**
     * Define Lista de Convenções registadas na Clínica
     *
     * @param listaConvencoes
     */
    public void setListaConvencoes(ArrayList<Convencao> listaConvencoes) { this.listaConvencoes = listaConvencoes; }

    /**
     * Devolve Lista de Convenções registadas na Clínica
     *
     * @return listaConvencoes
     */
    public ArrayList<Convencao> getListaConvencoes() { return this.listaConvencoes; }

    public ArrayList<Cliente> getListaClientes() { return this.listaClientes; }

    public boolean loginAA(AA aa) {
        if(!assistenteAdministrativa.login(aa)){
            return false;
        }
        return true;
    }

    public boolean loginDC(DC dc) {
        if(!diretorClinico.login(dc)){
            return false;
        }
        return true;
    }

    public boolean loginDG(DG dg) {
        if(!diretorGeral.login(dg)){
            return false;
        }
        return true;
    }





    public Especialidade novaEspecialidade() { return new Especialidade(); }


    public void registarEspecialidade(Especialidade e) throws ExceptionEspecialidade {
        encontrarEspecialidade(e);
        inserirEspecialidade(e);
    }

    public Especialidade encontrarEspecialidade(Especialidade esp) throws ExceptionEspecialidade {
        for(Especialidade e : listaEspecialidades){
            if(e.equals(esp)){
                return e;
            }
        }
        throw new ExceptionEspecialidade("Especialiade não existe!");
    }

    public Especialidade encontrarEspecialidade(int codigo) throws ExceptionEspecialidade {
        for(Especialidade e : listaEspecialidades){
            if(e.getCodigo() == codigo){
                return e;
            }
        }
        throw new ExceptionEspecialidade("Especialiade não existe!");
    }

    public String consultarEspecialidades() throws ExceptionEspecialidade {
        StringBuilder lst = new StringBuilder();
        if(listaEspecialidades.size() == 0){ throw new ExceptionEspecialidade("Especialidade não encontrada!!!"); }
        for(Especialidade esp : listaEspecialidades) {
            lst.append(esp.toString());
            lst.append("\n");
        }
        return lst.toString();
    }

    private void inserirEspecialidade(Especialidade e) { this.listaEspecialidades.add(e); }





    public Medico novoMedico() { return new Medico();}

    public void registarMedico(Medico m) throws ExceptionMedico {
        encontrarMedico(m);
        inserirMedico(m);
    }

    public Medico encontrarMedico(Medico med) throws ExceptionMedico {
        for(Medico m : listaMedicos){
            if(m.equals(med)){
                return m;
            }
        }
        throw new ExceptionMedico("Médico não existe!");
    }

    public Medico encontrarMedico(int codigo) throws ExceptionMedico {
        for(Medico m : listaMedicos){
            if(m.getCodigo() == codigo){
                return m;
            }
        }
        throw new ExceptionMedico("Médico não existe!");
    }

    public String consultarMedicos() throws ExceptionMedico {
        StringBuilder lst = new StringBuilder();
        if(listaMedicos.size() == 0){ throw new ExceptionMedico("Médico não encontrado!!!"); }
        for(Medico m : listaMedicos){
            lst.append(m.toString());
            lst.append("\n");
        }
        return lst.toString();
    }

    public String consultarMedicos(Especialidade e) throws ExceptionMedico {
        StringBuilder lst = new StringBuilder();
        if(listaMedicos.size() == 0){ throw new ExceptionMedico("Médico não encontrado!!!"); }
        for(Medico m : listaMedicos){
            if(m.getEspecialidades().contains(e)){
                lst.append(m.toString());
                lst.append("\n");
            }
        }
        return lst.toString();
    }

    private void inserirMedico(Medico m) { this.listaMedicos.add(m); }´

    public boolean loginMedico(Medico medico) {
        for(Medico m : listaMedicos){
            if(m.login(medico)){
                return true;
            }
        }
        return false;
    }


    

    public Servico novoServico() { return new Servico(); }

    public void registarServico(Servico s) throws ExceptionServico {
        encontrarServico(s);
        inserirServico(s);
    }

    public Servico encontrarServico(Servico ser) throws ExceptionServico {
        for(Servico s : listaServicos){
            if(s.equals(ser)){
                return s;
            }
        }
        throw new ExceptionServico("Serviço não existe!");
    }

    public Servico encontrarServico(int codigo) throws ExceptionServico {
        for(Servico s : listaServicos){
            if(s.getCodigo() == codigo){
                return s;
            }
        }
        throw new ExceptionServico("Serviço não existe!");
    }

    public String consultarServicos() throws ExceptionServico {
        StringBuilder lst = new StringBuilder();
        if(listaServicos.size() == 0){ throw new ExceptionServico("Serviço não encontrado!!!"); }
        for(Servico s : listaServicos) {
            lst.append(s.toString());
            lst.append("\n");
        }
        return lst.toString();
    }

    private void inserirServico(Servico s) {this.listaServicos.add(s); }






    public TipoServico novoTipoServico() { return new TipoServico(); }

    public void registarTipoServico(TipoServico ts) throws ExceptionTipoServico {
        encontrarTipoServico(ts);
        inserirTipoServico(ts);
    }

    public TipoServico encontrarTipoServico(TipoServico tser) throws ExceptionTipoServico {
        for(TipoServico ts : listaTipoServico){
            if(ts.equals(tser)){
                return ts;
            }
        }
        throw new ExceptionTipoServico("TipoServiço não existe");
    }

    public TipoServico encontrarTipoServico(int codigo) throws ExceptionTipoServico {
        for(TipoServico ts : listaTipoServico){
            if(ts.getCodigo() == codigo){
                return ts;
            }
        }
        throw new ExceptionTipoServico("TipoServiço não existe");
    }

    public String consultarTipoServico() throws ExceptionTipoServico {
        StringBuilder lst = new StringBuilder();
        if(listaTipoServico.size() == 0){ throw new ExceptionTipoServico("Tipo de Serviço não encontrado!!!"); }
        for(TipoServico ts : listaTipoServico) {
            lst.append(ts.toString());
            lst.append("\n");
        }
        return lst.toString();
    }

    private void inserirTipoServico(TipoServico ts) { this.listaTipoServico.add(ts); }





    public Convencao novaConvencao() { return new Convencao(); }

    public void registarConvencao(Convencao c) throws ExceptionConvencao {
        encontrarConvencao(c);
        inserirConvencao(c);
    }

    public Convencao encontrarConvencao(Convencao conv) throws ExceptionConvencao {
        for(Convencao c : listaConvencoes){
            if(c.equals(conv)){
                return c;
            }
        }
        throw new ExceptionConvencao("Convenção não existe!");
    }

    public Convencao encontrarConvencao(int codigo) throws ExceptionConvencao {
        for(Convencao c : listaConvencoes){
            if(c.getCodigo() == codigo){
                return c;
            }
        }
        throw new ExceptionConvencao("Convenção não existe!");
    }

    public String consultarConvencoes() throws ExceptionConvencao {
        StringBuilder lst = new StringBuilder();
        if(listaConvencoes.size() == 0){ throw new ExceptionConvencao("Convenção não encontrada!!!"); }
        for(Convencao c : listaConvencoes) {
            lst.append(c.toString());
            lst.append("\n");
        }
        return lst.toString();
    }

    private void inserirConvencao(Convencao c) { this.listaConvencoes.add(c); }






    public Cliente novoCliente() { return new Cliente(); }

    public void registarCliente(Cliente cl) throws ExceptionCliente {
        encontrarCliente(cl);
        inserirCliente(cl);

    }

    public Cliente encontrarCliente(Cliente cl) throws ExceptionCliente {
        for(Cliente c : listaClientes){
            if(c.equals(cl)){
                return c;
            }
        }
        throw new ExceptionCliente("Cliente não existe!");
    }

    public Cliente encontrarCliente(int codigo) throws ExceptionCliente {
        for(Cliente c : listaClientes){
            if(c.getCodigo() == codigo){
                return c;
            }
        }
        throw new ExceptionCliente("Cliente não existe!");
    }

    public String consultarClientes() throws ExceptionCliente {
        StringBuilder lst = new StringBuilder();
        if(listaClientes.size() == 0){ throw new ExceptionCliente("Cliente não encontrado!!!"); }
        for(Cliente cl : listaClientes) {
            lst.append(cl.toString());
            lst.append("\n");
        }
        return lst.toString();
    }

    private void inserirCliente(Cliente cl) { this.listaClientes.add(cl); }

    public boolean loginCliente(Cliente cliente) {
        for(Cliente cl : listaClientes){
            if(cl.login(cliente)){
                return true;
            }
        }
        return false;
    }






    public Marcacao novaMarcacao() { return new Marcacao(); }

    public void registarMarcacao(Marcacao m) throws ExceptionMarcacao {
        encontrarMarcacao(m);
        inserirMarcacao(m);
    }

    public Marcacao encontrarMarcacao(Marcacao mar) throws ExceptionMarcacao {
        for(Marcacao m : listaMarcacoes){
            if(m.equals(mar)){
                return m;
            }
        }
        throw new ExceptionMarcacao("Marcação não existe!");
    }

    public Marcacao encontrarMarcacao(int codigo) throws ExceptionMarcacao {
        for(Marcacao m : listaMarcacoes){
            if(m.getId() == codigo){
                return m;
            }
        }
        throw new ExceptionMarcacao("Cliente não existe!");
    }

    public String consultarMarcacoes() throws ExceptionMarcacao {
        StringBuilder lst = new StringBuilder();
        if(listaMarcacoes.size() == 0){ throw new ExceptionMarcacao("Marcação não encontrado!!!"); }
        for(Marcacao m : listaMarcacoes) {
            lst.append(m.toString());
            lst.append("\n");
        }
        return lst.toString();
    }

    private void inserirMarcacao(Marcacao m) { this.listaMarcacoes.add(m); }

    

    






}
