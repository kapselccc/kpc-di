package kpc.springframework.kpcdi;

import kpc.springframework.kpcdi.controllers.GreetingsController;
import kpc.springframework.kpcdi.controllers.GreetingsController2;
import kpc.springframework.kpcdi.controllers.I18nController;
import kpc.springframework.kpcdi.controllers.MyController;
import kpc.springframework.kpcdi.datasource.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"kpc.springframework.kpcdi","com.springframework.i18n"})
@SpringBootApplication
public class KpcDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(KpcDiApplication.class, args);
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("------My controller!");
		System.out.println(myController.sayHello());

		System.out.println("------Greetings controller!");
		GreetingsController greetingsController = (GreetingsController) ctx.getBean("greetingsController");
		System.out.println(greetingsController.getGreeting());

		System.out.println("------Greetings controller 2!");
		GreetingsController2 greetingsController2 = (GreetingsController2) ctx.getBean("greetingsController2");
		System.out.println(greetingsController2.getGreeting());

		System.out.println("------Greetings I18Controller!");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource.getUsername());
		System.out.println(fakeDataSource.getPassword());
		System.out.println(fakeDataSource.getJdbcURL());

	}

}
