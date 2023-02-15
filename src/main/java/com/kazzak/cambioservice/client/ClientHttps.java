package com.kazzak.cambioservice.client;

import com.kazzak.cambioservice.model.Cambio;
import com.kazzak.cambioservice.model.Currency;
import com.kazzak.cambioservice.model.ResultCurrency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.io.IOException;
@Component
public class ClientHttps {


    private WebClient webClient;

    public Cambio execute(Cambio cambio) throws IOException {
        if (this.webClient == null) {
            build(WebClient.builder());
        }
        Mono<ResultCurrency> currencyMono = webClient.method(HttpMethod.GET)
                .uri("/json/last/USD-BRL")
                .retrieve()
                .bodyToMono(ResultCurrency.class);
        ResultCurrency c = currencyMono.block();
        return cambio;
    }

    private WebClient build(WebClient.Builder builder){
        return  this.webClient=builder
                .baseUrl("https://economia.awesomeapi.com.br")
                .defaultHeader(HttpHeaders.ACCEPT_CHARSET, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }
}

