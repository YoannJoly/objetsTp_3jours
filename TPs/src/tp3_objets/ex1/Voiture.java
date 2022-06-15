package tp3_objets.ex1;

import java.awt.Color;

public class Voiture {

    private String marque;
    private int num_serie;
    private Color couleur;
    private String immatriculation;
    private int annee;
    private Individu proprietaire;

    public Voiture(  int num_serie, String immatriculation, String marque,  Color couleur,  int annee) {
        this.marque = marque;
        this.num_serie = num_serie;
        this.couleur = couleur;
        this.immatriculation = immatriculation;
        this.annee = annee;
    }

    void demarrer() {
    };

    void klaxonner() {
    };

    void conduire() {
    };

    void arreter() {
    };

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(int num_serie) {
        this.num_serie = num_serie;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public Individu getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Individu proprietaire) {
        this.proprietaire = proprietaire;
    }

    @Override
    public String toString() {
        return "Voiture{" + "marque=" + marque + ", num_serie=" + num_serie + ", couleur=" + couleur + ", immatriculation=" + immatriculation + ", annee=" + annee + ", proprietaire=" + proprietaire + '}';
    }

}
