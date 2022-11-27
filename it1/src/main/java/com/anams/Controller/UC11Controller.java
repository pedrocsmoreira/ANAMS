package com.anams.Controller;

import com.anams.Exception.ExceptionEspecialidade;
import com.anams.Exception.ExceptionSlot;
import com.anams.Exception.ExceptionMedico;
import com.anams.Model.Cliente;
import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;
import com.anams.Model.Medico;
import com.anams.Model.Slot;
import com.anams.Utils.Data;

public class UC11Controller {
    private Clinica clinica;
    private Slot slot;

    private Especialidade e;
    private Medico m;

    public UC11Controller(Clinica c){
        this.clinica = c;
    }

    public void novoSlot(Cliente cliente) { this.slot = new Slot(); this.slot.setCliente(cliente); this.slot.setStatus(true); }

    public String verEspecialidades() throws ExceptionEspecialidade{
        return clinica.consultarEspecialidades();
    }

    public void verificarEspecialidade(int codigo) throws ExceptionEspecialidade{
        e = this.clinica.encontrarEspecialidade(codigo);
    }

    public String procurarMedicos() throws ExceptionMedico{
        return clinica.consultarMedicos(e);
    }

    public void verificarMedico(int codigo) throws ExceptionMedico{
        m = this.clinica.encontrarMedico(codigo);
    }

    public void setData(Data data) { this.slot.setData(data); }

    public String verSlot() { return this.slot.toString(); }

    public void procurarVagas() throws ExceptionSlot{
        m.consultarSlotsVagos();
    }

    public void escolherVaga(int codigoVaga) throws ExceptionSlot {
        Slot s = m.encontrarSlot(codigoVaga);
        this.slot.setHoraInicio(s.getHoraInicio());
        this.slot.setHoraFim(s.getHoraFim());
    }

    public void guardarMarcacao() {
        this.m.registarSlot(slot);
    }

    

    

}
