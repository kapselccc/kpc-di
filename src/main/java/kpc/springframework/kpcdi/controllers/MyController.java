package kpc.springframework.kpcdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("Hello!");
        return "What's up";
    }
}
