package tp4_plan.ex5;

import java.time.LocalTime;
import java.util.List;

public class MiniExcursion {

    private int numMiniExcursion;
    private String libelleMiniExcursion;
    private static int nombrePlaces;
    private List<Etape> listeEtapes;

    public MiniExcursion(final String libelleMiniExcursion, final int nombrePlaces) {
        this.libelleMiniExcursion = libelleMiniExcursion;
        MiniExcursion.nombrePlaces = nombrePlaces;
        numMiniExcursion++;
    }

    public static int getNombrePlaces() {
        return nombrePlaces;
    }

    public String getLibelleMiniExcursion() {
        return libelleMiniExcursion;
    }

    public int getNumMiniExcursion() {
        return numMiniExcursion;
    }

    public void setLibelleMiniExcursion(final String libelleMiniExcursion) {
        this.libelleMiniExcursion = libelleMiniExcursion;
    }

    public static void setNombrePlaces(final int nombrePlaces) {
        MiniExcursion.nombrePlaces = nombrePlaces;
    }

    int donneDureePrevue() {

        return Etape.getDureePrévue();
    }

    LocalTime donneDureePrevuehhmm() {

        return Etape.donneDureePrevuehhmm();
    }

    void ajouteEtape(final Etape etape) {
        listeEtapes.add(etape);
    }

}
