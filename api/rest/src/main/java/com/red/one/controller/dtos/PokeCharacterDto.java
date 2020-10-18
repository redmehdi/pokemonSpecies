package com.red.one.controller.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PokeCharacterDto {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("base-experience")
    private Integer baseExperience;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("weight")
    private Integer weight;
}