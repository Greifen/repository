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

	public void setAnzahlHoelzer(int anzahlHoelzer) {
		this.anzahlHoelzer = anzahlHoelzer;
	}
	
	/**
	 * gibt die Anzhal der Hoelzer in der Schachtel in der Konsole aus.
	 */
	public void print() {
		System.out.println("Anzahl Hoelzer: " + anzahlHoelzer);
	}
	
	
	@Override
	public String toString() {
		return "Anzahl Hoelzer: " + anzahlHoelzer;
	}

	/**
	 * 
	 * @param anzahlHoelzer 
	 * @return 1 Fehlermeldung: Es könnnen nur 10 bis 40 Holzer hineingetan werden
	 * 0 erfolgreich befuellt.
	 */
	public int befuelle(int anzahlHoelzer) {
		if(!(anzahlHoelzer>=10 && anzahlHoelzer<=40)) {
			setAnzahlHoelzer(anzahlHoelzer);
			System.err.println("Mit nur 10-40 Hoelzer befüllen.");
			return 1;
		}	
		else {
			this.anzahlHoelzer = anzahlHoelzer;
			return 0;
		}
	}

	
}
