package com.anams.Model;

import com.anams.Utils.Data;

public class Marcacao {
    private int id;
    private Medico med;
    private Cliente cl;
    private Data dia;

    private static final int INT_DEFAULT = 0;
    private static final String STR_DEFAULT = "";

    public Marcacao(){
        setId(INT_DEFAULT);
        setMedico(new Medico());
        setCliente(new Cliente());
        setDia(new Data());
    }

    public Marcacao(int id, Medico med, Cliente cl, Data dia){
        setId(id);
        setMedico(med);
        setCliente(cl);
        setDia(dia);
    }

    public void setId(int id) { this.id = id; }

    public int getId() { return this.id; }

    public void setMedico(Medico med) { this.med = med; }

    public Medico getMedico() { return this.med; }
    
    public void setCliente(Cliente cl) { this.cl = cl; }

    public Cliente getCliente() { return this.cl; }

    public void setDia(Data dia) { this.dia = dia; }

    public Data getDia() { return this.dia; }



}
