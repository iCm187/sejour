package fr.hb.ibm.sejour.business;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class Voyageur {

    private String prenom;

    public Voyageur(String prenom) {
        this.prenom = prenom;
    }
}
