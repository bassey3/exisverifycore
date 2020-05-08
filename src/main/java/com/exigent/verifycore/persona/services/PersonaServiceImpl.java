package com.exigent.verifycore.persona.services;

import com.exigent.verifycore.db.jooq.tables.daos.PersonaDao;

import com.exigent.verifycore.persona.models.Persona;
import com.exigent.verifycore.persona.models.PersonaDto;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    PersonaDao personaDao;

    @Override
    public void savePersona(PersonaDto persona){
        com.exigent.verifycore.db.jooq.tables.pojos.Persona record =
                new com.exigent.verifycore.db.jooq.tables.pojos.Persona()
                .setExternalid(generateId())
                .setFirstname(persona.getFirstName())
                .setLastname(persona.getLastName())
                .setOthername(persona.getOtherNames());
        personaDao.insert(record);
    }

    @Override
    public void verifyPersona(Persona persona){

    }

    @Override
    public void runPersonaChecks(Persona persona){

    }

    @Override
    public Boolean isVerifiedPersona(Persona persona){
        return null;
    }

    @Override
    public Persona retrievePersona(String identifier){
        return null;
    }

    private String generateId() {
        return UUID.randomUUID().toString();
    }
}
