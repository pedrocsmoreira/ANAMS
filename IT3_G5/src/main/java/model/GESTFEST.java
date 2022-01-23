package model;

import exceptions.ExcecaoNaoExiste;
import exceptions.ExcecaoProgramaExiste;
import exceptions.ExcecaoProgramaNaoExiste;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Date;

/**
 *
 * @author grupo5
 */

public class GESTFEST {
    private String designacao;
    private Date dataCriacao;
    private int nif;
    private int capitalSocial;
    private HashSet<Festival> listaFestivais;
    private HashSet<Entidade> listaEntidades;
    private HashSet<TipoEntidade> listaTipoEntidades;
    private HashSet<Bilhete> listaBilhetes;
    private HashSet<TipoBilhete> listaTipoBilhetes;
    private HashSet<Artista> listaArtistas;
    private HashSet<Convite> listaConvites;
    private HashSet<PlanoBilheteira> listaPlanosBilheteira;
    private HashSet<ProgramaFestival> listaProgramas;

    private static final String STR_DEFAULT = "";
    private static final int INT_DEFAULT = 0;
    private static final Date DATE_DEFAULT = new Date();

    public GESTFEST(){
        this.designacao = STR_DEFAULT;
        this.dataCriacao = DATE_DEFAULT;
        this.nif = INT_DEFAULT;
        this.capitalSocial = INT_DEFAULT;
        this.listaFestivais = new HashSet<>();
        this.listaEntidades = new HashSet<>();
        this.listaTipoEntidades = new HashSet<>();
        this.listaBilhetes = new HashSet<>();
        this.listaTipoBilhetes = new HashSet<>();
        this.listaArtistas = new HashSet<>();
        this.listaConvites = new HashSet<>();
    }

    public GESTFEST(String designacao, Date dataCriacao, int nif, int capitalSocial){
        this.designacao = designacao;
        this.dataCriacao = dataCriacao;
        this.nif = nif;
        this.capitalSocial = capitalSocial;
        this.listaFestivais = new HashSet<>();
        this.listaEntidades = new HashSet<>();
        this.listaTipoEntidades = new HashSet<>();
        this.listaBilhetes = new HashSet<>();
        this.listaTipoBilhetes = new HashSet<>();
        this.listaArtistas = new HashSet<>();
        this.listaConvites = new HashSet<>();
    }

    public GESTFEST(GESTFEST g){
        this.designacao = g.designacao;
        this.dataCriacao = g.dataCriacao;
        this.nif = g.nif;
        this.capitalSocial = g.capitalSocial;
        this.listaFestivais = g.listaFestivais;
        this.listaEntidades = g.listaEntidades;
        this.listaTipoEntidades = g.listaTipoEntidades;
        this.listaBilhetes = g.listaBilhetes;
        this.listaTipoBilhetes = g.listaTipoBilhetes;
        this.listaArtistas = g.listaArtistas;
        this.listaConvites = g.listaConvites;
    }

    

    public HashSet<Festival> getListaFestivais(){
        return this.listaFestivais;
    }

    public void setListaFestivais(HashSet<Festival> ListaFestivais){
        this.listaFestivais = ListaFestivais;
    }

    public HashSet<Entidade> getListaEntidades(){
        return this.listaEntidades;
    }

    public void setListaEntidades(HashSet<Entidade> ListaEntidades){
        this.listaEntidades = ListaEntidades;
    }

    public HashSet<TipoBilhete> getListaTipoBilhetes(){
        return this.listaTipoBilhetes;
    }

    public void setListaTipoBilhete(HashSet<TipoBilhete> lstTipoBilhetes){
        this.listaTipoBilhetes = listaTipoBilhetes;
    }

    public HashSet<TipoEntidade> getListaTipoEntidades(){
        return this.listaTipoEntidades;
    }
    public void setListaTipoEntidades(HashSet<TipoEntidade> lstTipoEntidade){
        this.listaTipoEntidades = listaTipoEntidades;
    }

    public HashSet<Bilhete> getListaBilhetes() {
        return listaBilhetes;
    }

    public void setListaBilhetes(HashSet<Bilhete> ListaBilhetes) {
        this.listaBilhetes = ListaBilhetes;
    }

    public HashSet<Artista> getListaArtistas() {
        return listaArtistas;
    }

    public void setListaArtistas(HashSet<Artista> ListaArtistas) {
        this.listaArtistas = ListaArtistas;
    }
    
    




    //----------- FESTIVAL -----------
    public Festival novoFestival(){
        return new Festival();
    }

    public boolean registaFestival(Festival festival){
         return adicionaFestival(festival);
    }

    private boolean adicionaFestival(Festival festival){
        try{
            listaFestivais.add(festival);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public void associaEntidadeFestival(Festival festival, HashSet<Entidade> listaEntidades){
        HashSet<Entidade> entidades = festival.getEntidades();
        entidades.addAll(listaEntidades);
        festival.setEntidades(entidades);
    }

    public Festival procuraFestivalString(String festival) throws ExcecaoNaoExiste{
        for(Festival f : listaFestivais){
            if(f.getDesignacao().equals(festival)){
                return f;
            }
        }
        throw new ExcecaoNaoExiste("O festival pedido não existe!!!");
    }

    public ArrayList<Festival> procuraFestivalData(Date data) throws ExcecaoNaoExiste{
        ArrayList<Festival> festivais = new ArrayList<Festival>();
        for(Festival f : listaFestivais){
            if(f.getDataInicioFestival().equals(data)){
                festivais.add(f);
            }
        }
        if(!festivais.isEmpty()){
            return festivais;
        }else{
            throw new ExcecaoNaoExiste("Não existem festivais após a data inserida!!!");
        }
    }


    //----------- ENTIDADE -----------
    public boolean registaEntidade(Entidade entidade){
        return adicionaEntidade(entidade);
    }

    private boolean adicionaEntidade(Entidade entidade){
        try{
            listaEntidades.add(entidade);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public Entidade procuraEntidade(String entidade) throws ExcecaoNaoExiste{
        for(Entidade e : listaEntidades){
            if(e.getDesignacao().equals(entidade)){
                return e;
            }
        }
        throw new ExcecaoNaoExiste("A entidade pedida não existe!!!"); 
    }




    //----------- TIPOENTIDADE -----------
    public boolean registaTipoEntidade(HashSet<TipoEntidade> tipoEntidade){
        return adicionaTipoEntidade(tipoEntidade);
    }

    private boolean adicionaTipoEntidade(HashSet<TipoEntidade> tipoEntidade){
        try{
            listaTipoEntidades.addAll(tipoEntidade);
            return true;
        }catch(Exception e){
            return false;
        }
    }




    //----------- BILHETE -----------
    public boolean registaBilhete(Bilhete bilhete){
        return adicionaBilhete(bilhete);
    }

    private boolean adicionaBilhete(Bilhete bilhete){
        try{
            listaBilhetes.add(bilhete);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public Bilhete procuraBilhete(String bilhete) throws ExcecaoNaoExiste{
        for(Bilhete b : listaBilhetes){
            if(b.getDesignacao().equals(bilhete)){
                return b;
            }
        }
        throw new ExcecaoNaoExiste("A entidade pedida não existe!!!"); 
    }




    //----------- TIPOBILHETE -----------
    public boolean registaTipoBilhete(HashSet<TipoBilhete> tipoBilhete){
        return adicionaTipoBilhete(tipoBilhete);
    }

    private boolean adicionaTipoBilhete(HashSet<TipoBilhete> tipoBilhete){
        try{
            listaTipoBilhetes.addAll(tipoBilhete);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    
    
    
    //----------- CONVITE -----------
    public Artista procurarArtista(String artista) throws ExcecaoNaoExiste{
        for(Artista a : listaArtistas){
            if(a.getNome().equals(artista)){
                return a;
            }
        }
        throw new ExcecaoNaoExiste("O artista pedido não existe!!!");
    }
    
    public boolean registaConvite(Convite convite){
        return adicionaConvite(convite);
    }
    
    private boolean adicionaConvite(Convite convite){
        try{
            listaConvites.add(convite);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    public Convite procurarConvite(String festival, String artista) throws ExcecaoNaoExiste{
        for(Convite c : listaConvites){
            if(c.getArtista().getNome().equals(artista) && c.getFestival().equals(festival)){
                //
            }
        }
        throw new ExcecaoNaoExiste("O artista pedido não existe!!!");
    }

    public void alteraEstadoConvite(Convite convite) {
        for(Convite c : listaConvites){
            if(c.getFestival().equals(convite.getFestival()) && c.getArtista().equals(convite.getArtista())){
                c = convite;
            }
        }
    }

    public PlanoBilheteira procurarPlano(Festival festival) {
        for(PlanoBilheteira pl : listaPlanosBilheteira){
            if(pl.getFestival().equals(festival)){
                return pl;
            }
        }
        return new PlanoBilheteira();
    }

    public Festival procuraFestivalSemPrograma(String festival) throws ExcecaoNaoExiste, ExcecaoProgramaExiste {
        Festival fest = procuraFestivalString(festival);
        for(ProgramaFestival pf : listaProgramas){
            if(pf.getFestival().equals(fest)){
                throw new ExcecaoProgramaExiste("Este festival já tem um programa designado");
            }
        }
        return fest;
    }
    
     public ProgramaFestival procuraFestivalPrograma(String festival) throws ExcecaoNaoExiste, ExcecaoProgramaNaoExiste {
        Festival fest = procuraFestivalString(festival);
        for(ProgramaFestival pf : listaProgramas){
            if(pf.getFestival().equals(fest)){
                return pf;
            }
        }
        throw new ExcecaoProgramaNaoExiste("Este festival não tem um programa designado");
    }

    public boolean inserirPrograma(ProgramaFestival programaFestival) {
        listaProgramas.add(programaFestival);
        return true;
    }

    public void registarPlano(PlanoBilheteira planoBilheteira) {
        this.listaPlanosBilheteira.add(planoBilheteira);
    }
}