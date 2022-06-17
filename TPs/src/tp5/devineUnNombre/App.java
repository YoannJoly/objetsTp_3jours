package tp5.devineUnNombre;

public class App {

    public static void main(final String[] args) {
        final int numberToGuess = (int) (Math.random() * 100);
        int numberOfTries = 0;
        final int numberOfTriesMax = 10;

        // On demande à l'utilisateur de deviner un nombre
        System.out.println("Je pense à un nombre entre 1 et 100");
        System.out.println("Vous avez " + numberOfTriesMax + " essais pour essayez de trouver le nombre");

        // Boucle de jeu
        while (numberOfTries < numberOfTriesMax) {
            System.out.println("Quel nombre proposez-vous ?");
            final int guess = Integer.parseInt(System.console().readLine());
            numberOfTries++;

            if (guess == numberToGuess) {
                System.out.println("Félicitations! Le nombre était " + numberToGuess + ".");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Vote nombre est trop petit.");
            } else if (guess > numberToGuess) {
                System.out.println("Vote nombre est trop grand.");
            }

        }

        // Si l'utilisateur n'a pas trouvé le nombre
        if (numberOfTries == numberOfTriesMax) {
            System.out.println("Vous avez dépassé le nombre d'essais autorisés.");
        }
    }
}