package tp2_heritage.ex3;

import java.util.Date;

public class Personne {
    private final String prenom;
    private final String nom;
    private final Date dateNaissance;
    private final String adresse;
    private final String codePostal;
    private final String ville;
    private final String telephone;

    public Personne(final String prenom, final String nom, final Date dateNaissance, final String adresse, final String codePostal, final String ville,
            final String telephone) {
        this.prenom = prenom;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.codePostal = codePostal;
        this.ville = ville;
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Stagiaire [prenom=" + prenom + ", nom=" + nom + ", dateNaissance=" + dateNaissance + ", adresse="
                + adresse
                + ", codePostal=" + codePostal + ", ville=" + ville + ", telephone=" + telephone + "]";
    }
}
