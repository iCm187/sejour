package fr.hb.ibm.sejour.business;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class Sejour {
	
	private String type;
    private double tarif;
    private String codeUnique;
    private List<Option> optionsSelectionnees;
    private List<Voyageur> voyageurs;
    private Cadeau cadeau;

    public Sejour(String type) {
        this.type = type;
    }

	public void setNom(String codeUnique) {
        this.codeUnique = codeUnique;
	}
}
