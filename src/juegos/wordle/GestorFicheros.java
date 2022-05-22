package juegos.wordle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import io.EscritorLineas;
import io.LectorLineas;

/**
 * Clase que contiene todos los métodos para acceder
 * a los ficheros de datos.

 * @author ArcticRec
 *
 */
public class GestorFicheros {
	
	private final String FICHERO_JUGADORES="./data/wordle/jugadores.dat";
	private final String FICHERO_RANKING="./data/wordle/resultados.dat";
	private final String FICHERO_PALABRAS="./data/wordle/palabras5letras.dat";

	private EscritorLineas escritorJugadores;
	private LectorLineas lectorJugadores;

	private EscritorLineas escritorResultados;
	private LectorLineas lectorResultados;

	private EscritorLineas escritorPalabras;
	private LectorLineas lectorPalabras;
	
	public GestorFicheros() {
		escritorJugadores=new EscritorLineas(FICHERO_JUGADORES);
		escritorResultados=new EscritorLineas(FICHERO_RANKING);
		escritorPalabras=new EscritorLineas(FICHERO_PALABRAS);

		lectorJugadores=new LectorLineas(FICHERO_JUGADORES);
		lectorResultados=new LectorLineas(FICHERO_RANKING);
		lectorPalabras=new LectorLineas(FICHERO_PALABRAS);
		
	}
	
	/**
	 * metodo leerJugadores() que devolvera un arrayList de jugadores
	 * @return
	 * @throws Exception 
	 */
	public ArrayList<Jugador> leerJugadores() throws Exception {
		ArrayList<Jugador> jugadores=new ArrayList<Jugador>();
		ArrayList<String> jugadoresString=lectorJugadores.leerLineas();
		for(int i=0;i<jugadoresString.size();i++) {
			String jugadorString=jugadoresString.get(i);
			String[] datosJugador=separarCadena(jugadorString,'#');
			String nombre=datosJugador[0];
			String apellido=datosJugador[1];
			Jugador jugador=new Jugador(nombre, apellido);
			jugadores.add(jugador);
		}
		return jugadores;
	}
	
	/**
	 * metodo para obtener un jugador
	 */
	public Jugador getJugador(String nombre) throws Exception {
		Jugador j=null;
		ArrayList<String> jugadores=lectorJugadores.leerLineas();

		for(int i=0; i<jugadores.size();i++) {
			String jugador=jugadores.get(i);
			String[] datosJugador= separarCadena(jugador,'#');
			if(datosJugador[0].equals(nombre)) {
				j=new Jugador(datosJugador[0],datosJugador[1]);
			}
		}
		
		return j;
	}
	
	/**
	 * Metodos que guardaran un jugador en el fichero Jugadores
	 * @param nombre
	 * @param contraseña
	 */
	public void guardarJugador2(String nombre, String contraseña) {
		
		escritorJugadores.escribirLinea(nombre+'#'+contraseña);
		
	}
	
	public void guardarJugador(Jugador j) {
		
		escritorJugadores.escribirLinea(j.getNombre()+'#'+j.getPassword());
		
	}
	
	
	public String[] getRanking(int pos,ArrayList<String> arrayRanking){
		//ArrayList<String> arrayRanking= lectorResultados.leerLineas();
		String cadena=arrayRanking.get(pos);
		String[] aP=separarCadena(cadena,'#');
		return aP;
	}
	
	public String[] getRankingPos(int pos){
		ArrayList<String> arrayRanking= lectorResultados.leerLineas();
		String cadena=arrayRanking.get(pos);
		String[] aP=separarCadena(cadena,'#');
		return aP;
	}
	
	public ArrayList<String> getRankingCompleto(){
		ArrayList<String> arrayRanking= lectorResultados.leerLineas();
		
		return arrayRanking ;
	}
	
	/*public void actualizarRankingCompleto(ArrayList<String> arrayRanking) {
		ordenarRanking(arrayRanking);
		escritorResultados.resetearFichero();
		for(int i=0;i<arrayRanking.size();i++) {
			escritorResultados.escribirLinea(arrayRanking.get(i));
		}
	}*/
	
	/*public void actualizarRanking() {
		ArrayList<String> arrayRanking= lectorResultados.leerLineas();
		ordenarRanking(arrayRanking);
		escritorResultados.resetearFichero();
		for(int i=0;i<arrayRanking.size();i++) {
			escritorResultados.escribirLinea(arrayRanking.get(i));
		}
	}*/
	
	/*public void ordenarRanking(ArrayList<String> alRanking) {
		boolean ordenado=false;
		do {
			for(int i=0;i<alRanking.size()-1;i++) {
				String[] arrayUno=getRankingPos(i);
				String[] arrayDos=getRankingPos(i);
				if(Integer.parseInt(arrayUno[1])<Integer.parseInt(arrayDos[1])) {
					String aux=alRanking.get(i);
					alRanking.set(i, alRanking.get(i));
					alRanking.set(i+1,aux);
					
					if(i==alRanking.size()-2) {
						for(int j=0;j<alRanking.size()-1;j++) {
							String[] arrayUnoJ=getRankingPos(j);
							String[] arrayDosJ=getRankingPos(j);
							if(Integer.parseInt(arrayUnoJ[1])>Integer.parseInt(arrayDosJ[1])) {
								ordenado=true;
							}
						}
					}
				}
			}
		}while(!ordenado);

	}*/
	
	
	/*public void ordenarRanking(ArrayList<String> alRanking) {
		boolean ordenado=false;
		do {
			for(int i=0; i<alRanking.size();i++) {
				
			}
			
		}while(!ordenado);
		
	}*/
	

	
	public String getPalabra() {
		String x="";
		Random r = new Random();
		int n;
		n= (int)Math.abs(Math.random()*lectorPalabras.leerLineas().size());
		
		x=lectorPalabras.leerLineas().get(n);
		return x;
	}
	
	/**
	 * Debería añadir al fichero de palabras una palabra, comprobando también
	 * que tiene cinco letras y, si no, tratarlo con excepciones.
	 * @param palabra
	 */
	public void guardarPalabra(String p) {
		
		escritorPalabras.escribirLinea(p);
		
	}
	
	public String[] separarCadena(String cadena, char caracter) {
		String[] trozos = cadena.split("#");
		return trozos;
	}
	
	public EscritorLineas getEscritorJugadores() {
		return escritorJugadores;
		}



		public LectorLineas getLectorJugadores() {
		return lectorJugadores;
		}



		public EscritorLineas getEscritorResultados() {
		return escritorResultados;
		}



		public LectorLineas getLectorResultados() {
		return lectorResultados;
		}



		public EscritorLineas getEscritorPalabras() {
		return escritorPalabras;
		}



		public LectorLineas getLectorPalabras() {
		return lectorPalabras;
		}
	
}
