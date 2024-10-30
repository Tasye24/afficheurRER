package test;

import transport.Afficheur;
import transport.ArretDeLigne;
import transport.Ligne;

import java.awt.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import org.json.*;

public class TestAfficheur {
    public static void main(String[] args) throws IOException {
        String chemin = "./src/test/arrets.json";

        String contenuJSON = Files.readString(Paths.get(chemin));
        JSONArray jsonArray = new JSONArray(contenuJSON);

        Ligne l = new Ligne("RER A", Color.red);

        for(int i = 0; i < jsonArray.length(); i++){
            JSONObject objectActuel = (JSONObject) jsonArray.get(i);
            ArretDeLigne arret = new ArretDeLigne(
                    objectActuel.getString("nom"), "0", objectActuel.getInt("zone")
            );
            l.ajouterArret(arret);
        }

        System.out.println(l);

        Afficheur a = new Afficheur(l);

        a.visualiser();
    }
}
