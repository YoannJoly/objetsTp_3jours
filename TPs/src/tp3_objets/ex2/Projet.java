package tp3_objets.ex2;

import java.util.Date;

public class Projet {

    private final String nom;
    private final Date debut;
    private final Date fin;
    private final int prixFacturéMO;

    public Projet(final String nom, final Date debut, final Date fin, final int prixFacturéMO) {
        this.nom = nom;
        this.debut = debut;
        this.fin = fin;
        this.prixFacturéMO = prixFacturéMO;
    }

    int cummulCoutMO() {
        return (int) ((fin.getTime() - debut.getTime()) / (1000 * 60 * 60 * 24)) * prixFacturéMO;
    }

    int margeBruteCourante() {
        return cummulCoutMO() - prixFacturéMO;
    }

}
