package tp1_classes;

public class TestLivre {

    public static void main(final String[] args) {
        final Livre l1 = new Livre();
        final Livre l2 = new Livre("Le Petit Prince", 1234, 0154654);

        System.out.println(l1);
        System.out.println(l2);
    }
}