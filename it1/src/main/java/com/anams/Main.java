package com.anams;

import com.anams.Menu.MenuView;
import com.anams.Model.Clinica;

public final class Main {
    public static void main(String[] args) {
        try{
            Clinica clinica = new Clinica();

            MenuView menu = new MenuView(clinica);

            menu.run();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}