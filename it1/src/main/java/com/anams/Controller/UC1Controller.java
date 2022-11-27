package com.anams.Controller;

import java.util.ArrayList;

import com.anams.Exception.ExceptionEspecialidade;
import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;
import com.anams.Utils.Data;

public class UC1Controller {
    private Clinica clinica;
    private Especialidade especialidade;

    public UC1Controller(Clinica c){ this.clinica = c; }

    public String verEspecialidades() {
        ArrayList<Especialidade> especialidades = clinica.getListaEspecialidades();
        StringBuilder str = new StringBuilder();
        for(Especialidade e : especialidades){ str.append(e.toString()); }
        return str.toString();
    }

    public void novaEspecialidade(){ setEspecialidade(); }

    private void setEspecialidade() { this.especialidade = clinica.novaEspecialidade(); }

    public void setCodigo(int codigo) { especialidade.setCodigo(codigo); }

    public void setDesignacao(String designacao) { especialidade.setDesignacao(designacao); }

    public void setAcronimo(String acronimo) { especialidade.setAcronimo(acronimo); }

    public void setDataArranque(Data dataArranque) { especialidade.setDataArranque(dataArranque); }

    public Especialidade getDados() { return this.especialidade; }

    public void registarEspecialidade() throws ExceptionEspecialidade { clinica.registarEspecialidade(especialidade); }

}
