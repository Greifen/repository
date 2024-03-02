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
	 * man kann nur 1-3 Hoelzer aus Schachtel nehmen, falls noch genügend Hoelzer in der Schachtel vorhanden sind."
	 * @param AnzahlHoelzer
	 */
	public void nehmen(int anzahlHoelzer)
	{
		//TODO wie Fehlerbehandlung ok so?
		
		if (anzahlHoelzer>=1 && anzahlHoelzer<=3) {
			if (schachtel.getAnzahlHoelzer() - anzahlHoelzer>=0) {
				schachtel.setAnzahlHoelzer(schachtel.getAnzahlHoelzer() - anzahlHoelzer);
			}
			else
			{
				System.err.println("So viele Hoelzer sind nicht vorhanden");
			}
				
		}
		else
		{
			System.err.println("Anzahl der Hoelzer ist 1, 2 oder 3.");
		}
	}
}
