package com.anams.Model;

import java.util.ArrayList;
import java.util.List;

public class SlotDiario {
    private int id;
    private int dia;
    private List<Entrada> entradas;

    private static int contador = 0;

    public SlotDiario(){
        this.id = ++contador;
        this.dia = 0;
        this.entradas = new ArrayList<Entrada>();
    }

    public SlotDiario(int dia){
        this.id = ++contador;
        this.dia = dia;
        this.entradas = new ArrayList<Entrada>();
    }

    public SlotDiario(int dia, List<Entrada> entradas){
        this.id = ++contador;
        this.dia = dia;
        this.entradas = entradas;
    }

    public void setEntradas(List<Entrada> entradas) { this.entradas = entradas; }

    public List<Entrada> getEntradas() { return this.entradas; }

    public void addEntrada(Entrada entrada) { this.entradas.add(entrada); }
}
