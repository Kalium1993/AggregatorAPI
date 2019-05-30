package com.fundatec.AggregatorAPI.controller;

import java.io.IOException;

import com.fundatec.AggregatorAPI.domain.*;
import com.fundatec.AggregatorAPI.service.ClimateService;
import com.fundatec.AggregatorAPI.service.SercretService;
import com.fundatec.AggregatorAPI.service.ZenService;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/aggregator")
public class AggregatorController {
//    examples
//    @PostMapping
//    public ResponseEntity<?> aggregateInfo() throws ClientProtocolException, IOException {
//
//        HttpClient client = HttpClientBuilder.create().build();
//        HttpGet climaTempo = new HttpGet("http://apiadvisor.climatempo.com.br/api/v1/weather/locale/5346/current?token=");
//        HttpResponse response = client.execute(climaTempo);
//        String body = EntityUtils.toString(response.getEntity());
//
//        System.out.println(body);
//
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//    @PostMapping(path="/template")
//    public ResponseEntity<?> aggregateInfoTemplate() {
//
//        RestTemplate template = new RestTemplate();
//        ResponseEntity<String> response = template.getForEntity("https://api.github.com/zen", String.class);
//
//        pro clima tempo vai precisar header
//        RestTemplate template = new RestTemplate();
//        ResponseEntity<String> response = template.getForEntity("http://apiadvisor.climatempo.com.br/api/v1/weather/locale/5346/current?token=", String.class);
//
//        String zen = response.getBody();
//
//        return response;
//    }

//    @Autowired
//    ClimateService climateService;
//
    @Autowired
    ZenService zenService;
//
//    @Autowired
//    SercretService sercretService;

    @PostMapping
    public ResponseEntity<Aggregator> searchAggregator() {
       // Climate climate = climateService.getClimate();
        Zen zen = zenService.getZen();
       // Secret secret = sercretService.getSecret();

        Aggregator aggregator = new Aggregator();
        //aggregator.setClimate(climate);
        aggregator.setZen(zen);
        //aggregator.setSecret(secret);

        return new ResponseEntity<Aggregator>(aggregator, HttpStatus.OK);
    }

}
