package com.anams.Controller;

import java.util.List;

import com.anams.Exception.ExceptionEspecialidade;
import com.anams.Exception.ExceptionSlot;
import com.anams.Exception.ExceptionMedico;
import com.anams.Model.Cliente;
import com.anams.Model.Clinica;
import com.anams.Model.Entrada;
import com.anams.Model.Especialidade;
import com.anams.Model.Marcacao;
import com.anams.Model.Medico;
import com.anams.Model.SlotDiario;
import com.anams.Utils.Data;

public class UC11Controller {
    private Clinica clinica;
    private Marcacao marcacao;

    private Especialidade e;
    private Medico m;

    public UC11Controller(Clinica c){
        this.clinica = c;
    }

    public void novaMarcacao(Cliente cliente) { this.marcacao = new Marcacao(); this.marcacao.setCliente(cliente); }

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

    public void setData(Data data) { this.marcacao.setDia(data); }

    public String verSlot() { return this.marcacao.toString(); }

    public String procurarVagas() throws ExceptionSlot{
        StringBuilder sb = new StringBuilder();
        List<SlotDiario> slots = m.getCalendario().getDias();
        for(SlotDiario slot : slots){
            List<Entrada> entradas = slot.getEntradas();
            for(Entrada entrada : entradas){
                if(!entrada.getEstado()){
                    sb.append(entrada);
                }
            }
        }
        return sb.toString();
    }

    public void escolherVaga(int codigoVaga) {
        List<SlotDiario> slots = m.getCalendario().getDias();
        for(SlotDiario slot : slots){
            List<Entrada> entradas = slot.getEntradas();
            for(Entrada entrada : entradas){
                if(entrada.getCodigo() == codigoVaga){
                    entrada.setEstado(true);
                }
            }
        }
    }

    public void guardarMarcacao() {
        clinica.guardarMarcacao(marcacao);
    }

}
