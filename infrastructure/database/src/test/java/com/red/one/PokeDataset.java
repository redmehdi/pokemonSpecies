package com.red.one;

import com.red.one.domain.entities.PokeCharacter;
import com.red.one.domain.entities.PokeSpecies;
import com.red.one.entities.PokeCharacterEntity;
import com.red.one.entities.PokeSpeciesEntity;

public final class PokeDataset {

    public static PokeSpecies[] getSpecies() {
        return new PokeSpecies[]{
                new PokeSpecies(1L, "color1", "name1", getCharacters()[0]),
                new PokeSpecies(2L, "color2", "name2", getCharacters()[1]),
                new PokeSpecies(3L, "color3", "name3", getCharacters()[2]),
                new PokeSpecies(4L, "color4", "name4", getCharacters()[3]),
                new PokeSpecies(5L, "color5", "name5", getCharacters()[4])
        };
    }

    public static PokeCharacter[] getCharacters() {
        return new PokeCharacter[]{
                new PokeCharacter(1L, "name1", 3, 3, 3),
                new PokeCharacter(2L, "name2", 3, 3, 34),
                new PokeCharacter(3L, "name3", 3, 3, 5),
                new PokeCharacter(4L, "name4", 3, 3, 23),
                new PokeCharacter(5L, "name5", 3, 3, 88)
        };
    }

    public static PokeSpeciesEntity[] getSpeciesEntity() {
        return new PokeSpeciesEntity[]{
                new PokeSpeciesEntity("color1", "name1", "url1", "idExt1", getCharactersEntity()[0]),
                new PokeSpeciesEntity("color2", "name2", "url2", "idExt2", getCharactersEntity()[1]),
                new PokeSpeciesEntity("color3", "name3", "url3", "idExt3", getCharactersEntity()[2]),
                new PokeSpeciesEntity("color4", "name4", "url4", "idExt4", getCharactersEntity()[3]),
                new PokeSpeciesEntity("color5", "name5", "url5", "idExt5", getCharactersEntity()[4])
        };
    }

    public static PokeCharacterEntity[] getCharactersEntity() {
        return new PokeCharacterEntity[]{
                new PokeCharacterEntity("name1", 3, 3, 3, null),
                new PokeCharacterEntity("name2", 3, 3, 34, null),
                new PokeCharacterEntity("name3", 3, 3, 5, null),
                new PokeCharacterEntity("name4", 3, 3, 23, null),
                new PokeCharacterEntity("name5", 3, 3, 88, null)
        };
    }

    public static PokeSpeciesEntity getSpecie(final Long id, final String color, final String name, final String url,
                                              final String idExt, final PokeCharacterEntity pokeCharacter) {
        return new PokeSpeciesEntity(color, name, url, idExt, pokeCharacter);
    }

    public static PokeCharacterEntity getCharacter(final Long id, final String name, final Integer baseExperience,
                                                   final Integer height, final Integer weight, final PokeSpeciesEntity pokeSpeciesEntity) {
        return new PokeCharacterEntity(name, baseExperience, height, weight, pokeSpeciesEntity);
    }
}
