package com.exigent.verifycore.persona.services;

import com.exigent.verifycore.persona.models.Persona;
import com.exigent.verifycore.persona.models.PersonaDto;

public interface PersonaService{

    public void savePersona(PersonaDto persona);

    public void verifyPersona(Persona persona);

    public void runPersonaChecks(Persona persona);

    public Boolean isVerifiedPersona(Persona persona);

    public Persona retrievePersona(String identifier);
}
