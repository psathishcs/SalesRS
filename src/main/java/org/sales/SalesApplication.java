package org.sales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableEurekaClient
@EnableSwagger2
public class SalesApplication {
	public static void main(String[] args){
		SpringApplication.run(SalesApplication.class, args);
	}
	@Bean
	public Docket api() {                
	    return new Docket(DocumentationType.SWAGGER_2)          
	      .select()
	      .apis(RequestHandlerSelectors.any())
	      .build()
	      .apiInfo(apiInfo());
	}
	 
	private ApiInfo apiInfo() {
	    ApiInfo apiInfo = new ApiInfo(
	      "SalesRS",
	      "Sales RESTfull API",
	      "API TOS",
	      "Terms of service",
	      new Contact("Sathish Kumar Parthasarathy", "https://github.com/psathishcs", "p.sathish.cs@gmail.com"),
	      "License of API",
	      "API license URL");
	    return apiInfo;
	}
}
