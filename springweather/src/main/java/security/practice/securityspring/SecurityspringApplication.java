package security.practice.securityspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SecurityspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityspringApplication.class, args);
	}

}
