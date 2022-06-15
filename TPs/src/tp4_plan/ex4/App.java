package tp4_plan.ex4;

import java.awt.*;

public class App {

    public static void main(final String[] args) {
        final Terrasse terrasseA = new Terrasse(Color.WHITE, 12, 24);

        // affiche la terrasse A et ses informations
        System.out.println("Les informations de la terrasse A sont : " + terrasseA.affiche());
        final Terrasse terrasseB = new Terrasse(Color.YELLOW, 8, 204);
        final Terrasse terrasseC = new Terrasse(Color.RED, 102, 4);
        final Etalage etalageA = new Etalage(Color.WHITE, 120, 204);
        // affiche l'etalage A et ses informations
        System.out.println("Les informations de l'étalage A sont : " + etalageA.affiche());
        final Etalage etalageB = new Etalage(Color.MAGENTA, 126, 241);
        final Etalage etalageC = new Etalage(Color.BLUE, 812, 214);
        final Plan plan = new Plan("monPlan");
        plan.ajouteEmplacement(terrasseA);
        plan.ajouteEmplacement(terrasseB);
        plan.ajouteEmplacement(terrasseC);
        plan.ajouteEmplacement(etalageA);
        plan.ajouteEmplacement(etalageB);
        plan.ajouteEmplacement(etalageC);
        plan.supprimeEmplacement(etalageA);
        System.out.println(plan.affichePlan());
    }

}
