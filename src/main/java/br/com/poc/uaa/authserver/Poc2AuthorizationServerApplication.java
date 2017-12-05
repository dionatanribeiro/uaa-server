package br.com.poc.uaa.authserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Poc2AuthorizationServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Poc2AuthorizationServerApplication.class, args);
	}

}
