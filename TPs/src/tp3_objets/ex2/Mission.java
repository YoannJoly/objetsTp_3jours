package tp3_objets.ex2;

import java.util.Date;
import java.util.Dictionary;

public class Mission {

    private String nom;
    private String description;
    private int nbHeuresPrevues;
    private Dictionary<String, Integer> releveHoraire;
    Intervenant executant = new Intervenant();

    public Mission(String nom, String description, int nbHeuresPrevues, Intervenant intervenant) {
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

    void ajoutReleveHoraire(Date jour, int nbHeures) {
        releveHoraire.put(jour.toString(), nbHeures);
    }

    // public double nbHeuresEffectues()    {
    //     double nbHeuresEffectues = 0;
    //     for (int nbHeures : getReleveHoraire()) {
    //         nbHeuresEffectues += nbHeures;
    //     }
    //     return nbHeuresEffectues;
    // }
}


