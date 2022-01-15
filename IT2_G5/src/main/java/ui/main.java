package ui;

import java.util.Date;
import model.GESTFEST;

/**
 *
 * @author grupo5
 */

public class main {

    private GESTFEST  gestfest =  new GESTFEST("gestfest", new Date(), 999999999, 100000);

    public void main(String[] args) {
        try{
            menuInicialUI ui = new menuInicialUI(gestfest);
            ui.run();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}