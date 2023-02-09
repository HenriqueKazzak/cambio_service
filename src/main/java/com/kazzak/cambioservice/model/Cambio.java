package com.kazzak.cambioservice.model;

import com.fasterxml.jackson.annotation.JsonSetter;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class Cambio implements Serializable {

    private static final long serialVersionID = 1L;
    private String from;
    private String to;
    private Double conversionFactor;
    private BigDecimal convertedValue;
    private String environment;

    public Cambio() {
    }

    public Cambio( String from, String to, Double conversionFactor, BigDecimal convertedValue, String environment) {
        this.from = from;
        this.to = to;
        this.conversionFactor = conversionFactor;
        this.convertedValue = convertedValue;
        this.environment = environment;
    }

    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }

    public Double getConversionFactor() {
        return conversionFactor;
    }

    public void setConversionFactor(Double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public BigDecimal getConvertedValue() {
        return convertedValue;
    }
    public void setConvertedValue(BigDecimal convertedValue) {
        this.convertedValue = convertedValue;
    }

    public String getEnvironment() {
        return environment;
    }
    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cambio cambio = (Cambio) o;
        return  Objects.equals(getFrom(), cambio.getFrom()) && Objects.equals(getTo(), cambio.getTo()) && Objects.equals(getConversionFactor(), cambio.getConversionFactor()) && Objects.equals(getConvertedValue(), cambio.getConvertedValue()) && Objects.equals(getEnvironment(), cambio.getEnvironment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFrom(), getTo(), getConversionFactor(), getConvertedValue(), getEnvironment());
    }

    @Override
    public String toString() {
        return "Cambio{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", conversionFactor=" + conversionFactor +
                ", convertedValue=" + convertedValue +
                ", environment='" + environment + '\'' +
                '}';
    }
}
