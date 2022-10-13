package com.anams.Controller;

import java.util.ArrayList;

import com.anams.Model.Clinica; 
import com.anams.Model.Especialidade;

public class UC1Controller {
    private Clinica clinica;
    private Especialidade e;

    public UC1Controller(Clinica c){
        this.clinica = c;
        this.e = new Especialidade();
    }

    public ArrayList<Especialidade> getEspecialidades(){
        return clinica.getListaEspecialidades();
    }

    public void setEspecialidade(int num){  

    }



    /*
        public Medico procurarMedicoCodigo(int codigo){
            return clinica.procurarMedicoCodigo(codigo);
        }

        public Medico procurarMedicoNome(String nome){
            return clinica.procurarMedicoNome(nome);
        }

        public Medico procurarMedicoCedula(int cedula){
            return clinica.procurarMedicoCedula(cedula);
        }

        public Medico procurarMedicoNif(int nif){
            return clinica.procurarMedicoNif(nif);
        }
     */
    
}