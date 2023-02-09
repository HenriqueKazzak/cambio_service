package com.kazzak.cambioservice.client;

import com.kazzak.cambioservice.model.Cambio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ClientHttpsTest {

    @Test
    void execute() throws IOException {
        ClientHttps clientHttps = new ClientHttps();
        Cambio cambio = clientHttps.execute("https://economia.awesomeapi.com.br/json/last/USD-BRL",new Cambio());
        assertNotNull(cambio);
    }
}