package com.anams.Model;

import java.util.ArrayList;
import java.util.List;

public class CalendarioMensal {
    private int id;
    private int mes;
    private int nDias;
    private List<SlotDiario> dias;

    private static int contador = 0;

    public CalendarioMensal(){
        this.id = ++contador;
        this.mes = 0;
        this.nDias = 0;
        this.dias = new ArrayList<SlotDiario>();
    }

    public CalendarioMensal(int mes, int nDias){
        this.id = ++contador;
        this.mes = mes;
        this.nDias = nDias;
        this.dias = new ArrayList<SlotDiario>();
    }

    public CalendarioMensal(int mes, int nDias, List<SlotDiario> dias){
        this.id = ++contador;
        this.mes = mes;
        this.nDias = nDias;
        this.dias = dias;
    }

    public void addSlot(SlotDiario slot) {
        this.dias.add(slot);
    }

    public void setDias(List<SlotDiario> dias) { this.dias = dias; }

    public List<SlotDiario> getDias() { return this.dias; }
   
}
