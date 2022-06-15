package tp4_plan.ex4;

import java.awt.*;

abstract class Emplacement {

    private int dimension;
    private Color couleur;
    private int xCentre;
    private int yCentre;

    protected Emplacement(final Color couleur, final int xCentre, final int yCentre) {
        this.couleur = couleur;
        this.xCentre = xCentre;
        this.yCentre = yCentre;
    }

    abstract String affiche();

    public int getDimension() {
        return dimension;
    }

    public void setDimension(final int dimension) {
        this.dimension = dimension;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(final Color couleur) {
        this.couleur = couleur;
    }

    public int getxCentre() {
        return xCentre;
    }

    public void setxCentre(final int xCentre) {
        this.xCentre = xCentre;
    }

    public int getyCentre() {
        return yCentre;
    }

    public void setyCentre(final int yCentre) {
        this.yCentre = yCentre;
    }

}
