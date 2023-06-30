package fr.hb.ibm.sejour.builderImpl;

import fr.hb.ibm.sejour.builder.SejourBuilder;
import fr.hb.ibm.sejour.business.Sejour;
import fr.hb.ibm.sejour.business.Tarif;
import fr.hb.ibm.sejour.business.Voyageur;

import java.util.ArrayList;
import java.util.List;

public class SejourBuilderImpl implements SejourBuilder {

	private Sejour sejour;
	private List<Sejour> sejours = new ArrayList<>();
	private List<Tarif> tarifs = new ArrayList<>();

	public SejourBuilderImpl() {
		sejour = new Sejour();

		// Liste des séjours
		Sejour tokyo = new Sejour("Tokyo");
		Sejour saintDenis = new Sejour("Saint-Denis");
		Sejour villefranche = new Sejour("Villefranche-sur-Saône");

		sejours.add(tokyo);
		sejours.add(saintDenis);
		sejours.add(villefranche);

		// Liste de tarifs
		tarifs.add(new Tarif(tokyo, 1200));
		tarifs.add(new Tarif(saintDenis, 1800));
		tarifs.add(new Tarif(villefranche, 800));

		// Ajout des séjours et tarifs au sejour
		sejour.setType("Sejour");
		sejour.setSejours(sejours);
		sejour.setTarifs(tarifs);
	}

	public SejourBuilder choisirSejour(String type) {
		sejour.setType(type);
		return this;
	}

	public SejourBuilder renseignerVoyageurs(List<Voyageur> voyageurs) {

		return this;
	}

	public Sejour build() {
		return sejour;
	}
}
