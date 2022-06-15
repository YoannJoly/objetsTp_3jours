package tp3_objets.ex2;

public class Intervenant {

    private String nom;
    private int tauxHoraire;

    public Intervenant() {
    }

    public Intervenant(final String nom, final double tauxHoraire) {
        this.nom = nom;
        this.tauxHoraire = (int) tauxHoraire;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

}
