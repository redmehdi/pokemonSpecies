package com.red.one.domain.services;

import com.red.one.domain.entities.PokeSpecies;

import java.util.List;
import java.util.Optional;

public interface IPokeService {

    Optional<PokeSpecies> getPokemonList(final Long id);

    List<PokeSpecies> getTop5ByHeight();

    List<PokeSpecies> getTop5ByWeight();

    List<PokeSpecies> getTop5ByBaseExperience();
}
