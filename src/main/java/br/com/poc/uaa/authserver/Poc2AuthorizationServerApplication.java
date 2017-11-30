package br.com.poc.uaa.authserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
public class Poc2AuthorizationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Poc2AuthorizationServerApplication.class, args);
	}

}
