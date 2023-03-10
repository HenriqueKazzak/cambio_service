package com.kazzak.cambioservice.controller;

import com.kazzak.cambioservice.model.Cambio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
@RestController
@RequestMapping("cambio-service")
public class CambioController {
    @Autowired
    private Environment environment;

    //http://localhost:8000/cambio-service/5/USD/BRL
    @GetMapping(value = "/{amount}/{from}/{to}")
    public Cambio getCambio(
            @PathVariable("amount")BigDecimal amount,
            @PathVariable("from")String from,
            @PathVariable("to")String to
    ){
        String port = environment.getProperty("local.server.port");
        return new Cambio(from,to,amount.toBigInteger().doubleValue(), BigDecimal.ONE,port);
    }

}
