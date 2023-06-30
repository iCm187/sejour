package fr.hb.ibm.sejour.business;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class Tarif {
    private Sejour sejour;
    private double prix;

    public Tarif(Sejour sejour, double prix) {
        this.sejour = sejour;
        this.prix = prix;
    }
}

