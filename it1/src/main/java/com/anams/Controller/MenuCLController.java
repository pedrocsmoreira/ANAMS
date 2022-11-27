package com.anams.Controller;

import com.anams.Exception.ExceptionCliente;
import com.anams.Model.Clinica;

public class MenuCLController {
    Clinica clinica;

    public MenuCLController(Clinica c) {
        this.clinica = c;
    }

    public void verificarClientes() throws ExceptionCliente{
        clinica.consultarClientes();
    }
}
