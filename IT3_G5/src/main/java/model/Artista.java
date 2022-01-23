package model;

/**
 *
 * @author grupo5
 */

public class Artista {
    private int referencia;
    private String nome;
    private String email;
    private int numTelefone;
    private int numMembros;

    private int contador = 0;
    private final String STR_DEFAULT = "";
    private final int INT_DEFAULT = 0;

    public Artista(){
        this.referencia = ++contador;
        this.nome = STR_DEFAULT;
        this.email = STR_DEFAULT;
        this.numTelefone = INT_DEFAULT;
        this.numMembros = INT_DEFAULT;
    }

    public Artista(String nome, String email, int numTelefone, int numMembros){
        this.referencia = ++contador;
        this.nome = nome;
        this.email = email;
        this.numTelefone = numTelefone;
        this.numMembros = numMembros;
    }

    public Artista(Artista a){
        this.referencia = a.contador;
        this.nome = a.nome;
        this.email = a.email;
        this.numTelefone = a.numTelefone;
        this.numMembros = a.numMembros;
    }

    public int getReferencia() {
        return referencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumTelefone() {
        return numTelefone;
    }

    public void setNumTelefone(int numTelefone) {
        this.numTelefone = numTelefone;
    }

    public int getNumMembros() {
        return numMembros;
    }

    public void setNumMembros(int numMembros) {
        this.numMembros = numMembros;
    }

    

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Referência: " + this.referencia + "\n");
        sb.append("Nome do Artista: " + this.nome + "\n");
        sb.append("Email do Artista: " + this.email + "\n");
        sb.append("Número de Telefone: " + this.numTelefone + "\n");
        sb.append("Número de Membros: " + this.numMembros + "\n");
        return sb.toString();
    }
}