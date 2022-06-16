package tp5.evaluations;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class App {

    public static void main(final String[] args) {
        String prenom = "";
        String nom = "";
        String matiere = "";
        String note = "";
        String commentaire = "";
        final Date date = new Date();
        int fileNumber = 0;
        final int bestNote[] = new int[3];

        // Création du fichier
        System.out.println("Quel est le prenom du stagiaire ?");
        prenom = System.console().readLine();
        System.out.println("Quel est le nom du stagiaire ?");
        nom = System.console().readLine();
        System.out.println("Quelle matière est évaluée ?");
        matiere = System.console().readLine();
        System.out.println("Quelle note a-t-il obtenu ?");
        note = System.console().readLine();
        System.out.println("Que pensez vous de son évaluation?");
        commentaire = System.console().readLine();

        // Écritute des meilleurs notes
        for (int i = 0; i < bestNote.length; i++) {
            if (Integer.parseInt(note) > bestNote[i]) {
                bestNote[i] = Integer.parseInt(note);
                break;
            }
        }

        // Création de l'évaluation
        File f = new File("src/tp5/evaluations/txt/evaluations" + fileNumber + ".txt");

        if (f.exists()) {
            try {
                fileNumber++;
                f = new File("src/tp5/evaluations/txt/evaluations" + fileNumber + ".txt");
                f.createNewFile();
            } catch (final IOException e) {
                e.printStackTrace();
            }
        }

        if (!f.exists()) {
            try {
                f.createNewFile();
            } catch (final IOException e) {
                e.printStackTrace();
            }
        }

        // Ecriture dans le fichier
        try {
            final java.io.FileWriter fw = new java.io.FileWriter(f, true);
            fw.write(" Éleve --> " + prenom + " " + nom + "\n Matiere --> " + matiere + "\n Date --> " + date
                    + "\n Note --> " + note + "\n Commentaire --> " + commentaire + "\n");
            fw.close();
        } catch (final IOException e) {
            e.printStackTrace();
        }

        // Affichage des meilleures notes
        System.out.println("Les meilleures notes sont :");
        for (int i = 0; i < bestNote.length; i++) {
            System.out.println(bestNote[i]);
        }
    }
}
