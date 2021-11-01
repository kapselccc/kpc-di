package kpc.springframework.kpcdi.controllers;

import kpc.springframework.kpcdi.services.GreetingServiceEnglish;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingsControllerTest {
    GreetingsController greetingsController;
    @BeforeEach
    void setUp() {
        greetingsController = new GreetingsController(new GreetingServiceEnglish());
    }

    @Test
    void getGreeting() {
        System.out.println(greetingsController.getGreeting());
    }
}