package com.anams.Controller;

import com.anams.Model.Cliente;
import com.anams.Model.Clinica;

//Consultar Marcações

public class UC12Controller {
    private Clinica clinica;
    private Cliente cliente;

    public UC12Controller(Clinica c){
        this.clinica = c;
    }

    public String procurarMarcacoes(Cliente cliente){
        this.cliente = cliente;
        return this.cliente.getCalendario().toString();
    }

}
