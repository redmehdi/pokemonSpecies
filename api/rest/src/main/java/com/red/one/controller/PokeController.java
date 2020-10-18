package com.red.one.controller;

import com.red.one.controller.dtos.PokeSpeciesDto;
import com.red.one.controller.mappers.PokeDtoMapper;
import com.red.one.domain.services.IPokeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pokes")
public class PokeController {

    private final IPokeService service;
    private final PokeDtoMapper mapper;

    public PokeController(final IPokeService service, final PokeDtoMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping(value = "/{id}")
    @ResponseBody
    PokeSpeciesDto getPokemon(@PathVariable("id") Long id) {
        return service.getPokemonList(id).map(mapper::map).get();
    }
}