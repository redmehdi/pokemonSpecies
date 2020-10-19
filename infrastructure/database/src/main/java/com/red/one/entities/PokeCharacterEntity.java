package com.red.one.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "poke_character")
public class PokeCharacterEntity extends AuditEntity {
    private final String name;
    private final Integer baseExperience;
    private final Integer height;
    private final Integer weight;
    @OneToOne
    @JoinColumn(name = "species_id")
    private PokeSpeciesEntity species;

    protected PokeCharacterEntity() {
        this.name = null;
        this.baseExperience = null;
        this.height = null;
        this.weight = null;
        this.species = null;
    }
}