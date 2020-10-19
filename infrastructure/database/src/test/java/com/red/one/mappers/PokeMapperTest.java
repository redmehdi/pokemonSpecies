package com.red.one.mappers;

import com.red.one.domain.entities.PokeCharacter;
import com.red.one.domain.entities.PokeSpecies;
import com.red.one.entities.PokeCharacterEntity;
import com.red.one.entities.PokeSpeciesEntity;
import static org.junit.Assert.*;
import org.junit.Test;

public class PokeMapperTest {

    public static final String COLOR = "color";
    public static final String NAME = "name";
    public static final String URL = "url";
    public static final String idExt ="idExt";

    private PokeMapper mapper = new PokeMapperImpl();

    @Test
    public void mapToDomainSpecies_whenNull_shouldReturnNull() {
        final PokeSpecies result = mapper.map((PokeSpeciesEntity) null);

        assertNull(result);
    }

    @Test
    public void mapToDomainCharacter_whenNull_shouldReturnNull() {
        final PokeCharacter result = mapper.map((PokeCharacterEntity) null);

        assertNull(result);
    }

    @Test
    public void mapToDomainSpecies_whenNullParams_shouldExpectedValues() {
        PokeSpeciesEntity expected = new PokeSpeciesEntity(null, null, null,null,null);

        final PokeSpecies result = mapper.map(expected);

        assertNotNull(result);
        assertNull(result.getId());
        assertNull(result.getName());
        assertNull(result.getColor());
        assertNull(result.getPokeCharacter());
    }

    @Test
    public void mapToDomainSpecies_whenNotNullParams_shouldExpectedValues() {
        PokeCharacterEntity pokeCharacter= new PokeCharacterEntity(null,null,null,null,null);
        PokeSpeciesEntity expected = new PokeSpeciesEntity(COLOR, NAME, URL, idExt, pokeCharacter);

        final PokeSpecies result = mapper.map(expected);

        assertNotNull(result);
        assertEquals(expected.getColor(),result.getColor());
        assertEquals(expected.getName(),result.getName());
        assertNull(result.getId());
        assertNotNull(result.getPokeCharacter());
    }

    @Test
    public void mapToDomainSpecies_whenNullColor_shouldExpectedValues() {
        PokeCharacterEntity pokeCharacter= new PokeCharacterEntity(null,null,null,null,null);
        PokeSpeciesEntity expected = new PokeSpeciesEntity(null, NAME, URL, idExt, pokeCharacter);

        final PokeSpecies result = mapper.map(expected);

        assertNotNull(result);
        assertNull(result.getColor());
        assertEquals(expected.getName(),result.getName());
        assertNull(result.getId());
        assertNotNull(result.getPokeCharacter());
    }

    @Test
    public void mapToDomainSpecies_whenNullName_shouldExpectedValues() {
        PokeCharacterEntity pokeCharacter= new PokeCharacterEntity(null,null,null,null,null);
        PokeSpeciesEntity expected = new PokeSpeciesEntity(COLOR, null, URL, idExt, pokeCharacter);

        final PokeSpecies result = mapper.map(expected);

        assertNotNull(result);
        assertNull(result.getName());
        assertEquals(expected.getColor(),result.getColor());
        assertNull(result.getId());
        assertNotNull(result.getPokeCharacter());
    }

    @Test
    public void mapToDomainSpecies_whenNullPokeCharacter_shouldExpectedValues() {
        PokeSpeciesEntity expected = new PokeSpeciesEntity(COLOR, NAME, URL, idExt, null);

        final PokeSpecies result = mapper.map(expected);

        assertNotNull(result);
        assertNotNull(result.getName());
        assertNotNull(result.getColor());
        assertNull(result.getId());
        assertNull(result.getPokeCharacter());
    }

    @Test
    public void mapToDomainCharacter_whenNullParams_shouldExpectedValues() {
        PokeCharacterEntity expected = new PokeCharacterEntity(null, null, null,null,null);

        final PokeCharacter result = mapper.map(expected);

        assertNotNull(result);
        assertNull(result.getId());
        assertNull(result.getName());
        assertNull(result.getHeight());
        assertNull(result.getWeight());
        assertNull(result.getBaseExperience());
    }

    @Test
    public void mapToDomainCharacter_whenNotNullParams_shouldExpectedValues() {
        PokeSpeciesEntity speciesEntity = new PokeSpeciesEntity(COLOR, NAME, URL, idExt, null);
        PokeCharacterEntity expected = new PokeCharacterEntity(NAME, 3, 4,5,speciesEntity);

        final PokeCharacter result = mapper.map(expected);

        assertNotNull(result);
        assertNull(result.getId());
        assertNotNull(result.getName());
        assertNotNull(result.getHeight());
        assertNotNull(result.getWeight());
        assertNotNull(result.getBaseExperience());
    }

    @Test
    public void mapToDomainCharacter_whenNullName_shouldExpectedValues() {
        PokeSpeciesEntity speciesEntity = new PokeSpeciesEntity(COLOR, NAME, URL, idExt, null);
        PokeCharacterEntity expected = new PokeCharacterEntity(null, 3, 4,5,speciesEntity);

        final PokeCharacter result = mapper.map(expected);

        assertNotNull(result);
        assertNull(result.getId());
        assertNull(result.getName());
        assertNotNull(result.getHeight());
        assertNotNull(result.getWeight());
        assertNotNull(result.getBaseExperience());
    }

    @Test
    public void mapToDomainCharacter_whenNullBaseExperience_shouldExpectedValues() {
        PokeSpeciesEntity speciesEntity = new PokeSpeciesEntity(COLOR, NAME, URL, idExt, null);
        PokeCharacterEntity expected = new PokeCharacterEntity(NAME, null, 4,5,speciesEntity);

        final PokeCharacter result = mapper.map(expected);

        assertNotNull(result);
        assertNull(result.getId());
        assertNotNull(result.getName());
        assertNotNull(result.getHeight());
        assertNotNull(result.getWeight());
        assertNull(result.getBaseExperience());
    }

    @Test
    public void mapToDomainCharacter_whenNullHeight_shouldExpectedValues() {
        PokeSpeciesEntity speciesEntity = new PokeSpeciesEntity(COLOR, NAME, URL, idExt, null);
        PokeCharacterEntity expected = new PokeCharacterEntity(NAME, 43, null,5,speciesEntity);

        final PokeCharacter result = mapper.map(expected);

        assertNotNull(result);
        assertNull(result.getId());
        assertNotNull(result.getName());
        assertNull(result.getHeight());
        assertNotNull(result.getWeight());
        assertNotNull(result.getBaseExperience());
    }

    @Test
    public void mapToDomainCharacter_whenNullWeight_shouldExpectedValues() {
        PokeSpeciesEntity speciesEntity = new PokeSpeciesEntity(COLOR, NAME, URL, idExt, null);
        PokeCharacterEntity expected = new PokeCharacterEntity(NAME, 43, 324,null,speciesEntity);

        final PokeCharacter result = mapper.map(expected);

        assertNotNull(result);
        assertNull(result.getId());
        assertNotNull(result.getName());
        assertNotNull(result.getHeight());
        assertNull(result.getWeight());
        assertNotNull(result.getBaseExperience());
    }
}