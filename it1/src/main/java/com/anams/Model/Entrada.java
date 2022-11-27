package com.anams.Model;

public class Entrada {
    private int id;
    private Especialidade esp;
    private TipoServico ts;
    private int horaInicio;
    private int horaFim;
    private int duracao;
    private boolean estado;

    private static int contador = 0;

    public Entrada(){
        this.id = ++contador;
        this.esp =  new Especialidade();
        this.ts = new TipoServico();
        this.horaInicio = 0;
        this.horaFim = 0;
        this.duracao = 0;
        this.estado = false;
    }

    public Entrada(Especialidade esp, TipoServico ts, int horaInicio, int horaFim, int duracao, boolean estado){
        this.id = ++contador;
        this.esp = esp;
        this.ts = ts;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.duracao = duracao;
        this.estado = estado;
    }

    public int getCodigo() { return this.id; }

    public Especialidade getEspecialidade() { return this.esp; }

    public void setEstado(boolean estado) { this.estado = estado; }

    public boolean getEstado() { return this.estado; }


}
