package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mercadopago.MercadoPagoConfig;

@SpringBootApplication
public class MedioPagoClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MedioPagoClienteApplication.class, args);
		MercadoPagoConfig.setAccessToken("TEST-1016222742358593-062310-6eaddcc1b5893e037fa1281c4a6abe16-683211147");
	}

}
