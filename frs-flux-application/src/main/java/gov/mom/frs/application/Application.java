package gov.mom.frs.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@ComponentScan(basePackages = { "gov.mom.frs" })
@EnableR2dbcRepositories(basePackages = { "gov.mom.frs.model.repositories" })
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}