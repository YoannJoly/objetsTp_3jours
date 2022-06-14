package tp1_classes;

public class Client {

    private String nom;
    private String prenom;
    private String adresse;
    private String cp;
    private String ville;

    public Client(final String nom, final String prenom, final String adresse, final String cp, final String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.cp = cp;
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Client{" + "nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", cp=" + cp + ", ville="
                + ville + '}';
    }

    public String getNom() {
        return nom;
    }

    public void setNom(final String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(final String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(final String adresse) {
        this.adresse = adresse;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(final String cp) {
        this.cp = cp;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(final String ville) {
        this.ville = ville;
    }

}
