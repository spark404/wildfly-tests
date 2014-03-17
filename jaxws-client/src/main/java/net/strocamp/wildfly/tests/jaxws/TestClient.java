package net.strocamp.wildfly.tests.jaxws;

import java.util.Map;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;

public class TestClient {
    @WebServiceRef(wsdlLocation = "http://192.168.56.20:8080/jaxws-tests-0.0.1-SNAPSHOT/PingImpl?wsdl")
    static PingImplService service;

    public static void main(String[] args) {
        TestClient testclient = new TestClient();
        testclient.doTest();
    }

    public void doTest() {
        service = new PingImplService();
        Ping port = service.getPingImplPort();
        Map<String, Object> ctx = ((BindingProvider)port).getRequestContext();
        ctx.put("ws-security.encryption.properties", "client-encryption.properties");
        ctx.put("ws-security.signature.properties", "client-signature.properties");
        ctx.put("ws-security.callback-handler", "net.strocamp.wildfly.tests.jaxws.ClientPasswordCallback");
        String result = port.getHelloWorldAsString("Hugo");
        System.out.println("Result = " + result);
    }
}
