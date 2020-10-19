package com.red.one.domain.entities;

import lombok.*;

import java.time.LocalTime;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
public class PokeSpecies {
    private Long id;
    private String color;
    private String name;
    private PokeCharacter pokeCharacter;
}