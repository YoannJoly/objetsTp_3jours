package tp2_heritage.mesMachines;

import java.time.LocalDate;

public class pompeAGravitation extends Machine {

    private int debit;
    private boolean eauOperationelle;

    public pompeAGravitation(final LocalDate dateAchat, final String marque, final String modele, final int debit,
            final boolean eauOperationelle) {
        super(dateAchat, marque, modele);
        this.debit = debit;
        this.eauOperationelle = eauOperationelle;
    }

    @Override
    public String toString() {
        return "pompeAGravitation (" + debit + "L) " + super.toString();
    }

}
