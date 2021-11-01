package kpc.springframework.kpcdi.controllers;

import kpc.springframework.kpcdi.services.GreetingService;

public class GreetingsController {
    private final GreetingService greetingService;

    public GreetingsController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
       return greetingService.getGreeting();
    }
}
