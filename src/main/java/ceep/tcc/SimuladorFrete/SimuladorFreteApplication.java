package ceep.tcc.SimuladorFrete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("ceep.tcc.models")
@ComponentScan("ceep.tcc.controllers")
@EnableJpaRepositories("ceep.tcc.repository")
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class SimuladorFreteApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SimuladorFreteApplication.class, args);
		//System.out.println(new BCryptPasswordEncoder().encode("123"));
	}

}
