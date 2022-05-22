package io;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Clase que lee de un fichero pasado por parámetro.
 * @author guillermo
 *
 */
public class LectorLineas {
	
	private String nombreFichero;
	
	/**
	 * Constructor de la clase.
	 * Lee el fichero y lo muestra
	 */
	public LectorLineas(String nombreFichero) {
		this.nombreFichero=nombreFichero;
	}
	
	/**
	 * Lee el contenido de alumnado.dat y lo vuelva
	 * a una estructura ArrayList<String>
	 * @return
	 */
	public ArrayList<String> leerLineas(){
		ArrayList<String> lineas=new ArrayList<String>();
		//Esta línea contiene la ruta en la que se está ejecutando java
		String rutaActual=System.getProperty("user.dir");
		//Y esta el subdirectorio en el que se encuentra el fichero de datos
		String rutaLectura=rutaActual+nombreFichero;
		//El objeto "ruta" referencia a la ruta completa del fichero
		Path ruta = Paths.get(rutaLectura);
		
		//Este string contiene en cada momento la última linea leída 
		String unaLinea;		
		try {
			//Este "buffer de entrada" es la conexión entre el fichero en el sistema operativo y java
			//Precisamente a través de este buffer se realiza la lectura
			BufferedReader entrada=Files.newBufferedReader(ruta, Charset.forName("ISO-8859-1"));
			//El método readLine() devuelve una línea del fichero y avanza a la siguiente
			unaLinea = entrada.readLine();
			//Mientras se devuelve una línea, sigue pidiendo otra
			while(unaLinea!=null) {
				//Y cada línea se añade al ArrayList (aunque podría realizarse cualquier acción)
				lineas.add(unaLinea);
				//Se lee otra lína
				unaLinea=entrada.readLine();
			}
			//Se cierra el buffer de entrada.
			entrada.close();
		} catch(FileNotFoundException e) { // Se ejecuta si el fichero no existe
			System.err.println("Fichero no encontrado");
		} catch(EOFException eofe) { // Se ejecuta si se intenta leer de un archivo cuyo final se ha alcanzado previamente
			System.out.println("Fichero finalizado");
		} catch(IOException ioe) { //Se ejecuta si ocurre algún otro error durante la lectura.
			System.out.println("Error leyendo el fichero");
		}
		return lineas;
	}

}
