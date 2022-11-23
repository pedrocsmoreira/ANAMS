package com.anams.Controller;

import com.anams.Exception.ExceptionCliente.ExceptionClienteExiste;
import com.anams.Model.Cliente;
import com.anams.Model.Clinica;
import com.anams.Utils.Data;

public class UC8Controller {
    private Clinica clinica;
    private Cliente cl;

    public UC8Controller(Clinica c){
        this.clinica = c;
    }

    public void novoCliente() { setCliente();}

    private void setCliente() { this.cl = clinica.novoCliente(); }

    public void setNome(String nome) { this.cl.setNome(nome); }

    public void setEndereco(String endereco) { this.cl.setEndereco(endereco); }

    public void setNif(int nif) { this.cl.setNif(nif); }

    public void setDataNascimento(Data dataNascimento) { this.cl.setDataNascimento(dataNascimento); }

    public void setContacto(int contacto) { this.cl.setContacto(contacto); }

    public void setEmail(String email) { this.cl.setEmail(email); }

    public Cliente getCliente() { return this.cl.toString(); }

    public void registarCliente() throws ExceptionClienteExiste{ clinica.registarCliente(cl); }

}
