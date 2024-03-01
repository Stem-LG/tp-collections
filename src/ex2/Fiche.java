package ex2;

public class Fiche {
    int numero;
    String adresse;

    public Fiche(int numero, String adresse) {
        this.numero = numero;
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Numéro: " + numero + ", Adresse: " + adresse;
    }
}