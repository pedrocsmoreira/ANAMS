package com.anams.Controller;

import com.anams.Model.Clinica;
import com.anams.Model.Servico;
import com.anams.Model.TipoServico;

import java.util.ArrayList;
import java.util.Optional;

import com.anams.Exception.ExceptionServico.ExceptionServicoExiste;

public class UC4Controller {
    private Clinica clinica;
    private Servico s;

    public UC4Controller(Clinica c){
        this.clinica = c;
    }

    /**
     * Criar novo serviço, sem dados
     * 
     */
    public void novoServico(){ setServico(); }

    private void setServico() { this.s = clinica.novoServico(); }
    
    /**
     * Definir o código 
     * 
     * @param codigo
     */
    public void setCodigo(int codigo){ s.setCodigo(codigo); }

    /**
     * 
     * 
     * @param designacao
     */
    public void setDesignacao(String designacao){ s.setDesignacao(designacao); }

    /**
     * 
     * 
     * @param preco
     */
    public void setPreco(float preco){ s.setPreco(preco); }

    public String verTiposServico() {
        ArrayList<TipoServico> listaTS = clinica.getListaTipoServicos();
        StringBuilder str = new StringBuilder();
        for(TipoServico ts : listaTS){ str.append(ts.toString()); }
        return str.toString();
    }

    public TipoServico getTipoServico(int cod) {
        ArrayList<TipoServico> listaTS = clinica.getListaTipoServicos();
        Optional<TipoServico> optionalVariable = listaTS.stream().filter(element -> element.getCodigo() == cod).findFirst();
        TipoServico ts = optionalVariable.orElseThrow(() -> new NullPointerException());
        return ts;
    }

    /**
     * 
     * 
     * @param ts
     */
    public void setTipoServico(TipoServico ts){ s.setTipoServico(ts); }

    /**
     * 
     * 
     * @return s
     */
    public Servico getServico() { return this.s; }

    /**
     * 
     * 
     * @throws ExceptionServicoExiste
     */
    public void registarServico() throws ExceptionServicoExiste { clinica.registarServico(s); }

}
