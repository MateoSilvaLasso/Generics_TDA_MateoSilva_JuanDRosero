package ui;
import model.*;

import java.util.HashSet;
import java.util.Set;

public class InitModel{

    public Set players(){
        Player A1= new Player("james", 100,"111");
        Player A2= new Player("Rex", 100,"112");
        Player A3= new Player("Sam", 100,"113");
        Player A4= new Player("Trixi", 100,"114");
        Player A5= new Player("trump", 100,"115");
        Player A6= new Player("paco", 100,"116");
        Player A7= new Player("Ell", 100,"118");
        Player A8= new Player("Pow", 100,"119");
        Player A9= new Player("Roller master", 100,"120");
        Set<Player> m= new HashSet<>();
        m.add(A1);
        m.add(A2);
        m.add(A3);
        m.add(A4);
        m.add(A5);
        m.add(A6);
        m.add(A7);
        m.add(A8);
        m.add(A9);
        return m;

    }
}
