package net.strocamp.wildfly.tests.jaxws;

import javax.jws.WebService;

import org.jboss.ws.api.annotation.EndpointConfig;
import org.jboss.ws.api.annotation.PolicySets;
import org.jboss.wsf.stack.cxf.extensions.policy.Constants;

@WebService(endpointInterface = "net.strocamp.wildfly.tests.jaxws.Ping")
@PolicySets({Constants.WS_SP_EX224_WSS11_Mutual_Auth_X509_Sign_Encrypt_POLICY_SET})
@EndpointConfig(configFile = "WEB-INF/jaxws-endpoint-config-ping.xml")
public class PingImpl implements Ping {

    @Override
    public String getHelloWorldAsString(String name) {
        return "Hello " + name;
    }

}
