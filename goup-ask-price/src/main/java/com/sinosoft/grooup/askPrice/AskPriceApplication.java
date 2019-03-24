package com.sinosoft.grooup.askPrice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class AskPriceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AskPriceApplication.class, args);
	}

}
