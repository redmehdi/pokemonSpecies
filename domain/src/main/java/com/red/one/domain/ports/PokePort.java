package com.red.one.domain.ports;

import com.red.one.domain.entities.PokeSpecies;

import java.util.Optional;

public interface PokePort {

    Optional<PokeSpecies> findById(final Long id);
}
