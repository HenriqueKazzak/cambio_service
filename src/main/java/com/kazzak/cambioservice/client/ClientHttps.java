package com.kazzak.cambioservice.client;

import com.kazzak.cambioservice.model.Cambio;
import com.kazzak.cambioservice.model.Currency;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URL;

@Component
public class ClientHttps {
    //private static final String URL_REQUEST = "https://economia.awesomeapi.com.br";
    private static final String CONTENT_TYPE_VALUE = "application/json";

    private static final String DEFAULT_ENCODING = "UTF-8";

    public Cambio execute(String restURL, Cambio cambio) throws IOException {
        URL url = new URL(restURL);
        RestTemplate restTemplate = new RestTemplateBuilder().build();
        Currency currency = restTemplate.getForObject("https://economia.awesomeapi.com.br/json/last/USD-BRL", Currency.class);
        return cambio;
    }
}
