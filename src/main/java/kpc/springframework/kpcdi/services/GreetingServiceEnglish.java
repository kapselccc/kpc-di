package kpc.springframework.kpcdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceEnglish implements GreetingService {
    @Override
    public String getGreeting(){
        return "Hello World!";
    }

}
