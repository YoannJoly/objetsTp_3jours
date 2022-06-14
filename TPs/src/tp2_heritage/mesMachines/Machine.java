package tp2_heritage.mesMachines;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Machine {
    private final LocalDate dateAchat;
    private final String marque;
    private final String modele;

    public Machine(final LocalDate dateAchat, final String marque, final String modele) {
        this.dateAchat = dateAchat;
        this.marque = marque;
        this.modele = modele;
    }

    public long getAge() {
        return ChronoUnit.YEARS.between(dateAchat, LocalDate.now());
    }

    /**
     * {@inheritDoc}
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        final long age = getAge();
        return marque + " " + modele + " (" + age + " an" + (age > 1 ? "s" : "") + ")";
    }
}