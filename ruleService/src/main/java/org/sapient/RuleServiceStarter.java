package org.sapient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 
 * @author hgaur2
 *
 */
@SpringBootApplication
public class RuleServiceStarter {

	public static void main(String[] args) {

		SpringApplication.run(RuleServiceStarter.class, args);
	}
}
