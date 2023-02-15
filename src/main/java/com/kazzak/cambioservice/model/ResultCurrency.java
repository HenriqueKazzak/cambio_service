 package com.kazzak.cambioservice.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultCurrency {
    @JsonProperty("USDBRL")
    private Currency usdbrl;

    public Currency getUsdbrl() {

        return usdbrl;
    }

    public void setUsdbrl(Currency usdbrl) {
        this.usdbrl = usdbrl;
    }
}
