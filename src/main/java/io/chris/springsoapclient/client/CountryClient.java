package io.chris.springsoapclient.client;

import io.chris.springsoapclient.soap.bindings.GetCountryRequest;
import io.chris.springsoapclient.soap.bindings.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class CountryClient  {
    @Autowired
    private Jaxb2Marshaller jaxb2Marshaller;

    private WebServiceTemplate webServiceTemplate;

    public GetCountryResponse getCountry(GetCountryRequest request){
        webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (GetCountryResponse)webServiceTemplate.marshalSendAndReceive("http://localhost:8080/ws",request);
    }
     }

