package com.red.one.entities;

import lombok.Getter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Getter
@ToString
@Table(name = "poke_character")
public class PokeCharacterEntity extends AuditEntity {
    private final String name;
    private final Integer baseExperience;
    private final Integer height;
    private final Integer weight;
    @OneToOne
    private final PokeSpeciesEntity speciesEntity;

    protected PokeCharacterEntity() {
        this.name = null;
        this.baseExperience = null;
        this.height = null;
        this.weight = null;
        this.speciesEntity = null;
    }
}