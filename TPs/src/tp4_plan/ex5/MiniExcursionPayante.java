package tp4_plan.ex5;

public class MiniExcursionPayante extends MiniExcursion {
    private double tarif;

    public MiniExcursionPayante(final String libelleMiniExcursion, final int nombrePlaces) {
        super(libelleMiniExcursion, nombrePlaces);
    }

    public double getTarif() {
        return tarif;
    }

}
