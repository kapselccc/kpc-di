package kpc.springframework.kpcdi.services;

import org.springframework.stereotype.Service;


public class GreetingServiceSpanish implements GreetingService{
    @Override
    public String getGreeting() {
        return "Buenos Dias!";
    }
}
