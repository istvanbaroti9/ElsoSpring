package com.elsospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

//Forcing explicit package scanning:
//@ComponentScan("com.elsospring","com.spy")
//@SpringBootApplication

//Letting use the Person values from property files
@EnableConfigurationProperties


@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
public class ElsoSpringApplication {

	//If Person has no annotation:
	@Bean
	public Person giveMeAPerson() {
		return new Person("Gyula", "Nagy", 20, "","");
	}

	public static void main(String[] args) {

		ConfigurableApplicationContext ct = SpringApplication.run(ElsoSpringApplication.class, args);

		/*String [] beanArray = ct.getBeanDefinitionNames();
		Arrays.sort(beanArray);

		for (String name : beanArray) {
			System.out.println(name);
		}

		System.out.println(ct.getBean("person"));*/

	}
}
