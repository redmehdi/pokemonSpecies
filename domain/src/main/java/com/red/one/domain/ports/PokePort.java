package com.red.one.domain.ports;

import com.red.one.domain.entities.PokeSpecies;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface PokePort {

    Optional<PokeSpecies> findById(final Long id);

    List<PokeSpecies> findTop5ByHeight();

    List<PokeSpecies> findTop5ByWeight();

    List<PokeSpecies> findTop5ByBaseExperience();
}
