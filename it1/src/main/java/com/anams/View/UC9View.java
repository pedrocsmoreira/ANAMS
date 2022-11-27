package com.anams.View;

import java.io.Console;
import java.time.LocalDate;
import java.util.ArrayList;

import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;
import com.anams.Model.Medico;
import com.anams.Model.TipoServico;
import com.anams.Utils.Data;
import com.anams.Controller.UC9Controller;

public class UC9View {
    private Console console = System.console();
    private Clinica clinica;
    private UC9Controller controller;
    private Medico medico;

    /**
     * Construtor
     * 
     * @param c
     */
    public UC9View(Clinica c){
        this.clinica = c;
        this.controller = new UC9Controller(clinica);
    }

    public void run(Medico m){
        this.medico = m;
        System.out.println("---------- Registo de Calendário ----------");

        int dias = controller.novoCalendarioMensal();

        ArrayList<Especialidade> listaEspecialidades = controller.getEspecialidades();
        ArrayList<TipoServico> listaTiposServico = controller.getTiposServico();

        for(int n = 0; n < dias; n++){
            controller.novoSlotDiario();
            for(int i = 0; i < listaEspecialidades.size(); i++){
                System.out.println(listaEspecialidades.get(i));
                for(int j = 0; j < listaTiposServico.size(); j++){
                    System.out.println(listaTiposServico.get(j));
                    Data data = getData();
                    int horaInicio = getHoraInicio();
                    int horaFim = getHoraFim(horaInicio);
                    int duracao = getDuracao();
                    controller.criarEntrada(listaEspecialidades.get(i), listaTiposServico.get(j), data, horaInicio, horaFim, duracao);
                }
            }
            controller.guardarSlot();
        }

        System.out.println(controller.verCalendario());

        String opcao = console.readLine("Pretende registar o calendário? (Y/N):");

        if(!opcao.equalsIgnoreCase("y")){
            return;
        }

        controller.guardarCalendario();

    }

    private Data getData() {
        Data data = new Data();
        do{
            String strData = console.readLine("Insira a data de contratação (formato dia/mês/ano):");
            String str[] = strData.split("/");
            int day = Integer.parseInt(str[0]);
            int month = Integer.parseInt(str[1]);
            int year = Integer.parseInt(str[2]);
            data =  new Data(year,month,day);
        }while(data.equals(new Data()));
        return data;
    }
    
    private int getHoraInicio() {
        int horaInicio = 0;
        do{
            horaInicio = Integer.parseInt(console.readLine("Insira a hora de início: "));
        }while(horaInicio < 0 || horaInicio > 23);
        return horaInicio;
    }

    private int getHoraFim(int horaInicio) {
        int horaFim = 0;
        do{
            horaFim = Integer.parseInt(console.readLine("Insira a hora de fim: "));
        }while(horaFim < 0 || horaFim > 23 || horaFim < horaInicio);
        return horaFim;
    }

    private int getDuracao() {
        int duracao = 0;
        do{
            duracao = Integer.parseInt(console.readLine("Insira a duração do serviço (em minutos): "));
        }while (duracao <= 0);
        return duracao;
    }

}
