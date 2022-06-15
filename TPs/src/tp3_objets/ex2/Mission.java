package tp3_objets.ex2;

import java.util.Date;
import java.util.Dictionary;

public class Mission {

    private final String nom;
    private final String description;
    private final int nbHeuresPrevues;
    private Dictionary<String, Integer> releveHoraire;
    Intervenant executant = new Intervenant();

    public Mission(final String nom, final String description, final int nbHeuresPrevues, final Intervenant intervenant) {
        this.nom = nom;
        this.description = description;
        this.nbHeuresPrevues = nbHeuresPrevues;
        this.executant = intervenant;
    }

    public Dictionary<String, Integer> getReleveHoraire() {
        return releveHoraire;
    }

    public Intervenant getExecutant() {
        return executant;
    }

    void ajoutReleveHoraire(final Date jour, final int nbHeures) {
        releveHoraire.put(jour.toString(), nbHeures);
    }

    public String getNom() {
        return nom;
    }

    public String getDescription() {
        return description;
    }

    public int getNbHeuresPrevues() {
        return nbHeuresPrevues;
    }

    // public double nbHeuresEffectues() {
    // double nbHeuresEffectues = 0;
    // for (int nbHeures : getReleveHoraire()) {
    // nbHeuresEffectues += nbHeures;
    // }
    // return nbHeuresEffectues;
    // }
}
