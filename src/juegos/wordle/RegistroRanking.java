package juegos.wordle;

public class RegistroRanking implements Comparable<RegistroRanking> {

	private String nombre;
	private int partidasGanadas;

	public RegistroRanking(String nombre, int partidasGanadas) {
		this.nombre = nombre;
		this.partidasGanadas = partidasGanadas;
	}

	@Override
	public int compareTo(RegistroRanking o) {
		if (this.getPartidasGanadas() > o.getPartidasGanadas())
			return -1;
		if (this.getPartidasGanadas() < o.getPartidasGanadas())
			return 1;
		else
			return 0;
	}

	public int ganarPartida() {
		partidasGanadas++;
		return partidasGanadas;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPartidasGanadas() {
		return partidasGanadas;

	}

	@Override
	public String toString() {
		return nombre + "#" + partidasGanadas;
	}
}
