package kpc.springframework.kpcdi.services;

import org.springframework.stereotype.Service;

public class GreetingServicePolish implements GreetingService{
    @Override
    public String getGreeting(){
        return "Sieemanooo!";
    }
}
