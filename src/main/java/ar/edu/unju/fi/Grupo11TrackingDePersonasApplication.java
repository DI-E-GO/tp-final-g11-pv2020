package ar.edu.unju.fi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Grupo11TrackingDePersonasApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Grupo11TrackingDePersonasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Programa Corriendo");
		
	}

}
