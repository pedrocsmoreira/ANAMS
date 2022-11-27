package com.anams.Controller;

import java.util.ArrayList;

import com.anams.Model.Calendario;
import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;
import com.anams.Model.Medico;
import com.anams.Model.Slot;
import com.anams.Model.TipoServico;
import com.anams.Utils.Data;

public class UC9Controller {
    private Clinica clinica;
    private Medico medico;
    Calendario calendario;

    //Registo de Calendário

    public UC9Controller(Clinica c){
        this.clinica = c;
    }

    public void novoCalendario(Medico medico) {
        this.medico = medico;
        this.calendario = new Calendario();
    }

    public ArrayList<Especialidade> getEspecialidades() { return medico.getEspecialidades(); }

    public ArrayList<TipoServico> getTiposServico(){ return this.clinica.getListaTipoServicos(); }

    public void criarSlots(Data data, int horaInicio, int horaFim, int duracao) {
        int tempo = (horaFim - horaInicio) * 60;
        int numSlots = tempo / duracao;
        for(int i = 0; i < numSlots; i++){
            int inicio = horaInicio * 60 + i;
            int fim = inicio + duracao;
            Slot s = new Slot(data, inicio, fim, false);
            calendario.setSlot(s);
        }
    }

    public void registarCalendario() {
        medico.setCalendario(calendario);
        clinica.registarCalendario(calendario);
    }

}
