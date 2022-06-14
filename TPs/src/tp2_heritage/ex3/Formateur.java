package tp2_heritage.ex3;

import java.util.Date;

public class Formateur extends Personne {

    private final Date dateDeCreatiopn;
    private final int numeroIntervenant;
    private static int nombreIntervenant;

    public Formateur(final String prenom, final String nom, final Date dateNaissance, final String adresse,
            final String codePostal, final String ville,
            final String telephone, final Date dateDeCreatiopn, final int numeroIntervenant,
            final int nombreIntervenant) {
        super(prenom, nom, dateNaissance, adresse, codePostal, ville, telephone);
        this.dateDeCreatiopn = dateDeCreatiopn;
        this.numeroIntervenant = numeroIntervenant;
        Formateur.nombreIntervenant = nombreIntervenant;
    }

    Personne formateur = new Personne("Johny", "Doe", new Date(), "adresse", "36514", "Paris", "0145896325");

    @Override
    public String toString() {
        return super.toString() + ", dateDeCreatiopn=" + dateDeCreatiopn + ", numeroIntervenant=" + numeroIntervenant
                + ", nombreIntervenant=" + nombreIntervenant;
    }

}
