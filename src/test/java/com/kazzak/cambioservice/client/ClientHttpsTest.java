package com.kazzak.cambioservice.client;

import com.kazzak.cambioservice.model.Cambio;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ClientHttpsTest {
    @Bean
    public WebClient build(WebClient.Builder builder){
        return builder
                .baseUrl("https://economia.awesomeapi.com.br")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    @Test
    void execute() throws IOException {
        ClientHttps clientHttps = new ClientHttps();
        Cambio cambio = clientHttps.execute(new Cambio());
        assertNotNull(cambio);
    }
}