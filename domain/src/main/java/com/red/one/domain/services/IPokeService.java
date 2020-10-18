package com.red.one.domain.services;

import com.red.one.domain.entities.PokeSpecies;

import java.util.Optional;

public interface IPokeService {

    Optional<PokeSpecies> getPokemonList(final Long id);
}
