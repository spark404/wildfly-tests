package net.strocamp.wildfly.tests.jaxws;

import javax.jws.WebService;

import org.jboss.ws.api.annotation.EndpointConfig;
import org.jboss.ws.api.annotation.PolicySets;

@WebService(endpointInterface = "net.strocamp.wildfly.tests.jaxws.Ping")
@PolicySets({"WS-SP-EX223_WSS11_Anonymous_X509_Sign_Encrypt"})
@EndpointConfig(configFile = "WEB-INF/jaxws-endpoint-config-ping.xml")
public class PingImpl implements Ping {

    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello " + name;
    }

}
