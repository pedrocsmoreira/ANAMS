package com.anams.Controller;

import com.anams.Model.Clinica;
import com.anams.Model.Servico;
import com.anams.Model.TipoServico;
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
    public void novoServico(){ this.s = new Servico(); }
    
    /**
     * Definir o código 
     * 
     * @param codigo
     */
    public void setCodigo(int codigo){ s.setCodigo(codigo); }

    /**
     * @param designacao
     */
    public void setDesignacao(String designacao){ s.setDesignacao(designacao); }

    /**
     * @param preco
     */
    public void setPreco(float preco){ s.setPreco(preco); }

    /**
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
     * @throws ExceptionServicoExiste
     */
    public void registarServico() throws ExceptionServicoExiste { clinica.registarServico(s); }

}
