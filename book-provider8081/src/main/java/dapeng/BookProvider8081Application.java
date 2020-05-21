package dapeng;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@MapperScan("dapeng.mapper")
@EnableDiscoveryClient
@SpringBootApplication
public class BookProvider8081Application {

	public static void main(String[] args) {
		SpringApplication.run(BookProvider8081Application.class, args);
	}

}
