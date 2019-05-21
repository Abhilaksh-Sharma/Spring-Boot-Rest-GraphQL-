package practice.springboot.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/* Main Class containing main method for execution should always be in parent package
 * Otherwise the controller will not receive any url mapping when client sends a request
*/

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
