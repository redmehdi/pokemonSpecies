package com.red.one.repositories;

import com.red.one.domain.entities.PokeSpecies;
import com.red.one.domain.ports.PokePort;
import com.red.one.mappers.PokeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("pokeAdapter")
public class PokeAdapter implements PokePort {

    @Autowired
    private final PokeRepository repository;
    private final PokeMapper mapper;

    public PokeAdapter(final PokeRepository repository, final PokeMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Optional<PokeSpecies> findById(final Long id) {
        return repository.findById(id).map(mapper::map);
    }
}