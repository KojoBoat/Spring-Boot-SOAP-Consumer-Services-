package io.chris.springsoapclient.controller;

import io.chris.springsoapclient.client.CountryClient;
import io.chris.springsoapclient.soap.bindings.GetCountryRequest;
import io.chris.springsoapclient.soap.bindings.GetCountryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @Autowired
    CountryClient countryClient;

    @PostMapping("/country")
    public GetCountryResponse country (@RequestBody GetCountryRequest getCountryRequest){
        return countryClient.getCountry(getCountryRequest);
    }
}
