package dapeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class BookConsumer8080Application {

	public static void main(String[] args) {
		SpringApplication.run(BookConsumer8080Application.class, args);
	}

}
