package transport;

import javax.swing.*;
import java.awt.*;

public class Afficheur {
    private Ligne ligne;

    public Afficheur(Ligne ligne) {
        setLigne(ligne);
    }

    public Ligne getLigne() {
        return ligne;
    }
    public void setLigne(Ligne ligne) {
        this.ligne = ligne;
    }

    public void visualiser() {
        JFrame fenetre = new JFrame("Afficheur de la ligne: "+getLigne().getNom());

        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panneau = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));

        for(Arret arret : getLigne().getArrets()) {
            JLabel label = new JLabel(
                    arret.getNom() + " ("+arret.getZone()+")"
            );

            panneau.add(label);
        }

        fenetre.add(panneau);

        fenetre.setMinimumSize(new Dimension(500, 500));
        fenetre.pack();

        fenetre.setVisible(true);
    }

    public String toString() {
        return ligne.toString();
    }
}
