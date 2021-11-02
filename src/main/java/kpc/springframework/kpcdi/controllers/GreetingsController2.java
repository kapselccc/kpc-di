package kpc.springframework.kpcdi.controllers;

import kpc.springframework.kpcdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingsController2 {
private final GreetingService greetingService;

    public GreetingsController2(@Qualifier("greetingServicePolish") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.getGreeting();
    }
}
