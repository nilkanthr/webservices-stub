package com.eminence.webservices.stub;


import com.eminence.webservices.ServiceType;
import org.junit.Test;

public class JiraAcceptanceTest {

    @Test
    public void shouldBeAbleToAddUserAndGetItBack() throws Exception {
        HttpTestServer server = new HttpTestServer(ServiceType.JAMA, 8081);
        server.start();


    }
}
