package tp1_classes;

public class Livre {

    private String titre;
    private String auteur;
    private int nbPages;
    private long isbn;
    private int annee;
    private int prix;

    public Livre() {
        super();
    }

    public Livre(final String titre, final int nbPages, final long isbn) {
        this.titre = titre;
        this.nbPages = nbPages;
        this.isbn = isbn;
    }

    public Livre(final String titre, final String auteur, final int nbPages, final long isbn) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
        this.isbn = isbn;
    }

    public Livre(final String titre, final String auteur, final int nbPages, final long isbn, final int prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
        this.isbn = isbn;
        this.prix = prix;
    }

    public Livre(final String titre, final String auteur, final int nbPages, final long isbn, final int annee, final int prix) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbPages = nbPages;
        this.isbn = isbn;
        this.annee = annee;
        this.prix = prix;
    }

    public Livre(Livre livre) {
        this.titre = livre.titre;
        this.auteur = livre.auteur;
        this.nbPages = livre.nbPages;
        this.isbn = livre.isbn;
        this.annee = livre.annee;
        this.prix = livre.prix;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(final String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(final String auteur) {
        this.auteur = auteur;
    }

    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(final int nbPages) {
        this.nbPages = nbPages;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(final long isbn) {
        this.isbn = isbn;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(final int annee) {
        this.annee = annee;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(final int prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Livre{" + "titre=" + titre + ", auteur=" + auteur + ", nbPages=" + nbPages + ", isbn=" + isbn
                + ", annee=" + annee + ", prix=" + prix + '}';
    }

}
