package transport;

public class ArretDeLigne extends Arret {
    /**
     * Par défaut "0" signifie la branche principale
     */
    private String branche="0";

    public ArretDeLigne(String nom) {
        super(nom);
    }
    public ArretDeLigne(String nom, String branche) {
        this(nom);
        setBranche(branche);
    }
    public ArretDeLigne(String nom, String branche, int zone) {
        this(nom, branche);
        super.setZone(zone);
    }


    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }

    public String toString() {
        return super.toString() + ", branche=" + branche;
    }
}
