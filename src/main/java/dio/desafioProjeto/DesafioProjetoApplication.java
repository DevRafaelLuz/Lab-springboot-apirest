package dio.desafioProjeto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado  via Spring Initializr.
 * As seguintes dependências foram adicionadas:
 * - Spring Data JPA
 * - Spring Web
 * - MySQL Driver
 * - OpenFeign
 * 
 * @author DevRafaelLuz
 */

@EnableFeignClients
@SpringBootApplication
public class DesafioProjetoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioProjetoApplication.class, args);
	}

}
