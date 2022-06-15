package tp4_plan;

import java.util.ArrayList;
import java.util.List;

public class Plan {

    private int echelle;
    private String nomFichier;

    List<Emplacement> listeEmplacements = new ArrayList<Emplacement>();

    public Plan(String nomFichier) {
        this.nomFichier = nomFichier;
    }

    void ajouteEmplacement(Emplacement emplacement) {
        listeEmplacements.add(emplacement);
    }

    void supprimeEmplacement(Emplacement emplacement) {
        listeEmplacements.remove(emplacement);

    }

    String affichePlan() {
        StringBuilder sb = new StringBuilder();
        sb.append("Plan : " + nomFichier + "\n");
        return sb.toString();
    }

}
