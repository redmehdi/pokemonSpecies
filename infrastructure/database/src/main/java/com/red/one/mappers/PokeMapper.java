package com.red.one.mappers;

import com.red.one.domain.entities.PokeCharacter;
import com.red.one.domain.entities.PokeSpecies;
import com.red.one.entities.PokeCharacterEntity;
import com.red.one.entities.PokeSpeciesEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface PokeMapper {

    PokeSpecies map(final PokeSpeciesEntity entity);

    PokeCharacter map(final PokeCharacterEntity entity);
}