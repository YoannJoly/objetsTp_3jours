package tp3_objets.ex2;

import java.util.ArrayList;
import java.util.Hashtable;

public class UtilisationHashTableEtArrayList {

    public static void main(final String[] args) {
        System.out.println("*** Hashtable ***");
        final ArrayList<String> al = new ArrayList<String>();
        al.add("mot");
        al.add("automne");
        al.add("belle journée");
        System.out.println("Affichage de l'ensemble des valeurs :");
        for (final String e : al) {
            System.out.println(e);
        }

        System.out.println("*** Hashtable ***");

        final Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(12, "automne");
        ht.put(145, "mot");
        ht.put(788, "belle journée");
        ht.put(12, "hiver");
        // Remplace la valeur précédente car il y a déjà une clé 12
        System.out.println("valeur associé à la clé '12' dans la hashtable : " + ht.get(12));
        // System.out.println("valeur associé à la clé '12' dans la hashtable :
        System.out.println("Affichage de l'ensemble des valeurs :");
        for (final String e : ht.values()) {
            System.out.println(e);
        }

    }
}
