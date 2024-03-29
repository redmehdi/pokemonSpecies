package com.red.one.repositories;

import com.red.one.entities.PokeSpeciesEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PokeRepository extends CrudRepository<PokeSpeciesEntity, Long> {

    @Query(value = "SELECT * FROM poke_species s inner join poke_character c ON s.id = c.species_id ORDER BY c.height DESC limit 5", nativeQuery = true)
    List<PokeSpeciesEntity> findTop5ByHeight();

    @Query(value = "SELECT * FROM poke_species s inner join poke_character c ON s.id = c.species_id ORDER BY c.weight DESC limit 5", nativeQuery = true)
    List<PokeSpeciesEntity> findTop5ByWeight();

    @Query(value = "SELECT * FROM poke_species s inner join poke_character c ON s.id = c.species_id ORDER BY c.base_experience DESC limit 5", nativeQuery = true)
    List<PokeSpeciesEntity> findTop5ByBaseExperience();
}
