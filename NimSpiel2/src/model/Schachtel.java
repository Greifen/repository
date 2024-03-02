package model;

/**
 * Hier liegen die Hölzer drin.
 */
public class Schachtel {
	private int anzahlHoelzer;
	
	/**
	 * 
	 */
	public Schachtel() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param anzahlHolz
	 */
	public Schachtel(int anzahlHoelzer) {
		super();
		this.anzahlHoelzer = anzahlHoelzer;
	}
	
	public int getAnzahlHoelzer() {
		return anzahlHoelzer;
	}

	//TODO: am Spielanfang darf nur 10-40 gesetzt werden. Extra eine andere Methode????
	public void setAnzahlHoelzer(int anzahlHoelzer) {
		this.anzahlHoelzer = anzahlHoelzer;
	}

	
}
