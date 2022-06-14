package tp2_heritage.ex2;

public class Individu {
    private String prenom;
    private String nom;

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(final String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(final String nom) {
        this.nom = nom;
    }

    public Individu(final String prenom, final String nom) { //
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "prénom=" + getPrenom() + ", nom=" + getNom();
    }
}
