package tp2_heritage.mesMachines;

import java.time.LocalDate;

public class MachineEssence extends Machine {

    int puissanceCV;

    public MachineEssence(final LocalDate dateAchat, final String marque, final String modele, final int puissanceCV) {
        super(dateAchat, marque, modele);
        this.puissanceCV = puissanceCV;
    }

}
