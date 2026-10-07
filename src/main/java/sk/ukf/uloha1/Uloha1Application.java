package sk.ukf.uloha1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("sk.ukf")
@SpringBootApplication
public class Uloha1Application {

	public static void main(String[] args) {
		SpringApplication.run(Uloha1Application.class, args);
	}

}
