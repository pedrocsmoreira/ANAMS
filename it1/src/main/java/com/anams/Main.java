package com.anams;

import com.anams.Model.Clinica;
import com.anams.View.MenuView;

public final class Main {
    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        try
        {
            Clinica clinica = new Clinica();

            MenuView menu = new MenuView(clinica);

            menu.run();
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }
}