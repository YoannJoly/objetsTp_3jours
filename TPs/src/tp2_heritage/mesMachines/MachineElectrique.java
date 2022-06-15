package tp2_heritage.mesMachines;

import java.time.LocalDate;

public class MachineElectrique extends Machine {

    private final int puissanceW;

    public MachineElectrique(final LocalDate dateAchat, final String marque, final String modele,
            final int puissanceW) {
        super(dateAchat, marque, modele);
        this.puissanceW = puissanceW;
    }

    /**
     * {@inheritDoc}
     * 
     * @see mesMachines.Machine#toString()
     */
    @Override
    public String toString() {
        return "(" + puissanceW + "W) " + super.toString();
    }

}
