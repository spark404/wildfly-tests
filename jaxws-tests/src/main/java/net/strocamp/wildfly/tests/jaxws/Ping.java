package net.strocamp.wildfly.tests.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface Ping {

    @WebMethod
    String getHelloWorldAsString(String name);

}
