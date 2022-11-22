package com.anams.Model;

import com.anams.Utils.Data;

public class Marcacao {
    private int id;
    private Medico medico;
    private Especialidade especialidade;
    private Cliente cliente;
    private Data dia;

    private static int contador = 0;

    public Marcacao(){
        setId(++contador);
        setMedico(new Medico());
        setEspecialidade(new Especialidade());
        setCliente(new Cliente());
        setDia(new Data());
    }

    public Marcacao(Medico med, Cliente cl, Especialidade esp, Data dia){
        setId(++contador);
        setMedico(med);
        setEspecialidade(esp);
        setCliente(cl);
        setDia(dia);
    }

    public void setId(int id) { this.id = id; }

    public int getId() { return this.id; }

    public void setMedico(Medico med) { this.medico = med; }

    public Medico getMedico() { return this.medico; }

    public void setEspecialidade(Especialidade esp) { this.especialidade = esp; }

    public Especialidade getEspecialidade() { return this.especialidade; }
    
    public void setCliente(Cliente cl) { this.cliente = cl; }

    public Cliente getCliente() { return this.cliente; }

    public void setDia(Data dia) { this.dia = dia; }

    public Data getDia() { return this.dia; }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\n\tCódigo -> ");
        sb.append(this.id);
        sb.append("\n\tMédico -> ");
        sb.append(this.medico);
        sb.append("\n\tCliente -> ");
        sb.append(this.cliente);
        sb.append("\n\tData de Marcação -> ");
        sb.append(this.dia);
        return sb.toString();
    }

    @Override
    public boolean equals(Object outro) {
        if(this == outro) {
            return true;
        }
        if(outro == null || this.getClass() != outro.getClass()) {
            return false;
        }
        Marcacao obj = (Marcacao) outro;
        return this.id == obj.id
                && this.medico.equals(obj.medico)
                && this.cliente.equals(obj.cliente)
                && this.dia.equals(obj.dia);
    }

}
