package com.anams.Controller;

import java.util.List;

import javax.crypto.ExemptionMechanismException;

import com.anams.Model.Clinica;
import com.anams.Model.Entrada;
import com.anams.Model.Medico;
import com.anams.Model.SlotDiario;

public class UC10Controller {
    private Clinica clinica;
    private Medico medico;

    public UC10Controller(Clinica c){
        this.clinica = c;
    }

    public String procurarMarcacoes(Medico medico) {
        this.medico = medico;
        StringBuilder sb = new StringBuilder();
        List<SlotDiario> slots = medico.getCalendario().getDias();
        for(SlotDiario s : slots){
            List<Entrada> entradas = s.getEntradas();
            for(Entrada e : entradas){
                if(e.getEstado()){
                    sb.append(e.toString());
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }
}
