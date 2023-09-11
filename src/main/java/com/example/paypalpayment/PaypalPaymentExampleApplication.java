package com.example.paypalpayment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PaypalPaymentExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaypalPaymentExampleApplication.class, args);
	}

}
