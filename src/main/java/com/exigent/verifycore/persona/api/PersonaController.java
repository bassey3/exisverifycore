package com.exigent.verifycore.persona.api;

import com.exigent.verifycore.persona.models.PersonaDto;
import com.exigent.verifycore.persona.services.PersonaServiceImpl;
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

    @PostMapping("/create")
    @ResponseBody
    public String createPersona(@RequestBody PersonaDto dto) {
        personaService.savePersona(dto);
        return "ok";
    }

}
