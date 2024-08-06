package com.mobile.companion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.cloud.openfeign.clientconfig.HttpClient5FeignConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.mobile.companion")
@EnableFeignClients
public class CompanionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanionApplication.class, args);
	}

}
