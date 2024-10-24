package pe.edu.cibertec.webservice_manejo_archivos;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.cibertec.webservice_manejo_archivos.service.FileService;

@RequiredArgsConstructor
@Slf4j
@SpringBootApplication
public class WebserviceManejoArchivosApplication implements CommandLineRunner { //CommandLineRunner es ejecutar en linea en la consola

	private final FileService fileService;

	public static void main(String[] args) {
		SpringApplication.run(WebserviceManejoArchivosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("CREANDO ARCHIVO");
		fileService.crearArchivoEscribir();
		log.info("ARCHIVO CREADO");
		log.info("OBTENIENDO ARCHIVO CREADO");
		fileService.abrirLeerArchivos();
		log.info("LEENDO ARCHIVO CREADO");
	}
}
