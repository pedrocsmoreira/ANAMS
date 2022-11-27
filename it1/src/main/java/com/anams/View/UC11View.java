package com.anams.View;

import java.io.Console;

import com.anams.Model.Cliente;
import com.anams.Model.Clinica;
import com.anams.Controller.UC11Controller;
import com.anams.Exception.ExceptionEspecialidade;
import com.anams.Exception.ExceptionMedico;
import com.anams.Exception.ExceptionSlot;

public class UC11View {
    private Console console = System.console();
    private Clinica clinica;
    private UC11Controller controller;

    private Cliente cliente;

    /**
     * Construtor
     * 
     * @param c
     */
    public UC11View(Clinica clinica){
        this.clinica = clinica;
        this.controller = new UC11Controller(clinica);
    }

    public void run(Cliente cliente){
        this.cliente = cliente;
        System.out.println("---------- Efetuar Marcação ----------");
        controller.novaMarcacao(cliente);
        int vaga = inserirDados();
        String opcao = console.readLine("Pretende fazer esta marcação? (Y/N): ");
        if(opcao.equalsIgnoreCase("Y")){
            controller.guardarMarcacao();
            controller.escolherVaga(vaga);
        }
    }

    private int inserirDados(){
        int vaga = 0;
        try{
            inserirEspecialidades();
            inserirMedicos();
            vaga = inserirVagas();
        }catch (Exception e){
            e.printStackTrace();
        }
        return vaga;
    }

    private void inserirEspecialidades() throws ExceptionEspecialidade{
        System.out.println(controller.verEspecialidades());
        int codigoEspecialidade = 0;
        do{
            codigoEspecialidade = Integer.parseInt(console.readLine("Insira o código da especialidade a procurar: "));
        }while(codigoEspecialidade <= 0);
        this.controller.verificarEspecialidade(codigoEspecialidade);
    }

    private void inserirMedicos() throws ExceptionMedico{
        System.out.println(controller.procurarMedicos());
        int codigoMedico = 0;
        do{
            codigoMedico = Integer.parseInt(console.readLine("Insira o código do médico a marcar: "));
        }while(codigoMedico <= 0);
        this.controller.verificarMedico(codigoMedico);
    }

    private int inserirVagas() throws ExceptionSlot{
        System.out.println(this.controller.procurarVagas());
        int codigoVaga = 0;
        do{
            codigoVaga = Integer.parseInt(console.readLine("Insira o código da vaga a preencher: "));
        }while(codigoVaga <= 0);
        return codigoVaga;
    }

}
