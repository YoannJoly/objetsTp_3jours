package tp4_plan.ex5;

import java.time.LocalTime;

public class Etape {

    private static int numEtape;
    private String description;
    private static int dureePrévue;

    public Etape(final String description, final int dureePrévue) {
        this.description = description;
        Etape.dureePrévue = dureePrévue;
        numEtape++;
    }

    public static int getNumEtape() {
        return numEtape;
    }

    public String getDescription() {
        return description;
    }

    public static LocalTime donneDureePrevuehhmm() {
        final LocalTime dureePrevue = LocalTime.of(0, dureePrévue);
        return dureePrevue;
    }

    public static int getDureePrévue() {
        return dureePrévue;
    }

    public static void setNumEtape(final int numEtape) {
        Etape.numEtape = numEtape;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public static void setDureePrévue(final int dureePrévue) {
        Etape.dureePrévue = dureePrévue;
    }

}
