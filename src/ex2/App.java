package ex2;

import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Annuaire annu = new Annuaire();

        while (true) {

            System.out.println("commande: ");

            String commande = sc.nextLine();

            if (commande.length() < 1) {
                System.out.println("commande invalide");
            } else if (commande.equals("bye") || commande.equals(".")) {
                System.out.println("bye");
                break;
            } else {
                String nom = commande.substring(1);
                switch (commande.charAt(0)) {
                    case '+':
                        System.out.println("num:");
                        int num = sc.nextInt();
                        System.out.println("address:");
                        sc.nextLine();
                        String address = sc.nextLine();

                        Fiche f = new Fiche(num, address);

                        annu.ajouter(nom, f);
                        break;
                    case '?':
                        System.out.println(nom+":");
                        System.out.println(annu.chercher(commande.substring(1)));
                        break;

                    case '!':
                        annu.afficher();
                        break;

                    default:
                        System.out.println("commande invalide");
                        break;
                }
            }

        }

        sc.close();
    }
}
