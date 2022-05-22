package io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class EscritorLineas {
	
	private String nombreFichero;
	
	public EscritorLineas(String nombreFichero) {
		this.nombreFichero=nombreFichero;
	}
	
	public void resetearFichero() {
		String rutaActual=System.getProperty("user.dir");
		String rutaEscritura=rutaActual+nombreFichero;
		Path ruta = Paths.get(rutaEscritura);
		ruta.toFile().delete();
		try {
			ruta.toFile().createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void escribirLinea(String linea) {
		//Esta línea contiene la ruta en la que se está ejecutando java
		String rutaActual=System.getProperty("user.dir");
		//Y esta el subdirectorio en el que se encuentra el fichero de datos
		String rutaEscritura=rutaActual+nombreFichero;
		//El objeto "ruta" referencia a la ruta completa del fichero
		Path ruta = Paths.get(rutaEscritura);
		try {
			BufferedWriter bw=Files.newBufferedWriter(ruta,
					Charset.forName("ISO-8859-1"),
					StandardOpenOption.APPEND, StandardOpenOption.WRITE);
			bw.write(linea);
			bw.newLine();
			bw.close();
		} catch(Exception e) {
			System.err.println(e);
		}
	}
	

}
