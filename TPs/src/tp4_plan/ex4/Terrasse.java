package tp4_plan.ex4;

import java.awt.*;

public class Terrasse extends Emplacement {

    public Terrasse(final Color couleur, final int xCentre, final int yCentre) {
        super(couleur, xCentre, yCentre);
    }

    public String affiche() {
        return "Terrasse" + "Couleur=" + getCouleur() + ", xCentre=" + getxCentre() + ", yCentre=" + getyCentre();
    }

}
