package tp_architecture_modulaire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {

    static List<String> liste = new ArrayList<>(Arrays.asList("Triangle", "Carre", "Cercle", "Rectangle"));
    static String formeString;
    static int longueurBase;
    static int longueurHauteur;
    static int longueurCote;
    static int longueurRayon;

    public static void main(final String[] args) {

        System.out.println("Quel forme voulez-vous ? : " + liste);

        try (Scanner sc = new Scanner(System.in)) {
            formeString = sc.nextLine();
            getForme(formeString);
            askForm();
        } catch (final Exception e) {
            System.out.println("Veuillez entrer une forme valide");
        }

    }

    public static void getForme(final String formeString) {
        switch (formeString) {
            case "Triangle":
                System.out.println("Quelle est la longueur de la base ? : ");
                try (Scanner sc = new Scanner(System.in)) {
                    longueurBase = sc.nextInt();
                    System.out.println("Quelle est la longueur de l'hauteur ? : ");
                    longueurHauteur = sc.nextInt();
                    System.out.println(
                            "Triangle --> Longueur de la base " + longueurBase + " et hauteur " + longueurHauteur);
                } catch (final Exception e) {
                    System.out.println("Veuillez entrer des valeurs valides");
                }
                break;
            case "Carre":
                System.out.println("Quelle est la longueur du côté ? : ");
                try (Scanner sc = new Scanner(System.in)) {
                    longueurCote = sc.nextInt();
                } catch (final Exception e) {
                    System.out.println("Veuillez entrer une longueur valide");
                }
                System.out.println("Carre --> Longueur du côté " + longueurCote);
                break;
            case "Cercle":
                try (Scanner sc = new Scanner(System.in)) {
                    System.out.println("Quelle est la longueur du rayon ? : ");
                    longueurRayon = sc.nextInt();
                    System.out.println("Cercle --> Longueur du rayon " + longueurRayon);
                } catch (final Exception e) {
                    System.out.println("Veuillez entrer une longueur valide");
                }
                break;
            case "Rectangle":
                System.out.println("Quelle est la longueur de la base ? : ");
                try (Scanner sc = new Scanner(System.in)) {
                    longueurBase = sc.nextInt();
                    System.out.println("Quelle est la longueur de l'hauteur ? : ");
                    longueurHauteur = sc.nextInt();
                    System.out.println(
                            "Rectangle --> Longueur de la base " + longueurBase + " et hauteur " + longueurHauteur);
                } catch (final Exception e) {
                    System.out.println("Veuillez entrer des valeurs valides");
                }
                break;
            default:
                System.out.println("Forme non reconnue");
                break;

        }

    }

    public static void askForm() {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Voulez-vous faire une autre forme ? : (oui/non)");
            final String answers = sc.nextLine();
            if (answers.equals("oui")) {
                main(null);
            } else {
                System.out.println("Au revoir");
            }
        }
    }
}
