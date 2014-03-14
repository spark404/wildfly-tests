package net.strocamp.wildfly.tests.jaxws;

import javax.xml.ws.Endpoint;

public class PingPublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/ws/hello", new PingImpl());
    }
}
