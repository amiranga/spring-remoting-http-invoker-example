package com.amiranga.springremote.client;

import com.amiranga.springremote.BookingException;
import com.amiranga.springremote.CabBookingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

@Configuration
@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) throws BookingException {

		CabBookingService service = SpringApplication
				.run(ClientApplication.class, args)
				.getBean(CabBookingService.class);
		System.out.println(service.bookRide("13 Seagate Blvd, Key Largo, FL 33037"));
    }

	@Bean
	public HttpInvokerProxyFactoryBean invoker() {
		HttpInvokerProxyFactoryBean invoker = new HttpInvokerProxyFactoryBean();
		invoker.setServiceUrl("http://localhost:8080/booking");
		invoker.setServiceInterface(CabBookingService.class);
		return invoker;
	}


}
