package com.anams.Model;

import java.util.ArrayList;
import java.util.Optional;

import com.anams.Exception.ExceptionMedico.ExceptionMedicoExiste;
import com.anams.Exception.ExceptionMedico.ExceptionMedicoNaoExiste;
import com.anams.Exception.ExceptionServico.ExceptionServicoExiste;
import com.anams.Exception.ExceptionServico.ExceptionServicoNaoExiste;
import com.anams.Exception.ExceptionTipoServico.ExceptionTipoServicoExiste;
import com.anams.Exception.ExceptionTipoServico.ExceptionTipoServicoNaoExiste;
import com.anams.Exception.ExceptionConvencao.ExceptionConvencaoExiste;
import com.anams.Exception.ExceptionConvencao.ExceptionConvencaoNaoExiste;
import com.anams.Exception.ExceptionEspecialidade.ExceptionEspecialidadeExiste;
import com.anams.Exception.ExceptionEspecialidade.ExceptionEspecialidadeNaoExiste;

public class Clinica {
    private String nome;
    private String endereco;
    private int nif;
    private int contacto;
    private String website;

    private ArrayList<Especialidade> listaEspecialidades;
    private ArrayList<Medico> listaMedicos;
    private ArrayList<TipoServico> listaTipoServico;
    private ArrayList<Servico> listaServicos;
    private ArrayList<Convencao> listaConvencoes;

    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;

    /**
     * 
     * 
     */
    public Clinica(){
        this.nome = STR_DEFAULT;
        this.endereco = STR_DEFAULT;
        this.nif = INT_DEFAULT;
        this.contacto = INT_DEFAULT;
        this.website = STR_DEFAULT;
        this.listaEspecialidades = new ArrayList<Especialidade>();
        this.listaMedicos = new ArrayList<Medico>();
        this.listaTipoServico = new ArrayList<TipoServico>();
        this.listaServicos = new ArrayList<Servico>();
        this.listaConvencoes =  new ArrayList<Convencao>();
    }

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
     * 
     * 
     * @param endereco
     */
    public void setEndereco(String endereco){ this.endereco = endereco; }

    /**
     * 
     * 
     * @return endereco
     */
    public String getEndereco(){ return this.endereco; }

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
     * @param contacto
     */
    public void setContacto(int contacto){ this.contacto = contacto; }

    /**
     * 
     * 
     * @return contacto
     */
    public int getContacto(){ return this.contacto; }

    /**
     * 
     * 
     * @param website
     */
    public void setWebsite(String website){ this.website = website; }

    /**
     * 
     * 
     * @return website
     */
    public String getWebsite(){ return this.website; }



    /**
     * 
     * 
     * @param listaEspecialidades
     */
    public void setListaEspecialidades(ArrayList<Especialidade> listaEspecialidades){ this.listaEspecialidades = listaEspecialidades; }

    /**
     * 
     * 
     * @return
     */
    public ArrayList<Especialidade> getListaEspecialidades(){ return this.listaEspecialidades; }

    /**
     * 
     * 
     * @param listaMedicos
     */
    public void setListaMedicos(ArrayList<Medico> listaMedicos){ this.listaMedicos = listaMedicos; }

    /**
     * 
     * 
     * @return listaMedicos
     */
    public ArrayList<Medico> getListaMedicos(){ return this.listaMedicos; }

    /**
     * 
     * 
     * @param listaTipoServicos
     */
    public void setListaTipoServicos(ArrayList<TipoServico> listaTipoServicos){ this.listaTipoServico = listaTipoServicos; }

    /**
     * 
     * 
     * @return listaTipoServicos
     */
    public ArrayList<TipoServico> getListaTipoServicos(){ return this.listaTipoServico; }

    /**
     * 
     * 
     * @param listaServicos
     */
    public void setListaServicos(ArrayList<Servico> listaServicos){ this.listaServicos = listaServicos; }

    /**
     * 
     * 
     * @return listaServicos
     */
    public ArrayList<Servico> getListaServicos(){ return this.listaServicos; }

    /**
     * 
     * 
     * @param listaConvencoes
     */
    public void setListaConvencoes(ArrayList<Convencao> listaConvencoes){ this.listaConvencoes = listaConvencoes; }

    /**
     * 
     * 
     * @return listaConvencoes
     */
    public ArrayList<Convencao> getListaConvencoes(){ return this.listaConvencoes; }



    /**
     * 
     * 
     * @param e
     */
    public void inserirEspecialidade(Especialidade e){ this.listaEspecialidades.add(e); }

    /**
     * 
     * 
     * @param m
     */
    public void inserirMedico(Medico m){ this.listaMedicos.add(m); }

    /**
     * 
     * 
     * @param ts
     */
    public void inserirTipoServico(TipoServico ts){ this.listaTipoServico.add(ts); }

    /**
     * 
     * 
     * @param s
     */
    public void inserirServico(Servico s){this.listaServicos.add(s); }

    /**
     * 
     * 
     * @param c
     */
    public void inserirConvencao(Convencao c){ this.listaConvencoes.add(c); }


    //ERRO ESTAO INVERSOS; DEVIAM RETORNAR QUANDO EXISTE; NAO O CONTRARIO

    public Medico procurarMedicoCodigo(int codigo){
        Optional<Medico> optionalVariable = listaMedicos.stream().filter(element -> (element.getCodigo() == codigo)).findFirst();
        Medico med = optionalVariable.orElseThrow(() -> new NullPointerException());
        return med;
    }

    public Medico procurarMedicoNome(String nome){
        Optional<Medico> optionalVariable = listaMedicos.stream().filter(element -> (element.getNome().equals(nome))).findFirst();
        Medico med = optionalVariable.orElseThrow(() -> new NullPointerException());
        return med;
    }

    public Medico procurarMedicoCedula(int cedula){
        Optional<Medico> optionalVariable = listaMedicos.stream().filter(element -> (element.getCedula() == cedula)).findFirst();
        Medico med = optionalVariable.orElseThrow(() -> new NullPointerException());
        return med;
    }

    public Medico procurarMedicoNif(int nif){
        Optional<Medico> optionalVariable = listaMedicos.stream().filter(element -> (element.getNif() == nif)).findFirst();
        Medico med = optionalVariable.orElseThrow(() -> new NullPointerException());
        return med;
    }



    /**
     * 
     * 
     * @param m
     * @throws ExceptionMedicoExiste
     */
    public void registarMedico(Medico m) throws ExceptionMedicoExiste{
        encontrarMedico(m);
        inserirMedico(m);
    }

    public Medico encontrarMedico(Medico m) throws ExceptionMedicoExiste{
        Optional<Medico> optionalVariable = listaMedicos.stream().filter(element -> element.getCodigo() == m.getCodigo()).findFirst();
        return optionalVariable.orElseThrow(() -> new ExceptionMedicoExiste("Médico não encontrado!!!"));
    }

    /**
     * 
     * 
     * @param s
     * @throws ExceptionServicoExiste
     */
    public void registarServico(Servico s) throws ExceptionServicoExiste {
        encontrarServico(s);
        inserirServico(s);
    }

    public Servico encontrarServico(Servico s) throws ExceptionServicoExiste{
        Optional<Servico> optionalVariable = listaServicos.stream().filter(element -> element.getCodigo() == s.getCodigo()).findFirst();
        return optionalVariable.orElseThrow(() -> new ExceptionServicoExiste("Servico não encontrado!!!"));
    }



    /**
     * 
     * 
     * @param ts
     * @throws ExceptionTipoServicoExiste
     */
    public void registarTipoServico(TipoServico ts) throws ExceptionTipoServicoExiste{
        try{
            encontrarTipoServico(ts);
            throw new ExceptionTipoServicoExiste("Tipo de Serviço já existe");
        }catch (ExceptionTipoServicoNaoExiste e){
            inserirTipoServico(ts);
        }
    }

    public TipoServico encontrarTipoServico(TipoServico ts) throws ExceptionTipoServicoNaoExiste{
        Optional<TipoServico> optionalVariable = listaTipoServico.stream().filter(element -> element.getCodigo() == ts.getCodigo()).findFirst();
        return optionalVariable.orElseThrow(() -> new ExceptionTipoServicoNaoExiste("Servico não encontrado!!!"));
    }



    public String consultarMedicos() {
        StringBuilder lst = new StringBuilder();
        for(Medico m : listaMedicos){
            lst.append(m.toString());
            lst.append("\n");
        }
        return lst.toString();
    }

    public String consultarMedicosEspecialidade(int codigo) throws ExceptionEspecialidadeNaoExiste{
        StringBuilder lst = new StringBuilder();
        try{
            Especialidade e = encontrarEspecialidadeCodigo(codigo);
            lst = MedicosEspecialidade(e);
            return lst.toString();
        }catch (ExceptionEspecialidadeNaoExiste e){
            throw e;
        }
    }

    private Especialidade encontrarEspecialidadeCodigo(int codigo) throws ExceptionEspecialidadeNaoExiste{
        Optional<Especialidade> optionalVariable = listaEspecialidades.stream().filter(element -> element.getCodigo() == codigo).findFirst();
        return optionalVariable.orElseThrow(() -> new ExceptionEspecialidadeNaoExiste("Especialide não encontrada!!!"));
    }

    private StringBuilder MedicosEspecialidade(Especialidade e){
        StringBuilder lst = new StringBuilder();
        for(Medico m : listaMedicos) {
            ArrayList<Especialidade> lstEsp = m.getEspecialidades();
            for(Especialidade esp : lstEsp){
                if(esp.equals(e)){
                    lst.append(m.toString());
                    lst.append("\n");
                }
            }
        }
        return lst;
    }



    public String consultarMedicoID(int id) {
        StringBuilder lst = new StringBuilder();
        for(Medico m : listaMedicos) {
            if(m.getCodigo() == id){
                lst.append(m.toString());
                lst.append("\n");
            }
        }
        return lst.toString();
    }

    public String consultarMedicoNome(String nome) {
        StringBuilder lst = new StringBuilder();
        for(Medico m : listaMedicos) {
            if(m.getNome().equals(nome)){
                lst.append(m.toString());
                lst.append("\n");
            }
        }
        return lst.toString();
    }

    public String consultarMedicoCedula(int cedula) {
        StringBuilder lst = new StringBuilder();
        for(Medico m : listaMedicos) {
            if(m.getCedula() == cedula){
                lst.append(m.toString());
                lst.append("\n");
            }
        }
        return lst.toString();
    }

    public String consultarMedicoContacto(int contacto) {
        StringBuilder lst = new StringBuilder();
        for(Medico m : listaMedicos) {
            if(m.getContacto() == contacto){
                lst.append(m.toString());
                lst.append("\n");
            }
        }
        return lst.toString();
    }

    public String consultarMedicoEmail(String email) {
        StringBuilder lst = new StringBuilder();
        for(Medico m : listaMedicos) {
            if(m.getEmail().equals(email)){
                lst.append(m.toString());
                lst.append("\n");
            }
        }
        return lst.toString();
    }
    
    public String consultarServicos(){
        StringBuilder lst = new StringBuilder();
        for(Servico s : listaServicos) {
            lst.append(s.toString());
            lst.append("\n");
        }
        return lst.toString();
    }

    public String consultarServicosTipo(int codigo){
        StringBuilder lst = new StringBuilder();
        for(Servico s : listaServicos) {
            if(s.getTipoServico().getCodigo() == codigo){
                lst.append(s.toString());
                lst.append("\n");
            }
        }
        return lst.toString();
    }

    public String consultarEspecialidades(){
        StringBuilder lst = new StringBuilder();
        for(Especialidade esp : listaEspecialidades) {
            lst.append(esp.toString());
            lst.append("\n");
        }
        return lst.toString();
    }
    
    public String consultarTipoServico(){
        StringBuilder lst = new StringBuilder();
        for(TipoServico ts : listaTipoServico) {
            lst.append(ts.toString());
            lst.append("\n");
        }
        return lst.toString();
    }

    public String consultarConvencoes(){
        StringBuilder lst = new StringBuilder();
        for(Convencao c : listaConvencoes) {
            lst.append(c.toString());
            lst.append("\n");
        }
        return lst.toString();
    }




    /**
     * 
     * 
     * @param c
     * @throws ExceptionConvencaoExiste
     */
    public void registarConvencao(Convencao c) throws ExceptionConvencaoExiste{
        try{
            encontrarConvencao(c);
            throw new ExceptionConvencaoExiste("Convenção já existe!!!");
        }catch (ExceptionConvencaoNaoExiste e){
            inserirConvencao(c);
        }
    }

    public Convencao encontrarConvencao(Convencao c) throws ExceptionConvencaoNaoExiste{
        Optional<Convencao> optionalVariable = listaConvencoes.stream().filter(element -> element.getCodigo() == c.getCodigo()).findFirst();
        return optionalVariable.orElseThrow(() -> new ExceptionConvencaoNaoExiste("Convenção não encontrado!!!"));
    }



    /**
     * 
     * 
     * @param codigo
     */
    public void removerEspecialidadeCodigo(int codigo){
        Optional<Especialidade> optionalVariable = listaEspecialidades.stream().filter(element -> (element.getCodigo() == codigo)).findFirst();
        Especialidade esp = optionalVariable.orElseThrow(() -> new NullPointerException());
    }

    /**
     * 
     * 
     * @param designacao
     */
    public void removerEspecialidadeDesignacao(String designacao){
        Optional<Especialidade> optionalVariable = listaEspecialidades.stream().filter(element -> element.getDesignacao().equals(designacao)).findFirst();
        Especialidade esp = optionalVariable.orElseThrow(() -> new NullPointerException());
    }

    /**
     * 
     * 
     * @param acronimo
     */
    public void removerEspecialidadeAcronimo(String acronimo){
        Optional<Especialidade> optionalVariable = listaEspecialidades.stream().filter(element -> element.getAcronimo().equals(acronimo)).findFirst();
        Especialidade esp = optionalVariable.orElseThrow(() -> new NullPointerException());
    }

}