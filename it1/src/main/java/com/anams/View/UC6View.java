package com.anams.View;

import java.io.Console;

import com.anams.Controller.UC6Controller;
import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;

import com.anams.Exception.ExceptionMedico.ExceptionMedicoNaoExiste;
import com.anams.Exception.ExceptionEspecialidade.ExceptionEspecialidadeNaoExiste;

public class UC6View {
    private Console console = System.console();
    private Clinica clinica;
    private UC6Controller controller;

    /**
     * Construtor
     * 
     * @param c
     */
    public UC6View(Clinica c){
        this.clinica = c;
        this.controller = new UC6Controller(clinica);
    }

    public void run(){
        System.out.println("--------- Consultar Informação ----------");
        try{
            mostrarEspecialidades();
            int codigo = Integer.parseInt(console.readLine("Insira o código da especialidade a procurar: "));
            try{
                Especialidade e = procurarEspecialidade(codigo);
                procurarMedicos(e);
            }catch (ExceptionEspecialidadeNaoExiste e){
                e.printStackTrace();
            }catch (ExceptionMedicoNaoExiste e){
                e.printStackTrace();
            }
        }catch (ExceptionEspecialidadeNaoExiste e){
            e.printStackTrace();
        }
    }

    private void mostrarEspecialidades() throws ExceptionEspecialidadeNaoExiste{
        System.out.println(controller.verEspecialidades());
    }

    private Especialidade procurarEspecialidade(int codigo) throws ExceptionEspecialidadeNaoExiste{
        return this.controller.verificarCodigo(codigo);
    }

    private void procurarMedicos(Especialidade e) throws ExceptionMedicoNaoExiste{
        System.out.println(controller.procurarMedicos(e));
    }



}
