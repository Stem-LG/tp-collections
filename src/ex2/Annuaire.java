package ex2;

import java.util.Map;
import java.util.HashMap;
// import java.util.TreeMap;

public class Annuaire {

    Map<String, Fiche> fiches;

    Annuaire() {
        fiches = new HashMap<>();
        // triée par le nom
        // fiches = new TreeMap<>();
    }

    public Fiche chercher(String nom) {
        return fiches.get(nom);
    }

    public void ajouter(String nom, Fiche fiche) {
        fiches.put(nom, fiche);
    }

    public void afficher() {
        for (String ficheKey : fiches.keySet()) {
            System.out.println(ficheKey + ":");
            System.out.println(fiches.get(ficheKey));
        }
    }

}
