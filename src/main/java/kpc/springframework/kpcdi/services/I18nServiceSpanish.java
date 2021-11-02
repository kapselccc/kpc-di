package kpc.springframework.kpcdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("I18nService")
public class I18nServiceSpanish implements GreetingService{
    @Override
    public String getGreeting() {
        return "Hola Mundo! - ES";
    }
}
