package com.red.one.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity(name = "pokeSpecies")
@Getter
@AllArgsConstructor
@Table(name = "poke_species")
public class PokeSpeciesEntity extends AuditEntity implements Serializable {
    private final String color;
    private final String name;
    private final String url;
    private final String idExt;
    @OneToOne(mappedBy = "species", cascade = CascadeType.ALL)
    private final PokeCharacterEntity pokeCharacter;

    protected PokeSpeciesEntity() {
        this.color=null;
        this.name =null;
        this.url=null;
        this.idExt=null;
        this.pokeCharacter=null;
    }
}