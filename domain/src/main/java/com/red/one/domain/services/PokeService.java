package com.red.one.domain.services;

import com.red.one.domain.entities.PokeSpecies;
import com.red.one.domain.ports.PokePort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokeService implements IPokeService {

    private final PokePort port;

    public PokeService(final PokePort port) {
        this.port = port;
    }


    @Override
    public Optional<PokeSpecies> getPokemonList(final Long id) {
        return port.findById(id);
    }

    @Override
    public List<PokeSpecies> getTop5ByHeight() {
        return this.port.findTop5ByHeight();
    }

    @Override
    public List<PokeSpecies> getTop5ByWeight() {
        return this.port.findTop5ByWeight();
    }

    @Override
    public List<PokeSpecies> getTop5ByBaseExperience() {
        return this.port.findTop5ByBaseExperience();
    }
}