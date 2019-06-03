package com.fundatec.AggregatorAPI.domain;


public class Aggregator {
    private Climate climate;
    private Zen zen;
    private Secret secret;

    public Aggregator() {

    }

    public Climate getClimate() {
        return climate;
    }

    public void setClimate(Climate climate) {
        this.climate = climate;
    }

    public Zen getZen() {
        return zen;
    }

    public void setZen(Zen zen) {
        this.zen = zen;
    }

    public Secret getSecret() {
        return secret;
    }

    public void setSecret(Secret secret) {
        this.secret = secret;
    }
}
