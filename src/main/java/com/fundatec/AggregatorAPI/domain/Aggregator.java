package com.fundatec.AggregatorAPI.domain;

import javax.validation.constraints.NotNull;

public class Aggregator {
    @NotNull
    private Climate climate;

    @NotNull
    private Zen zen;

    @NotNull
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
