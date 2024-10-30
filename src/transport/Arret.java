package transport;

public class Arret {
    private String nom;
    private int zone = 1;

    public Arret(String nom) {
        setNom(nom);
    }
    public Arret(String nom, int zone) {
        this(nom);
        setZone(zone);
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getZone() {
        return zone;
    }
    public void setZone(int zone) {
        this.zone = zone;
    }

    @Override
    public String toString() {
        return super.toString() + " {nom = " + nom + ", zone = " + zone + "}";
    }
}
