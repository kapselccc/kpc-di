package kpc.springframework.kpcdi.config;

import kpc.springframework.kpcdi.datasource.FakeDataSource;
import kpc.springframework.kpcdi.services.GreetingServicePolish;
import kpc.springframework.kpcdi.services.GreetingServiceSpanish;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:datasource.properties")
@Configuration
public class GreetingServiceConfig {

    @Bean
    public FakeDataSource fakeDataSource(@Value("${kpc.username}") String username,
                                         @Value("${kpc.password}")String password,
                                         @Value("${kpc.jdbcURL}")String jdbcURL){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setPassword(password);
        fakeDataSource.setJdbcURL(jdbcURL);
        fakeDataSource.setUsername(username);
        return fakeDataSource;
    }
    @Bean
    public GreetingServicePolish greetingServicePolish(){
        return new GreetingServicePolish();
    }
    @Bean
    public GreetingServiceSpanish greetingServiceSpanish(){
        return new GreetingServiceSpanish();
    }
}
