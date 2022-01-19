package model;

import java.util.Date;

/**
 *
 * @author grupo5
 */

public class Convite {
    enum Estado {sem_resposta, aceite, rejeitado, anulado};
    private int referencia;
    private Festival festival;
    private Artista artista;
    private String email;
    private Date dataConvite;
    private Date dataLimite;
    private Estado estado;

    private static int contador = 0;
    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;

    public Convite(){
        this.referencia = ++contador;
        this.festival = new Festival();
        this.artista = new Artista();
        this.email = STR_DEFAULT;
        this.dataConvite = new Date();
        this.dataLimite = new Date();
        this.estado = Estado.sem_resposta;
    }

    public Convite(Festival festival, Artista artista, String email, Date dataConvite, Date dataLimite, String estado){
        this.referencia = ++contador;
        this.festival = festival;
        this.artista = artista;
        this.email = email;
        this.dataConvite = dataConvite;
        this.dataLimite = dataLimite;
        this.estado = Estado.valueOf(estado);
    }

    public Convite(Convite c){
        this.referencia = c.referencia;
        this.festival = c.festival;
        this.artista = c.artista;
        this.email = c.email;
        this.dataConvite = c.dataConvite;
        this.dataLimite = c.dataLimite;
        this.estado = c.estado;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataConvite() {
        return dataConvite;
    }

    public void setDataConvite(Date dataConvite) {
        this.dataConvite = dataConvite;
    }

    public Date getDataLimite() {
        return dataLimite;
    }

    public void setDataLimite(Date dataLimite) {
        this.dataLimite = dataLimite;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = Estado.valueOf(estado);
    }

    public Festival getFestival() {
        return festival;
    }

    public void setFestival(Festival festival) {
        this.festival = festival;
    }
    
    

    
    

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Referência: " + this.referencia + "\n");
        sb.append("Nome do Artista: " + this.artista + "\n");
        sb.append("Email do Artista: " + this.email + "\n");
        sb.append("Data do Convite: " + this.dataConvite + "\n");
        sb.append("Data Limite: " + this.dataLimite + "\n");
        sb.append("Estado do Convite: " + this.estado + "\n");
        return sb.toString();
    }
}