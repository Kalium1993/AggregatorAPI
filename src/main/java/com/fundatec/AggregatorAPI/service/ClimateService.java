package com.fundatec.AggregatorAPI.service;

import com.fundatec.AggregatorAPI.domain.Climate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClimateService {
    public Climate getClimate() {
        String url = "http://apiadvisor.climatempo.com.br/api/v1/weather/locale/5346/current?token=";
        String token = ""; // insert a valid token

        RestTemplate template = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.set("User-Agent", "PostmanRuntime/7.13.0");
        HttpEntity<String> entity = new HttpEntity<>(headers);
        ResponseEntity<Climate> response = template.exchange(url + token, HttpMethod.GET, entity, Climate.class);

        Climate climate = response.getBody();


        return climate;
    }
}
