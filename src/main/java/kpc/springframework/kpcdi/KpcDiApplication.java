package kpc.springframework.kpcdi;

import kpc.springframework.kpcdi.controllers.GreetingsController;
import kpc.springframework.kpcdi.controllers.GreetingsController2;
import kpc.springframework.kpcdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class KpcDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(KpcDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);

		System.out.println("------Greetings controller!");
		GreetingsController greetingsController = (GreetingsController) ctx.getBean("greetingsController");
		System.out.println(greetingsController.getGreeting());

		System.out.println("------Greetings controller 2!");
		GreetingsController2 greetingsController2 = (GreetingsController2) ctx.getBean("greetingsController2");
		System.out.println(greetingsController2.getGreeting());

	}

}
