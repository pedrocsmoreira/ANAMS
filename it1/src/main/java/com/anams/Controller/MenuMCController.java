package com.anams.Controller;

import com.anams.Exception.ExceptionMedico;
import com.anams.Model.Clinica;

public class MenuMCController {
    Clinica clinica;

    public MenuMCController(Clinica c) {
        this.clinica = c;
    }

    public void verificarMedicos() throws ExceptionMedico{
        clinica.consultarMedicos();
    }
}
