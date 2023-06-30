package fr.hb.ibm.sejour.builder;

import fr.hb.ibm.sejour.business.Sejour;
import fr.hb.ibm.sejour.business.Voyageur;

import java.util.List;

public interface SejourBuilder {

    SejourBuilder choisirSejour(String type);

    SejourBuilder renseignerVoyageurs(List<Voyageur> voyageurs);

    Sejour build();
}