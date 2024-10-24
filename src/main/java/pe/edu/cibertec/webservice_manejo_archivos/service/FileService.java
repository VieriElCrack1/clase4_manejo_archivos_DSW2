package pe.edu.cibertec.webservice_manejo_archivos.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.*;

@Slf4j
@Service
public class FileService {

    private final String FILEPATH = "data_prueba.txt";

    public void crearArchivoEscribir() throws IOException {
        try(FileOutputStream fileOutputStream = new FileOutputStream(FILEPATH)) { //crear el arcivo
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream); //empezar a escribir
            dataOutputStream.writeUTF("Desarrollo de servicios web 2");
        }
    }

    public void abrirLeerArchivos() throws IOException {
        try(FileInputStream fileInputStream = new FileInputStream(FILEPATH)) { //obtener el archivo
            DataInputStream dataInputStream = new DataInputStream(fileInputStream); //leer archivo
            String nombreCurso = dataInputStream.readUTF();
            log.info(nombreCurso);
        }
    }

}
