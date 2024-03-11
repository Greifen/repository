package model;

public class Spieler {
	
	protected Schachtel schachtel;
	protected String name ;
	
	/**
	 * @param schachtel
	 */
	public Spieler(Schachtel schachtel) {
		super();
		this.schachtel = schachtel;
	}
	
	/**
	 * @param schachtel
	 * @param name
	 */
	public Spieler(Schachtel schachtel, String name) {
		super();
		this.schachtel = schachtel;
		this.name = name;
	}


	/**
	 * Man kann nur 1-3 Hoelzer aus Schachtel nehmen, falls noch genügend Hoelzer in der Schachtel vorhanden sind."
	 * @param AnzahlHoelzer
	 * @return 1 Fehlermeldung: Man kann nur 1-3 Hoelzer aus Schachtel nehmen.
	 * 2 Fehlermeldung: Es sind nicht genügend Hoelzer in der Schachtel vorhanden.
	 * 0 Die Holzer wurden erfolgreich aus der Schachtel genommen.
	 */
	public int nehmen(int anzahlHoelzer)
	{	
		if(!(anzahlHoelzer>=1 && anzahlHoelzer<=3)) {
			System.err.println("Anzahl der Hoelzer, die gezogen werden dürfen, ist 1, 2 oder 3.");
			return 1;
		} else if(!(schachtel.getAnzahlHoelzer() - anzahlHoelzer>=0)){
			System.err.println("So viele Hoelzer sind nicht vorhanden.");
			return 2;
		} else {
			schachtel.setAnzahlHoelzer(schachtel.getAnzahlHoelzer() - anzahlHoelzer);
			return 0;
		}
	}
	
	/**
	 * Alternativ Methode mit nehmenWahr 
	 * gibt zurück, ob nehmen erlaubt ist
	 *
	 */
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}
