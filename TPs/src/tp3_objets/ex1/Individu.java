package tp3_objets.ex1;

public class Individu {

    private String nom;
    private String prenom;

    public Individu(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Individu{" + "nom=" + nom + ", prenom=" + prenom + '}';
    }

}
