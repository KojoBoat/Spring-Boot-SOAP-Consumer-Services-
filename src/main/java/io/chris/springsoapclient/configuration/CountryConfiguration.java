package io.chris.springsoapclient.configuration;

import io.chris.springsoapclient.client.CountryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
public class CountryConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setPackagesToScan("io.chris.springsoapclient.soap.bindings");
        return marshaller;
    }

//    @Bean
//    public CountryClient countryClient(Jaxb2Marshaller marshaller){
//        CountryClient client = new CountryClient();
//        client.setDefaultUri("http://localhost:8081/ws");
//        client.setMarshaller(marshaller);
//        client.setUnmarshaller(marshaller);
//        return client;
//    }


}
