package com.fundatec.AggregatorAPI.service;

import com.fundatec.AggregatorAPI.domain.Zen;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ZenService {

    public Zen getZen() {
        RestTemplate template = new RestTemplate();
        ResponseEntity<String> response = template.getForEntity("https://api.github.com/zen", String.class);

        String message = response.getBody();

        Zen zen = new Zen(message);

        return zen;
    }

}
