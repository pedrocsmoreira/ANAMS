package com.anams.View;

import java.util.Utils;
import java.security.GeneralSecurityException;
import java.util.ArrayList;

import com.anams.Controller.UC3Controller;
import com.anams.Extra.Data;
import com.anams.Model.Clinica;
import com.anams.Model.Especialidade;
import com.anams.Model.Medico;

public class UC3View {
    private Clinica clinica;
    private UC3Controller controller;

    public UC3View(Clinica c){
        this.clinica = c;
        this.controller = new UC3Controller(clinica);
    }

    public void run(){
        controller.setCodigo(getCodigo());
        controller.setNome(getNome());
        getData();
        getNif();
        getCedula();
        getEspecialidades();
        getEmail();
        getContacto();
        System.out.println("Pretende registar este médico? (Y/N)");
        
    }

    private int getCodigo(){
        return Utils.readLineFromConsole("Insira o código do médico:");
    }

    private String getNome(){
        System.out.println("Insira o nome do médico");
        String nome = scan.next();
        return nome;
    }

    private void getData(){
        System.out.println("Insira a data de contratação (formato dia/mês/ano)");
        String strData = scan.next();
        String parts[] = strData.split("/");
        Data data = new Data(parts[0],parts[1],parts[2]);
    }

    private void getNif(){
        System.out.println("Insira NIF do médico");
        int nif = scan.nextInt();
    }

    private void getCedula(){
        System.out.println("Insira o número de cédula profissional");
        int num = scan.nextInt();
    }

    private void getEspecialidades(){
        ArrayList<Especialidade> list = new ArrayList<Especialidade>();

    }

    private void getEmail(){
        System.out.println("Insira o email");
        String email = scan.next();
    }

    private void getContacto(){
        System.out.println("Insira o contacto do médico");
        int contacto = scan.nextInt();
    }

    private void registarMedico(Medico m){
        clinica.registarMedico(m);
    }
}
