package tp1_classes;

public class Livre {

    private String titre;
    private String auteur;
    private int nbPages;
    private long isbn;
    private int annee;
    private int prix;

    public Livre() {
    }

    public Livre(String titre, int nbPages, long isbn) {
        this.titre = titre;
        this.nbPages = nbPages;
        this.isbn = isbn;
    }

    public Livre(String titre, String auteur, int nbPages, long isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
        this.isbn = isbn;
    }

    public Livre(String titre, String auteur, int nbPages, long isbn, int prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
        this.isbn = isbn;
        this.prix = prix;
    }

    public Livre(String titre, String auteur, int nbPages, long isbn, int annee, int prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
        this.isbn = isbn;
        this.annee = annee;
        this.prix = prix;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Livre{" + "titre=" + titre + ", auteur=" + auteur + ", nbPages=" + nbPages + ", isbn=" + isbn + ", annee=" + annee + ", prix=" + prix + '}';
    }

    

    

}
