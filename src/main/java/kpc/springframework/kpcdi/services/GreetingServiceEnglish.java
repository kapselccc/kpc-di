package kpc.springframework.kpcdi.services;

public class GreetingServiceEnglish implements GreetingService {
    @Override
    public String getGreeting(){
        return "Hello World!";
    }

}
