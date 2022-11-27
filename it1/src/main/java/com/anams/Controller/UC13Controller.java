package com.anams.Controller;

import java.util.ArrayList;
import java.util.List;

import com.anams.Exception.ExceptionEspecialidade;
import com.anams.Model.Clinica;
import com.anams.Model.Entrada;
import com.anams.Model.Especialidade;
import com.anams.Model.Medico;
import com.anams.Model.SlotDiario;

//Consultar Vagas para consulta de uma especialidade

public class UC13Controller {
    private Clinica clinica;
    private Especialidade e;

    public UC13Controller(Clinica c){
        this.clinica = c;
    }
    
    public String verEspecialidades() throws ExceptionEspecialidade{
        ArrayList<Especialidade> lst = this.clinica.getListaEspecialidades();
        if(lst.size() == 0) { throw new ExceptionEspecialidade(); }
        StringBuilder str = new StringBuilder();
        for(Especialidade e : lst){
            str.append(e.toString());
            str.append("\n");
        }
        return str.toString();
    }

    public void verificarEspecialidade(int codigo) throws ExceptionEspecialidade{
        e = this.clinica.encontrarEspecialidade(codigo);
    }

    public String escolherVaga() {
        StringBuilder sb = new StringBuilder();
        try {
            List<SlotDiario> slots = new ArrayList<SlotDiario>();
            List<Medico> med = clinica.procurarMedicos(e);
            for(Medico m : med){
                List<SlotDiario> slot = m.getCalendario().getDias();
                for(SlotDiario s : slot){
                    slots.add(s);
                }
            }
            for(SlotDiario slot : slots){
                List<Entrada> entradas = slot.getEntradas();
                for(Entrada entrada : entradas){
                    if(!entrada.getEstado() && entrada.getEspecialidade().equals(e)){
                        sb.append(entrada.toString());
                    }
                }
            }
            return sb.toString();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }




}
