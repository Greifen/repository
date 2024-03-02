package model;

public class Spieler {
	
	protected Schachtel schachtel;
	
	/**
	 * @param schachtel
	 */
	public Spieler(Schachtel schachtel) {
		super();
		this.schachtel = schachtel;
	}

	/**
	 * Man kann nur 1-3 Hoelzer aus Schachtel nehmen, falls noch genügend Hoelzer in der Schachtel vorhanden sind."
	 * @param AnzahlHoelzer
	 * @return Fehlermeldung: Man kann nur 1-3 Hoelzer aus Schachtel nehmen.
	 * 2 Fehlermeldung: Es sind nicht genügend Hoelzer in der Schachtel vorhanden.
	 * 0 Die Holzer wurden erfolgreich aus der Schachtel genommen.
	 */
	public int nehmen(int anzahlHoelzer)
	{	
		if(!(anzahlHoelzer>=1 && anzahlHoelzer<=3)) {
			System.err.println("Anzahl der Hoelzer ist 1, 2 oder 3.");
			return 1;
		} else if(!(schachtel.getAnzahlHoelzer() - anzahlHoelzer>=0)){
			System.err.println("So viele Hoelzer sind nicht vorhanden.");
			return 2;
		} else {
			schachtel.setAnzahlHoelzer(schachtel.getAnzahlHoelzer() - anzahlHoelzer);
			return 0;
		}
	}
}
