package com.pawan.ms.accounts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Pawan Kumar
 *
 */

@SpringBootApplication
@EnableDiscoveryClient
public class AccountsMicroserviceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsMicroserviceServerApplication.class, args);
	}
	
}
