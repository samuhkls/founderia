
package model;

import View.Fruts_GUI;
import View.Sabores_GUI;


public class Classes_DAO {
    
    public static void sabores(boolean tela){
        
        new Sabores_GUI().setVisible(tela);
}
    public static void frutas(boolean tela){
        new Fruts_GUI().setVisible(tela);
    }
}
