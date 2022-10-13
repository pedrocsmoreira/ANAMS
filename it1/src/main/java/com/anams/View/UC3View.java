package com.anams.View;

import java.io.Console;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;

import com.anams.Controller.UC3Controller;
import com.anams.Extra.Data;
import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;
import com.anams.Model.Medico;

public class UC3View {
    private Console console = System.console();

    private Clinica clinica;
    private UC3Controller controller;

    public UC3View(Clinica c){
        this.clinica = c;
        this.controller = new UC3Controller(c);
    }

    public void run(){
        controller.setCodigo(getCodigo());
        controller.setNome(getNome());
        controller.setDataContratacao(getData());
        controller.setNif(getNif());
        controller.setCedula(getCedula());
        controller.setEspecialidades(getEspecialidades());
        controller.setEmail(getEmail());
        controller.setContacto(getContacto());
        System.out.println("Pretende registar este médico? (Y/N)");
        
        
    }

    private int getCodigo(){
        return Integer.parseInt(console.readLine("Insira o código do médico: "));
    }

    private String getNome(){
        return console.readLine("Insira o nome do médico: ");
    }

    private Data getData(){
        String strData = console.readLine("Insira a data de contratação (formato dia/mês/ano)");
        int num[] = Arrays.stream(strData.split("/")).mapToInt(Integer::parseInt).toArray();
        return new Data(num[0],num[1],num[2]);
    }

    private int getNif(){
        return Integer.parseInt(console.readLine("Insira o NIF do médico: "));
    }

    private int getCedula(){
        return Integer.parseInt(console.readLine("Insira o número de cédula profissional do médico: "));
    }

    private ArrayList<Especialidade> getEspecialidades(){
        ArrayList<Especialidade> list = new ArrayList<Especialidade>();
        ArrayList<Especialidade> especialidades = clinica.getListaEspecialidades();
        for(Especialidade e : especialidades){
            System.out.println(e.toString());
        }
        

        return list;
    }

    private String getEmail(){
        return console.readLine("Insira o email do médico: ");
    }

    private int getContacto(){
        return Integer.parseInt(console.readLine("Insira o contacto do médico: "));
    }

    private void registarMedico(Medico m){
        clinica.registarMedico(m);
    }
}
