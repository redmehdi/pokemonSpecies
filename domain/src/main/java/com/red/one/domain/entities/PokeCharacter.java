package com.red.one.domain.entities;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
public class PokeCharacter {
    private Long id;
    private String name;
    private Integer baseExperience;
    private Integer height;
    private Integer weight;
}