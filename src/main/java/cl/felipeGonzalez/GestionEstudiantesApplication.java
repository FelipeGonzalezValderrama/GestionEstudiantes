package cl.felipeGonzalez;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cl.felipeGonzalez.model.Estudiante;
import cl.felipeGonzalez.repository.EstudianteRepository;

@SpringBootApplication
public class GestionEstudiantesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GestionEstudiantesApplication.class, args);
	}

	@Autowired
	private EstudianteRepository repository;

	@Override
	public void run(String... args) throws Exception {
		/*Estudiante estudiante1 = new Estudiante("Robert", "Donadoni", "robert.dorian@hotmail.com");
		repository.save(estudiante1);
		
		Estudiante estudiante2 = new Estudiante("Marcos", "Tudor", "marco.tudor@hotmail.com");
		repository.save(estudiante2);*/

	}

}
