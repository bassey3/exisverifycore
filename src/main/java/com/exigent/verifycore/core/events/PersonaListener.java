package com.exigent.verifycore.core.events;

import com.exigent.verifycore.persona.models.PersonaDto;
import com.exigent.verifycore.persona.services.PersonaServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonaListener{


    @Autowired
    PersonaServiceImpl personaService;

    //@RabbitListener(queues = "persona")
    public void receivePersona(String message) throws JsonProcessingException{

        System.out.println("Received <" + message + ">");
        ObjectMapper objectmapper = new ObjectMapper();
        PersonaDto persona = objectmapper.readValue(message, PersonaDto.class);
        personaService.savePersona(persona);
    }

}