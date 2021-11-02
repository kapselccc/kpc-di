package kpc.springframework.kpcdi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//Primary oznacza że jak controller nie ma Qualifiera to będzie wybierał tego
@Primary
@Service
public class GreetingServiceEnglish implements GreetingService {
    @Override
    public String getGreeting(){
        return "Hello World!";
    }

}
