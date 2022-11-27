package com.anams.Model;

import com.anams.Utils.Data;

public class Slot {
    private int id;
    private Data data;
    private int horaInicio;
    private int horaFim;
    private boolean status;
    private Cliente cliente;

    private static int contador = 0;


    private static final int INT_DEFAULT = 0;

    public Slot(){
        setId(++contador);
        setData(new Data());
        setHoraInicio(INT_DEFAULT);
        setHoraFim(INT_DEFAULT);
        setStatus(false);
        setCliente(null);
    }

    public Slot(Data data, int horaInicio, int horaFim, boolean status){
        setId(++contador);
        setData(data);
        setHoraInicio(horaInicio);
        setHoraFim(horaFim);
        setStatus(status);
        setCliente(null);
    }

    public Slot(Data data, int horaInicio, int horaFim, boolean status, Cliente c){
        setId(++contador);
        setData(data);
        setHoraInicio(horaInicio);
        setHoraFim(horaFim);
        setStatus(status);
        setCliente(c);
    }


    private void setId(int id) { this.id = id; }

    public int getId() { return this.id; }

    public void setData(Data data) { this.data = data; }

    public Data getData() { return this.data; }

    public void setHoraInicio(int horaInicio) { this.horaInicio = horaInicio; }
    
    public int getHoraInicio() { return this.horaInicio; }

    public void setHoraFim(int horaFim) { this.id = ++contador; }

    public int getHoraFim() { return this.horaFim; }

    public void setStatus(boolean status) { this.status = status; }

    public boolean getStatus() { return this.status; }

    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public Cliente getCliente() { return this.cliente; }

}
