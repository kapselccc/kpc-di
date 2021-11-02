package kpc.springframework.kpcdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
// Profile służy do tego że mamy tak samo nazywające się service a chcemy żeby w zależności od aktywnego
//profilu wstrzyknięte zostały odpowiednie zależności
@Profile("EN")
@Service("I18nService")
public class I18nServiceEnglish implements GreetingService{
    @Override
    public String getGreeting() {
        return "Hello World - EN!";
    }
}
