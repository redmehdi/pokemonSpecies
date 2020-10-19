package com.red.one.controller;

import com.red.one.controller.dtos.PokeSpeciesDto;
import com.red.one.controller.mappers.PokeDtoMapper;
import com.red.one.domain.services.IPokeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pokes")
public class PokeController {

    private final IPokeService service;
    private final PokeDtoMapper mapper;

    public PokeController(final IPokeService service, final PokeDtoMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    /**
     * Retrieves top 5 height pokemon list
     *
     * @return list of pokemon or empty.
     */
    @GetMapping(value = "/height")
    @ResponseBody
    List<PokeSpeciesDto> getTop5ByHeight() {
        return service.getTop5ByHeight().stream().map(this.mapper::map).collect(Collectors.toList());
    }

    /**
     * Retrieves top 5 weight pokemon list
     *
     * @return list of pokemon or empty.
     */
    @GetMapping(value = "/weight")
    @ResponseBody
    List<PokeSpeciesDto> getTop5ByWeight() {
        return service.getTop5ByBaseExperience().stream().map(this.mapper::map).collect(Collectors.toList());
    }

    /**
     * Retrieves top 5 base experience pokemon list
     *
     * @return list of pokemon or empty.
     */
    @GetMapping(value = "/base-experience")
    @ResponseBody
    List<PokeSpeciesDto> getTop5ByBaseExperience() {
        return service.getTop5ByHeight().stream().map(this.mapper::map).collect(Collectors.toList());
    }
}