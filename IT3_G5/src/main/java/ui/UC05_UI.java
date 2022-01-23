package ui;

import controller.associarEntidadeController;
import exceptions.ExcecaoNaoExiste;
import java.util.HashSet;
import model.Entidade;
import model.Festival;
import model.GESTFEST;
import utils.Utils;

/**
 *
 * @author grupo5
 */

public class UC05_UI {
    private GESTFEST gestfest;
    private associarEntidadeController controller;

    public UC05_UI(GESTFEST gestfest){
        this.gestfest = gestfest;
        controller = new associarEntidadeController(gestfest);
    }

    public void run(){
        System.out.println("\nAssociar entidade a festival:");

        introduzaFestival();
        introduzaEntidade();
        introduzaPapeis();
        apresentaDados();

        if(Utils.confirma("Pretende associar estas entidades a este festival? (S/N)")){
            controller.associaEntidades();
        }
    }

    public void introduzaFestival(){
        try{
            controller.consultarFestival(Utils.readLineFromConsole("Insira o festival a tratar"));
        }catch(ExcecaoNaoExiste e){
            e.printStackTrace();
            if(Utils.confirma("Pretende inserir outro festival?")){
                introduzaFestival();
            }else {
            }
        }
    }

    public void introduzaEntidade(){
        try{
            controller.consultarEntidade(Utils.readLineFromConsole("Insira a entidade a tratar"));
        }catch(ExcecaoNaoExiste e){
            e.printStackTrace();
            if(Utils.confirma("Pretende inserir outra entidade?")){
                introduzaEntidade();
            }else {
            }
        }
    }

    public void introduzaPapeis(){
        HashSet<String> papeis = new HashSet<String>();
        do{
            do{
                try{
                    String papel = Utils.readLineFromConsole("Insira um papel da entidade: ");
                    controller.inserirPapel(papel);
                    papeis.add(papel);
                }catch(ExcecaoNaoExiste e){
                    e.printStackTrace();
                }
            }while(Utils.confirma("Pretende inserir mais papeis? (S/N)"));
        }while(papeis.equals(new HashSet<String>()));
    }

    public void apresentaDados(){
        System.out.println("\nFestival: ");
        System.out.println(controller.getFestivalAsString());
        System.out.println("\nEntidade: ");
        System.out.println(controller.getEntidadesAsString());
    }
}