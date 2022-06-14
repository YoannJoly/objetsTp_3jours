package tp2_heritage.mesMachines;

import java.time.LocalDate;

public class pompeAGravitation extends Machine {

    int debit;
    boolean eauOperationelle;

    public pompeAGravitation(final LocalDate dateAchat, final String marque, final String modele, final int debit, final boolean eauOperationelle) {
        super(dateAchat, marque, modele);
        this.debit = debit;
        this.eauOperationelle = eauOperationelle;
    }

}
