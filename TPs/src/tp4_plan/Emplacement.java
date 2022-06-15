package tp4_plan;

import java.awt.*;

abstract class Emplacement {

    private int dimension;
    private Color couleur;
    private int xCentre;
    private int yCentre;

    protected Emplacement(Color couleur , int xCentre , int yCentre ) {
        this.couleur = couleur ;
        this.xCentre = xCentre ;
        this.yCentre = yCentre ;
    }

    abstract String affiche();

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public int getxCentre() {
        return xCentre;
    }

    public void setxCentre(int xCentre) {
        this.xCentre = xCentre;
    }

    public int getyCentre() {
        return yCentre;
    }

    public void setyCentre(int yCentre) {
        this.yCentre = yCentre;
    }

        

}
