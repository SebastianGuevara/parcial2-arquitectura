package co.edu.unisabana.parcial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ParcialApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParcialApplication.class, args);
	}

}
