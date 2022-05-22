package juegos.wordle;

import java.util.ArrayList;
import java.util.Collections;

public class Ranking2 {


	private String nombreFichero="./data/wordle/resultados.dat";
	private ArrayList<RegistroRanking> ranking;
	private GestorFicheros g= new GestorFicheros();
	
	public Ranking2() {
		/*
		 * Constructor
		 */
	
	
	this.nombreFichero = nombreFichero;
	ranking = new ArrayList<>();
	ArrayList<String> cadenas =g.getLectorResultados().leerLineas();
	for (int i = 0; i < cadenas.size(); i++) {
	String[] registro = cadenas.get(i).split("#");
	RegistroRanking r = new RegistroRanking(registro[0], Integer.parseInt(registro[1]));
	ranking.add(r);
	}
	
	
	
	}
	
	
	
	
	public void addRegistro(RegistroRanking registro) {
	ranking.add(registro);
	}
	
	public void ganaPartida(String jugador) {
	/**
	* Buscar al usuario en el arraylist (ranking) Si existe, al usuario
	* incrementarle una partida. Si no existe, crear un nuevo usuario (y añadirlo
	* al arraylist).
	*
	*/
	boolean existe = false;
	for (RegistroRanking element : ranking) {
	if (element.getNombre().compareTo(jugador)==0) {
	element.ganarPartida();
	existe = true;
	break;
	}
	}
	if (!existe) {
	RegistroRanking rr = new RegistroRanking(jugador, 1);
	ranking.add(rr);
	}
	ordenarRanking();
	publicarResultados();
	}
	
	
	
	public ArrayList<RegistroRanking> getRanking() {
		/*
		 * Metodo usado para obtener el Ranking 
		 */
	return ranking;
	}
	
	
	
	public void ordenarRanking() {
		/*
		 * Metodo que ordena el ranking por puntuacion
		 */
	Collections.sort(ranking);
	}
	
	
	
	
	public void publicarResultados() {
		/*
		 * Este metodo reseta el fichero publicando los resultados 
		 * actualizados
		 */
	
		g.getEscritorResultados().resetearFichero();
		for (RegistroRanking element : ranking) {
		g.getEscritorResultados().escribirLinea(element.toString());
		}

	}


}
