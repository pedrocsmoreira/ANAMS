package com.anams.Model;

import com.anams.Utils.Data;

public class Cliente {
    private int codigo;
    private String nome;
    private String endereco;
    private int nif;
    private Data dataNascimento;
    private int contacto;
    private String email;

    private static int contador = 0;

    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;

    public Cliente(){
        setCodigo(++contador);
        setNome(STR_DEFAULT);
        setEndereco(STR_DEFAULT);
        setNif(INT_DEFAULT);
        setDataNascimento(new Data());
        setContacto(INT_DEFAULT);
        setEmail(STR_DEFAULT);
    }

    public Cliente(String nome, String endereco, int nif, Data dataNascimento, int contacto, String email) {
        setCodigo(++contador);
        setNome(nome);
        setEndereco(endereco);
        setNif(nif);
        setDataNascimento(dataNascimento);
        setContacto(contacto);
        setEmail(email);
    }

    private void setCodigo(int codigo) { this.codigo = codigo; }

    public int getCodigo() { return this.codigo; }

    public void setNome(String nome) { this.nome = nome; }

    public String getNome() { return this.nome; }

    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getEndereco() { return this.endereco; }

    public void setNif(int nif) { this.nif = nif; }

    public int getNif() { return this.nif; }

    public void setDataNascimento(Data dataNascimento) { this.dataNascimento = dataNascimento; }

    public Data getDataNascimento() { return this.dataNascimento; }

    public void setContacto(int contacto) { this.contacto = contacto; }

    public int getContacto() { return this.contacto; }

    public void setEmail(String email) { this.email = email; }

    public String getEmail() { return this.email; }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n\tCódigo -> ");
        sb.append(this.codigo);
        sb.append("\n\tNome -> ");
        sb.append(this.nome);
        sb.append("\n\tEndereço -> ");
        sb.append(this.endereco);
        sb.append("\n\tNIF -> ");
        sb.append(this.nif);
        sb.append("\n\tData de Contratação -> ");
        sb.append(this.dataNascimento);
        sb.append("\n\tContacto -> ");
        sb.append(this.contacto);
        sb.append("\n\tEmail -> ");
        sb.append(this.email);
        return sb.toString();
    }

    @Override
    public boolean equals(Object outro) {
        if(this == outro) {
            return true;
        }
        if(outro == null || this.getClass() != outro.getClass()) {
            return false;
        }
        Cliente obj = (Cliente) outro;
        return this.codigo == obj.codigo
                && this.nome.equalsIgnoreCase(obj.nome)
                && this.endereco.equalsIgnoreCase(obj.endereco)
                && this.nif == obj.nif
                && this.dataNascimento.equals(obj.dataNascimento)
                && this.contacto == obj.contacto
                && this.email.equalsIgnoreCase(obj.email);
    }

}
