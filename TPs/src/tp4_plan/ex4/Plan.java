package tp4_plan.ex4;

import java.util.ArrayList;
import java.util.List;

public class Plan {

    private int echelle;
    private final String nomFichier;

    List<Emplacement> listeEmplacements = new ArrayList<Emplacement>();

    public Plan(final String nomFichier) {
        this.nomFichier = nomFichier;
    }

    void ajouteEmplacement(final Emplacement emplacement) {
        listeEmplacements.add(emplacement);
    }

    void supprimeEmplacement(final Emplacement emplacement) {
        listeEmplacements.remove(emplacement);

    }

    String affichePlan() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Plan : " + nomFichier + "\n");
        return sb.toString();
    }

}
