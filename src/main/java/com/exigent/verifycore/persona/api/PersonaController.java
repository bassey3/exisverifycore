package com.exigent.verifycore.persona.api;

import com.exigent.verifycore.persona.models.PersonaDto;
import com.exigent.verifycore.persona.services.PersonaServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/persona")
public class PersonaController{

    @Autowired
    PersonaServiceImpl personaService;
    @Autowired
    RabbitTemplate rabbitTemplate;

    @PostMapping("/create")
    @ResponseBody
    public String createPersona(@RequestBody PersonaDto dto) throws JsonProcessingException{
        //personaService.savePersona(dto);
        ObjectMapper objectMapper = new ObjectMapper();
        var message = objectMapper.writeValueAsString(dto);
        rabbitTemplate.convertAndSend("persona", message);
        return "ok";
    }

}
