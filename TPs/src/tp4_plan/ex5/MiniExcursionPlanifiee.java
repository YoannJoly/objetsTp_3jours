package tp4_plan.ex5;

import java.util.Date;

public class MiniExcursionPlanifiee {

    private Date date;
    private int nbInscrits;

    boolean estComplete() {
        return nbInscrits == MiniExcursion.getNombrePlaces();
    }

    public Date getDate() {
        return date;
    }

}
