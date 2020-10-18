package com.red.one.domain.services;

import com.red.one.domain.entities.PokeSpecies;
import com.red.one.domain.ports.PokePort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PokeService implements IPokeService {

    private final PokePort port;

    public PokeService(final PokePort port) {
        this.port = port;
    }


    @Override
    public Optional<PokeSpecies> getPokemonList(Long id) {
        return port.findById(id);
    }
}
