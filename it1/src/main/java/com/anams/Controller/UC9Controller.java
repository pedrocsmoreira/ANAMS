package com.anams.Controller;

import java.time.LocalDate;
import java.util.ArrayList;

import com.anams.Model.CalendarioMensal;
import com.anams.Model.Clinica;
import com.anams.Model.Entrada;
import com.anams.Model.Especialidade;
import com.anams.Model.Medico;
import com.anams.Model.SlotDiario;
import com.anams.Model.TipoServico;
import com.anams.Utils.Data;

public class UC9Controller {
    private Clinica clinica;
    private Medico medico;
    CalendarioMensal calendario;
    SlotDiario slot;

    public UC9Controller(Clinica c){
        this.clinica = c;
    }

    public ArrayList<Especialidade> getEspecialidades() { return medico.getEspecialidades(); }

    public ArrayList<TipoServico> getTiposServico(){ return this.clinica.getListaTipoServicos(); }

    public int novoCalendarioMensal() {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int monthDays = date.lengthOfMonth();
        
        this.calendario = new CalendarioMensal(month, monthDays);

        return monthDays;
    }

    public void novoSlotDiario() {
        this.slot = new SlotDiario();
    }

    public void criarEntrada(Especialidade e, TipoServico ts, Data data, int horaInicio, int horaFim, int duracao) {
        slot.addEntrada(new Entrada(e, ts, horaInicio, horaFim, duracao, false));
    }

    public void guardarSlot() {
        this.calendario.addSlot(slot);
    }

    public String verCalendario() {
        return calendario.toString();
    }

    public void guardarCalendario() {
        medico.setCalendario(calendario);
    }

}
