package com.anams.View;

import java.io.Console;

import com.anams.Controller.UC7Controller;
import com.anams.Model.Cliente;
import com.anams.Model.Clinica;
import com.anams.Utils.Data;

public class UC7View {
    private Console console = System.console();
    private Clinica clinica;
    private UC7Controller controller;

    /**
     * Construtor
     * 
     * @param c
     */
    public UC7View(Clinica c){
        this.clinica = c;
        this.controller = new UC7Controller(clinica);
    }

    public void run(){
        String nome = console.readLine("Insira o nome do cliente: ");
        String endereco = console.readLine("Insira a morada do Cliente: ");
        int nif = Integer.parseInt(console.readLine("Insira o NIF do Cliente: "));
        Data dataNascimento = new Data();
        int contacto = Integer.parseInt(console.readLine("Insira o contacto do Cliente: "));
        String email = console.readLine("Insira o email do Cliente: ");
        Cliente cl = new Cliente(nome, endereco, nif, dataNascimento, contacto, email);
    }

}
