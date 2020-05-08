package com.exigent.verifycore.persona.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PersonaDto{

    private String firstName;
    private String lastName;
    private String otherNames;
}
