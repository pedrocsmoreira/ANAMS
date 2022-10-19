package com.anams.Controller;

import java.util.ArrayList;

import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;
import com.anams.Utils.Data;

public class UC1Controller {
    private Clinica clinica;
    private Especialidade especialidade;

    public UC1Controller(Clinica c){ this.clinica = c; }

    public ArrayList<Especialidade> verEspecialidades() { return clinica.getListaEspecialidades(); }

    public void novaEspecialidade(){ this.especialidade = new Especialidade(); }

    public void setCodigo(int codigo) { especialidade.setCodigo(codigo); }

    public void setDesignacao(String designacao) { especialidade.setDesignacao(designacao); }

    public void setAcronimo(String acronimo) { especialidade.setAcronimo(acronimo); }

    public void setDataArranque(Data dataArranque) { especialidade.setDataArranque(dataArranque); }

    public Especialidade getDados() { return this.especialidade; }

    public void inserirEspecialidade() { clinica.inserirEspecialidade(especialidade); }

}
