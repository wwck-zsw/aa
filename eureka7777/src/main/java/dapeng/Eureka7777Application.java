package dapeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Eureka7777Application {

	public static void main(String[] args) {
		SpringApplication.run(Eureka7777Application.class, args);
	}

}
