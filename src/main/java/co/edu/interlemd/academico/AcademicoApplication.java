package co.edu.interlemd.academico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
public class AcademicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcademicoApplication.class, args);
	}
	@GetMapping("/api/Profesor/Pruena")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello %s!", name);
 }


}
