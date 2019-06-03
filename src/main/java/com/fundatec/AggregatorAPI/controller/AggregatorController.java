package com.fundatec.AggregatorAPI.controller;

import com.fundatec.AggregatorAPI.domain.*;
import com.fundatec.AggregatorAPI.service.ClimateService;
import com.fundatec.AggregatorAPI.service.SercretService;
import com.fundatec.AggregatorAPI.service.ZenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aggregator")
public class AggregatorController {

    @Autowired
    ClimateService climateService;

    @Autowired
    ZenService zenService;

    @Autowired
    SercretService sercretService;

    @PostMapping
    public ResponseEntity<Aggregator> searchAggregator() {
        Climate climate = climateService.getClimate();
        Zen zen = zenService.getZen();
        Secret secret = sercretService.getSecret();

        Aggregator aggregator = new Aggregator();
        aggregator.setClimate(climate);
        aggregator.setZen(zen);
        aggregator.setSecret(secret);

        return new ResponseEntity<Aggregator>(aggregator, HttpStatus.OK);
    }

}
