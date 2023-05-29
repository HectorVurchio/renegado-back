package com.elrenegado.back.renegadoback.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RenegadoRestController {
    @Value("${application.name}")
    private String applicationName;
    @Value("${application.version}")
    private String applicationVersion;

    @GetMapping("/")
    public String firstStep(){
        return "Name: "+applicationName + " Version: "+applicationVersion;
    }
}
