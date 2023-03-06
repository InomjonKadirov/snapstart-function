package uz.deus.tutorials.spring.cloud.aws.snapstartfunction;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SnapstartFunctionApplication {

	public static void main(String[] args) {
		SpringApplication.run(SnapstartFunctionApplication.class, args);
	}

	@Bean
	public Function<String,String> reverse() {
		return (s) -> String.valueOf(new StringBuilder(s).reverse());
	}

}
