package test;

import transport.ArretDeLigne;
import transport.Ligne;

import java.awt.*;

public class TestLigne {
    public static void main(String[] args) {
        Ligne l = new Ligne("RER A", Color.blue);
        ArretDeLigne a = new ArretDeLigne("Etoile");
        ArretDeLigne b = new ArretDeLigne("Massy");
        b.setZone(4);

        l.ajouterArret(a);
        l.ajouterArret(b);
        System.out.println(l);
    }
}
