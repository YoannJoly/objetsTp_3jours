package tp3_objets.ex2;

import java.util.Date;

public class Projet {

    private String nom;
    private Date debut;
    private Date fin;
    private int prixFacturéMO;

    public Projet(String nom, Date debut, Date fin, int prixFacturéMO) {
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
