package tp2_heritage.ex2;

public class Salarie extends Individu {
    private int salaire;

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(final int salaire) {
        this.salaire = salaire;
    }

    public Salarie(final String prenom, final String nom, final int salaire) {

        super(prenom, nom);
        this.salaire = salaire;

    }

    @Override
    public String toString() {
        return super.toString() + ", salaire=" + getSalaire() + "€/mois";
    }
}
