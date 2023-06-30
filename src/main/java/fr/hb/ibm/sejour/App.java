package fr.hb.ibm.sejour;

import fr.hb.ibm.sejour.builder.SejourBuilder;
import fr.hb.ibm.sejour.builderImpl.SejourBuilderImpl;
import fr.hb.ibm.sejour.business.Sejour;
import fr.hb.ibm.sejour.business.Voyageur;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    private static Scanner scanner = new Scanner(System.in);
    private static SejourBuilder sejourBuilder = new SejourBuilderImpl();

    public static void main(String[] args) {

        System.out.println("Veuillez entrer le prénom du premier voyageur :");
        String prenomVoyageur1 = scanner.nextLine();

        System.out.println("Veuillez entrer le prénom du deuxième voyageur :");
        String prenomVoyageur2 = scanner.nextLine();

        Voyageur voyageur1 = new Voyageur(prenomVoyageur1);
        Voyageur voyageur2 = new Voyageur(prenomVoyageur2);

        List<Voyageur> voyageurs = new ArrayList<>();
        voyageurs.add(voyageur1);
        voyageurs.add(voyageur2);

        sejourBuilder.renseignerVoyageurs(voyageurs);

        //Construction du séjour
        Sejour sejour = sejourBuilder.build();

        // Affiche le récapitulatif du séjour
        System.out.println("Récapitulatif du séjour :");
        System.out.println(sejour);

        scanner.close();
    }
}

