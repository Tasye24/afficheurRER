package transport;

import java.awt.*;
import java.util.ArrayList;

public class Ligne {
    private String nom;
    private Color couleur;
    private ArrayList<ArretDeLigne> arrets;

    public Ligne(String nom, Color couleur) {
        setNom(nom);
        arrets = new ArrayList<ArretDeLigne>();
        setCouleur(couleur);
    }
    public Ligne(String nom, ArrayList<ArretDeLigne> arrets, Color couleur) {
        this(nom, couleur);
        this.arrets = arrets;
    }
    public Ligne(String nom, Color couleur, ArrayList<ArretDeLigne> arrets) {
        this(nom, arrets, couleur);
    }


    public synchronized Ligne ajouterArret(ArretDeLigne arret) {
        arrets.add(arret);
        return this;
    }
    public void supprimerArret(ArretDeLigne arret) {
        arrets.remove(arret);
    }
    public ArrayList<ArretDeLigne> getArrets() {
        return arrets;
    }

    public Color getCouleur() {
        return couleur;
    }
    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer(super.toString());
        sb.append(" nom=").append(getNom()).append(" couleur=").append(getCouleur().toString()).append(" arrets=[");
        for(ArretDeLigne arret : arrets) {
            sb.append(arret.toString()).append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
