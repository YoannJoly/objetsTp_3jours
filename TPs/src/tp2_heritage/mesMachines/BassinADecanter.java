package tp2_heritage.mesMachines;

import java.time.LocalDate;

public class BassinADecanter extends Machine {

    private int capaciteHL;

    public BassinADecanter(final LocalDate dateAchat, final String marque, final String modele, final int capaciteHL) {
        super(dateAchat, marque, modele);
        this.capaciteHL = capaciteHL;
    }

    @Override
    public String toString() {
        return "Bassin à décanter (" + capaciteHL + "L) " + super.toString();
    }

}
