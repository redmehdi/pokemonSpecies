package com.red.one.controller.mappers;

import com.red.one.controller.dtos.PokeSpeciesDto;
import com.red.one.domain.entities.PokeSpecies;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface PokeDtoMapper {

    PokeSpeciesDto map(final PokeSpecies domain);
}