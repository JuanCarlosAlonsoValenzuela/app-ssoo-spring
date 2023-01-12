package ssoospring.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAppApplication {


	@RequestMapping("/")
	public String home() {
		return "<h3>El contenedor del examen de convocatoria oficial se está ejecutando correctamente</h3>";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringAppApplication.class, args);
	}

}
