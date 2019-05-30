package com.fundatec.AggregatorAPI.domain;


public class Climate {
    private Integer id;
    private String name;
    private String state;
    private String country;
    private ClimateData data;

    public Climate() {
        // empty for future use
    }

    public Climate(Integer id, String name, String state, String country, ClimateData data) {
        this.id = id;
        this.name = name;
        this.state = state;
        this.country = country;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public ClimateData getData() {
        return data;
    }
}
