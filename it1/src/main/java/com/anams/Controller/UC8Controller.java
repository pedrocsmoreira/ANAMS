package com.anams.Controller;

import com.anams.Exception.ExceptionCliente.ExceptionClienteExiste;
import com.anams.Model.Cliente;
import com.anams.Model.Clinica;
import com.anams.Utils.Data;

public class UC8Controller {
    private Clinica clinica;

    public UC8Controller(Clinica c){
        this.clinica = c;
    }

    public void novoCliente() {
    }

    public void setNome(String nome) {
    }

    public void setEndereco(String endereco) {
    }

    public void setNif(int nif) {
    }

    public void setDataNascimento(Data dataNascimento) {
    }

    public void setContacto(int contacto) {
    }

    public void setEmail(String email) {
    }

    public Cliente getCliente() {
        return null;
    }

    public void registarCliente() throws ExceptionClienteExiste{
    }

    
}
