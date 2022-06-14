package tp2_heritage.ex2;

public class TestSalarie {

    public TestSalarie() {
    }

    public static void main(final String[] args) {

        final Individu am = new Individu("Aurélien", "Martineau");
        System.out.println("Individu =" + am.toString());
        final Salarie ak = new Salarie("Alain", "Kerlero", 5000);
        System.out.println("Individu : " + am.toString());
        System.out.println("Salarie : " + ak.toString());
    }
}
