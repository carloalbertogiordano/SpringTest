package com.HelloEJB.helloEJB;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CheckHTTPResponse {

    @LocalServerPort //Get server port defined in SpringBootTest annotiation
    private int port;

    @Autowired //SimilInject
    private TestRestTemplate testRestTemplate;

    @Test //Test if server is saying hello
    public void shouldPassIfStringMatchesRandom(){
        String response = testRestTemplate.getForObject("http://localhost:"+port+"/", String.class);
        String oracolo = "This is the homepahe";
        assertTrue(response.contains(oracolo));
    }
}
