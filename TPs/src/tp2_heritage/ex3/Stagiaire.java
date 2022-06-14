package tp2_heritage.ex3;

import java.util.Date;

public class Stagiaire extends Personne {

    public Stagiaire(final String prenom, final String nom, final Date dateNaissance, final String adresse, final String codePostal, final String ville,
            final String telephone) {
        super(prenom, nom, dateNaissance, adresse, codePostal, ville, telephone);
    }

    Personne stagiaire = new Personne("John", "Doe", new Date(), "adresse", "45841", "Pétaouchnok", "0354987465");

}
