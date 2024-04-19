package ite.eurekaserver.gearheadserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class GearheadserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(GearheadserverApplication.class, args);
	}

}
