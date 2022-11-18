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

    private DC diretorClinico = new DC("root", "root");
    private DG diretorGeral = new DG("root", "root");
    private AA assistenteAdministrativa = new AA("root", "root");

    private ArrayList<Especialidade> listaEspecialidades;
    private ArrayList<Medico> listaMedicos;
    private ArrayList<TipoServico> listaTipoServico;
    private ArrayList<Servico> listaServicos;
    private ArrayList<Convencao> listaConvencoes;

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



    public boolean loginAA(AA aa) {
        if(assistenteAdministrativa.equals(aa)){
            return true;
        }
        return false;
    }

    public boolean loginDC(DC dc) {
        if(diretorClinico.equals(dc)){
            return true;
        }
        return false;
    }

    public boolean loginDG(DG dg) {
        if(diretorGeral.equals(dg)){
            return true;
        }
        return false;
    }




    /**
     * 
     * 
     * @return new Especialidade()
     */
    public Especialidade novaEspecialidade() { return new Especialidade(); }

    /**
     * Método de registo de Especialidades, com verificação da existência do código inserido
     * 
     * @param e
     * @throws ExceptionEspecialidadeExiste
     */
    public void registarEspecialidade(Especialidade e) throws ExceptionEspecialidadeExiste {
        encontrarEspecialidadeCodigo(e.getCodigo());
        inserirEspecialidade(e);
    }

    /**
     * Método de verificação da existência do código inserido
     * 
     * @param codigo
     * @return
     * @throws ExceptionEspecialidadeExiste
     */
    private Especialidade encontrarEspecialidadeCodigo(int codigo) throws ExceptionEspecialidadeExiste {
        Optional<Especialidade> optionalVariable = listaEspecialidades.stream().filter(element -> element.getCodigo() == codigo).findFirst();
        return optionalVariable.orElseThrow(() -> new ExceptionEspecialidadeExiste("Especialidade não encontrada!!!"));
    }

    /**
     * Regista Especialidades passadas por parâmetro
     * 
     * @param e
     */
    private void inserirEspecialidade(Especialidade e) { this.listaEspecialidades.add(e); }



    /**
     * 
     * 
     * @return new Medico()
     */
    public Medico novoMedico() { return new Medico();}

    /**
     * Método de registo de Médicos, com verificação da existência do código inserido
     * 
     * @param m
     * @throws ExceptionMedicoExiste
     */
    public void registarMedico(Medico m) throws ExceptionMedicoExiste {
        encontrarMedico(m);
        inserirMedico(m);
    }

    /**
     * Método de verificação da existência do código inserido
     * 
     * @param m
     * @return
     * @throws ExceptionMedicoExiste
     */
    private Medico encontrarMedico(Medico m) throws ExceptionMedicoExiste {
        Optional<Medico> optionalVariable = listaMedicos.stream().filter(element -> element.getCodigo() == m.getCodigo()).findFirst();
        return optionalVariable.orElseThrow(() -> new ExceptionMedicoExiste("Médico não encontrado!!!"));
    }

    /**
     * Regista Médicos passados por parâmetro
     * 
     * @param m
     */
    private void inserirMedico(Medico m) { this.listaMedicos.add(m); }



    public Servico novoServico() { return new Servico(); }

    /**
     * Método de registo de Serviços, com verificação da existência do código inserido
     * 
     * @param s
     * @throws ExceptionServicoExiste
     */
    public void registarServico(Servico s) throws ExceptionServicoExiste {
        encontrarServico(s);
        inserirServico(s);
    }

    /**
     * Método de verificação da existência do código inserido
     * 
     * @param s
     * @return
     * @throws ExceptionServicoExiste
     */
    private Servico encontrarServico(Servico s) throws ExceptionServicoExiste {
        Optional<Servico> optionalVariable = listaServicos.stream().filter(element -> element.getCodigo() == s.getCodigo()).findFirst();
        return optionalVariable.orElseThrow(() -> new ExceptionServicoExiste("Servico não encontrado!!!"));
    }

    /**
     * Regista Serviços passados por parâmetro
     * 
     * @param s
     */
    private void inserirServico(Servico s) {this.listaServicos.add(s); }



    /**
     * 
     * 
     * @return new TipoServico()
     */
    public TipoServico novoTipoServico() { return new TipoServico(); }

    /**
     * Método de registo de Tipos de Serviço, com verificação da existência do código inserido
     * 
     * @param ts
     * @throws ExceptionTipoServicoExiste
     */
    public void registarTipoServico(TipoServico ts) throws ExceptionTipoServicoExiste {
        try{
            encontrarTipoServico(ts);
            throw new ExceptionTipoServicoExiste("Tipo de Serviço já existe");
        }catch (ExceptionTipoServicoNaoExiste e){
            inserirTipoServico(ts);
        }
    }

    /**
     * Método de verificação da existência do código inserido
     * 
     * @param ts
     * @return
     * @throws ExceptionTipoServicoNaoExiste
     */
    private TipoServico encontrarTipoServico(TipoServico ts) throws ExceptionTipoServicoNaoExiste {
        Optional<TipoServico> optionalVariable = listaTipoServico.stream().filter(element -> element.getCodigo() == ts.getCodigo()).findFirst();
        return optionalVariable.orElseThrow(() -> new ExceptionTipoServicoNaoExiste("Servico não encontrado!!!"));
    }

    /**
     * Regista Tipos de Serviço passado por parâmetro
     * 
     * @param ts
     */
    private void inserirTipoServico(TipoServico ts) { this.listaTipoServico.add(ts); }



    /**
     * 
     * 
     * @return new Convencao()
     */
    public Convencao novaConvencao() { return new Convencao(); }
    
    /**
     * Método de registo de Convenções, com verificação da existência do código inserido
     * 
     * @param c
     * @throws ExceptionConvencaoExiste
     */
    public void registarConvencao(Convencao c) throws ExceptionConvencaoExiste {
        try{
            encontrarConvencao(c);
            throw new ExceptionConvencaoExiste("Convenção já existe!!!");
        }catch (ExceptionConvencaoNaoExiste e){
            inserirConvencao(c);
        }
    }

    /**
     * Método de verificação da existência do código inserido
     * 
     * @param c
     * @return
     * @throws ExceptionConvencaoNaoExiste
     */
    private Convencao encontrarConvencao(Convencao c) throws ExceptionConvencaoNaoExiste {
        Optional<Convencao> optionalVariable = listaConvencoes.stream().filter(element -> element.getCodigo() == c.getCodigo()).findFirst();
        return optionalVariable.orElseThrow(() -> new ExceptionConvencaoNaoExiste("Convenção não encontrado!!!"));
    }

    /**
     * Regista Convenção passada por parâmetro
     * 
     * @param c
     */
    private void inserirConvencao(Convencao c) { this.listaConvencoes.add(c); }
   

    

    

    

    /**
     * Método de procura de Médico pelo código
     * 
     * @param codigo
     * @return
     */
    public Medico procurarMedicoCodigo(int codigo) {
        Optional<Medico> optionalVariable = listaMedicos.stream().filter(element -> (element.getCodigo() == codigo)).findFirst();
        Medico med = optionalVariable.orElseThrow(() -> new NullPointerException());
        return med;
    }

    /**
     * Método de procura de Médico pelo Nome
     * 
     * @param nome
     * @return
     */
    public Medico procurarMedicoNome(String nome) {
        Optional<Medico> optionalVariable = listaMedicos.stream().filter(element -> (element.getNome().equalsIgnoreCase(nome))).findFirst();
        Medico med = optionalVariable.orElseThrow(() -> new NullPointerException());
        return med;
    }

    /**
     * Método de procura de Médico pela Cédula Profissional
     * 
     * @param cedula
     * @return
     */
    public Medico procurarMedicoCedula(int cedula) {
        Optional<Medico> optionalVariable = listaMedicos.stream().filter(element -> (element.getCedula() == cedula)).findFirst();
        Medico med = optionalVariable.orElseThrow(() -> new NullPointerException());
        return med;
    }

    /**
     * Método de procura de Médico pelo NIF
     * 
     * @param nif
     * @return
     */
    public Medico procurarMedicoNif(int nif) {
        Optional<Medico> optionalVariable = listaMedicos.stream().filter(element -> (element.getNif() == nif)).findFirst();
        Medico med = optionalVariable.orElseThrow(() -> new NullPointerException());
        return med;
    }



    






    /**
     * Método de consulta de Médicos
     * 
     * @return
     * @throws ExceptionMedicoNaoExiste
     */
    public String consultarMedicos() throws ExceptionMedicoNaoExiste {
        StringBuilder lst = new StringBuilder();
        if(listaMedicos.size() == 0){ throw new ExceptionMedicoNaoExiste("Médico não encontrado!!!"); }
        for(Medico m : listaMedicos){
            lst.append(m.toString());
            lst.append("\n");
        }
        return lst.toString();
    }

    /**
     * Método principal de consulta de Médicos pela Especialidade, com verificação da Especialidade
     * 
     * @param codigo
     * @return
     * @throws ExceptionEspecialidadeNaoExiste
     * @throws ExceptionMedicoNaoExiste
     */
    public String consultarMedicosEspecialidade(int codigo) throws ExceptionEspecialidadeNaoExiste, ExceptionMedicoNaoExiste {
        StringBuilder lst = new StringBuilder();
        Especialidade e = new Especialidade();
        try{
            e = encontrarEspecialidadeCodigo(codigo);
            throw new ExceptionEspecialidadeNaoExiste("Especialidade não encontrada!!!");
        }catch(ExceptionEspecialidadeExiste err){
            lst = MedicosEspecialidade(e);
        }
        return lst.toString();
    }

    /**
     * Método de consulta de Médicos pela Especialidade
     * 
     * @param e
     * @return
     * @throws ExceptionMedicoNaoExiste
     */
    private StringBuilder MedicosEspecialidade(Especialidade e) throws ExceptionMedicoNaoExiste {
        StringBuilder lst = new StringBuilder();
        int count = 0;
        for(Medico m : listaMedicos) {
            ArrayList<Especialidade> lstEsp = m.getEspecialidades();
            for(Especialidade esp : lstEsp){
                if(esp.equals(e)){
                    lst.append(m.toString());
                    lst.append("\n");
                    count++;
                }
            }
        }
        if(count == 0) { throw new ExceptionMedicoNaoExiste(); }
        return lst;
    }



    /**
     * Método principal de consulta de Médicos pelo ID, com verificação do Id
     * 
     * @param id
     * @return
     * @throws ExceptionMedicoNaoExiste
     */
    public String consultarMedicoID(int id) throws ExceptionMedicoNaoExiste {
        StringBuilder lst = new StringBuilder();
        int count = 0;
        for(Medico m : listaMedicos) {
            if(m.getCodigo() == id){
                lst.append(m.toString());
                lst.append("\n");
                count++;
            }
        }
        if(count == 0){ throw new ExceptionMedicoNaoExiste("Médico não encontrado!!!"); }
        return lst.toString();
    }

    /**
     * Método principal de consulta de Médicos, com verificação do Nome
     * 
     * @param nome
     * @return
     * @throws ExceptionMedicoNaoExiste
     */
    public String consultarMedicoNome(String nome) throws ExceptionMedicoNaoExiste {
        StringBuilder lst = new StringBuilder();
        int count = 0;
        for(Medico m : listaMedicos) {
            if(m.getNome().equalsIgnoreCase(nome)){
                lst.append(m.toString());
                lst.append("\n");
                count++;
            }
        }
        if(count == 0){ throw new ExceptionMedicoNaoExiste("Médico não encontrado!!!"); }
        return lst.toString();
    }

    /**
     * Método principal de consulta de Médicos, com verificação da Cédula Profissional
     * 
     * @param cedula
     * @return
     * @throws ExceptionMedicoNaoExiste
     */
    public String consultarMedicoCedula(int cedula) throws ExceptionMedicoNaoExiste {
        StringBuilder lst = new StringBuilder();
        int count = 0;
        for(Medico m : listaMedicos) {
            if(m.getCedula() == cedula){
                lst.append(m.toString());
                lst.append("\n");
                count++;
            }
        }
        if(count == 0){ throw new ExceptionMedicoNaoExiste("Médico não encontrado!!!"); }
        return lst.toString();
    }

    /**
     * Método principal de consulta de Médicos, com verificação de Contacto
     * 
     * @param contacto
     * @return
     * @throws ExceptionMedicoNaoExiste
     */
    public String consultarMedicoContacto(int contacto) throws ExceptionMedicoNaoExiste {
        StringBuilder lst = new StringBuilder();
        int count = 0;
        for(Medico m : listaMedicos) {
            if(m.getContacto() == contacto){
                lst.append(m.toString());
                lst.append("\n");
                count++;
            }
        }
        if(count == 0){ throw new ExceptionMedicoNaoExiste("Médico não encontrado!!!"); }
        return lst.toString();
    }

    /**
     * Método principal de consulta de Médicos, com verificação de Email
     * 
     * @param email
     * @return
     * @throws ExceptionMedicoNaoExiste
     */
    public String consultarMedicoEmail(String email) throws ExceptionMedicoNaoExiste {
        StringBuilder lst = new StringBuilder();
        int count = 0;
        for(Medico m : listaMedicos) {
            if(m.getEmail().equalsIgnoreCase(email)){
                lst.append(m.toString());
                lst.append("\n");
                count++;
            }
        }
        if(count == 0){ throw new ExceptionMedicoNaoExiste("Médico não encontrado!!!"); }
        return lst.toString();
    }
    
    /**
     * Método principal de consulta de Serviços
     * 
     * @return
     * @throws ExceptionServicoNaoExiste
     */
    public String consultarServicos() throws ExceptionServicoNaoExiste {
        StringBuilder lst = new StringBuilder();
        if(listaServicos.size() == 0){ throw new ExceptionServicoNaoExiste(); }
        for(Servico s : listaServicos) {
            lst.append(s.toString());
            lst.append("\n");
        }
        return lst.toString();
    }

    /**
     * Método principal de consulta de Serviços, com verificação do Tipo de Serviço
     * 
     * @param codigo
     * @return
     * @throws ExceptionTipoServicoNaoExiste
     * @throws ExceptionServicoNaoExiste
     */
    public String consultarServicosTipo(int codigo)  throws ExceptionTipoServicoNaoExiste, ExceptionServicoNaoExiste {
        StringBuilder lst = new StringBuilder();
        TipoServico ts = encontrarTipoServicoCodigo(codigo);
        lst = ServicoTipoServico(ts);
        return lst.toString();
    }

    /**
     * Método principal de consulta de Tipo de Serviço
     * 
     * @param codigo
     * @return
     * @throws ExceptionTipoServicoNaoExiste
     */
    private TipoServico encontrarTipoServicoCodigo(int codigo) throws ExceptionTipoServicoNaoExiste {
        Optional<TipoServico> optionalVariable = listaTipoServico.stream().filter(element -> element.getCodigo() == codigo).findFirst();
        return optionalVariable.orElseThrow(() -> new ExceptionTipoServicoNaoExiste("Tipo de Serviço não encontrada!!!"));
    }

    /**
     * 
     * 
     * @param ts
     * @return
     * @throws ExceptionServicoNaoExiste
     */
    private StringBuilder ServicoTipoServico(TipoServico ts) throws ExceptionServicoNaoExiste {
        StringBuilder lst = new StringBuilder();
        int count = 0;
        for(Servico s : listaServicos) {
            if(s.getTipoServico().equals(ts)){
                lst.append(s.toString());
                lst.append("\n");
                count++;
            }
        }
        if(count == 0){ throw new ExceptionServicoNaoExiste(); }
        return lst;
    }



    /**
     * 
     * 
     * @return
     * @throws ExceptionEspecialidadeNaoExiste
     */
    public String consultarEspecialidades() throws ExceptionEspecialidadeNaoExiste {
        StringBuilder lst = new StringBuilder();
        if(listaEspecialidades.size() == 0){ throw new ExceptionEspecialidadeNaoExiste("Especialidade não encontrada!!!"); }
        for(Especialidade esp : listaEspecialidades) {
            lst.append(esp.toString());
            lst.append("\n");
        }
        return lst.toString();
    }
    
    /**
     * 
     * 
     * @return
     * @throws ExceptionTipoServicoNaoExiste
     */
    public String consultarTipoServico() throws ExceptionTipoServicoNaoExiste {
        StringBuilder lst = new StringBuilder();
        if(listaTipoServico.size() == 0){ throw new ExceptionTipoServicoNaoExiste("Tipo de Serviço não encontrado!!!"); }
        for(TipoServico ts : listaTipoServico) {
            lst.append(ts.toString());
            lst.append("\n");
        }
        return lst.toString();
    }

    /**
     * 
     * 
     * @return
     * @throws ExceptionConvencaoNaoExiste
     */
    public String consultarConvencoes() throws ExceptionConvencaoNaoExiste {
        StringBuilder lst = new StringBuilder();
        if(listaConvencoes.size() == 0){ throw new ExceptionConvencaoNaoExiste("Convenção não encontrada!!!"); }
        for(Convencao c : listaConvencoes) {
            lst.append(c.toString());
            lst.append("\n");
        }
        return lst.toString();
    }





    /**
     * 
     * 
     * @param codigo
     */
    public void removerEspecialidadeCodigo(int codigo) {
        Optional<Especialidade> optionalVariable = listaEspecialidades.stream().filter(element -> (element.getCodigo() == codigo)).findFirst();
        Especialidade esp = optionalVariable.orElseThrow(() -> new NullPointerException());
        listaEspecialidades.remove(esp);
    }

    /**
     * 
     * 
     * @param designacao
     */
    public void removerEspecialidadeDesignacao(String designacao) {
        Optional<Especialidade> optionalVariable = listaEspecialidades.stream().filter(element -> element.getDesignacao().equalsIgnoreCase(designacao)).findFirst();
        Especialidade esp = optionalVariable.orElseThrow(() -> new NullPointerException());
        listaEspecialidades.remove(esp);
    }

    /**
     * 
     * 
     * @param acronimo
     */
    public void removerEspecialidadeAcronimo(String acronimo) {
        Optional<Especialidade> optionalVariable = listaEspecialidades.stream().filter(element -> element.getAcronimo().equalsIgnoreCase(acronimo)).findFirst();
        Especialidade esp = optionalVariable.orElseThrow(() -> new NullPointerException());
        listaEspecialidades.remove(esp);
    }

    public Especialidade verificarCodigo(int codigo) throws ExceptionEspecialidadeNaoExiste {
        for(Especialidade e : listaEspecialidades){
            if(e.getCodigo() == codigo){
                return e;
            }
        }
        throw new ExceptionEspecialidadeNaoExiste();
    }

    /**
     * 
     * 
     * @param e
     * @return
     * @throws ExceptionMedicoNaoExiste
     */
    public String procurarMedicos(Especialidade e) throws ExceptionMedicoNaoExiste {
        StringBuilder str = new StringBuilder();
        int count = 0;
        for(Medico m : listaMedicos){
            if(m.getEspecialidades().contains(e)){
                str.append(m.toString());
                str.append("\n");
                count++;
            }
        }
        if(count == 0){ throw new ExceptionMedicoNaoExiste(); }
        return str.toString();
    }


}
