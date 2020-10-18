package com.red.one.repositories;

import com.red.one.entities.PokeSpeciesEntity;
import org.springframework.data.repository.CrudRepository;

public interface PokeRepository extends CrudRepository<PokeSpeciesEntity, Long> {
}
