package com.red.one.controller.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PokeSpeciesDto {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("color")
    private String color;
    @JsonProperty("name")
    private String name;
    @JsonProperty("poke_character")
    private PokeCharacterDto pokeCharacter;
}