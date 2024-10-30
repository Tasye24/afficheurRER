package test;

import transport.Arret;

public class TestArret {
    public static void main(String[] args) {
        Arret ar = new Arret("Cdg étoile");
        Arret z = new Arret("La Défense");
        z.setZone(2);

        System.out.println(ar);
        System.out.println(z);
    }
}
