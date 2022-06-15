package tp3_objets.ex2;

public class Intervenant {

    private String nom;
    private int tauxHoraire;

    public Intervenant() {
    }

    public Intervenant(String leNom, double leTauxHoraire) {
        nom = leNom;
        tauxHoraire = (int) leTauxHoraire;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

}
