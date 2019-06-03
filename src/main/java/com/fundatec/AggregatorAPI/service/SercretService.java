package com.fundatec.AggregatorAPI.service;

import com.fundatec.AggregatorAPI.domain.Secret;
import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;

@Service
public class SercretService {

    public Secret getSecret() {
        String url = "https://lp3-secret.herokuapp.com/secreto";
        RestTemplate template = new RestTemplate();

        String username = ""; // insert a valid username
        String password = ""; // insert a valid password
        HttpEntity<Base64> entity = new HttpEntity(createHeaders(username, password));

        ResponseEntity<Secret> response = template.exchange(url, HttpMethod.POST, entity, Secret.class);

        Secret secret = response.getBody();

        return secret; 
    }

    HttpHeaders createHeaders(String username, String password){
        return new HttpHeaders() {{
            String auth = username + ":" + password;
            byte[] encodedAuth = Base64.encodeBase64(
                    auth.getBytes(Charset.forName("US-ASCII")) );
            String authHeader = "Basic " + new String( encodedAuth );
            set( "Authorization", authHeader );
        }};
    }

}
