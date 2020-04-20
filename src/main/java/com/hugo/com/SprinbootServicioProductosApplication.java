package com.hugo.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SprinbootServicioProductosApplication extends SpringBootServletInitializer {

	
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(SprinbootServicioProductosApplication .class);
	    }
	public static void main(String[] args) {
		SpringApplication.run(SprinbootServicioProductosApplication.class, args);
	}

}
