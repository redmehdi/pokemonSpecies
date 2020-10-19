package com.red.one.repositories;

import com.red.one.domain.entities.PokeSpecies;
import com.red.one.domain.ports.PokePort;
import com.red.one.mappers.PokeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

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

    public List<PokeSpecies> findTop5ByHeight() {
        return repository.findTop5ByHeight()
                .stream().filter(Objects::nonNull)
                .map(this.mapper::map).collect(Collectors.toList());
    }

    public List<PokeSpecies> findTop5ByWeight() {
        return repository.findTop5ByWeight()
                .stream().filter(Objects::nonNull)
                .map(this.mapper::map).collect(Collectors.toList());
    }

    public List<PokeSpecies> findTop5ByBaseExperience() {
        return repository.findTop5ByBaseExperience()
                .stream().filter(Objects::nonNull)
                .map(this.mapper::map).collect(Collectors.toList());
    }
}