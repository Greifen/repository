package model;

import java.util.Scanner;

/**
 * Misère-Variante mit nur einer Reihe.
 */
public class Spiel {
	private Schachtel schachtel;
	private Spieler spieler;
	private Spieler spieler2;
	private Spieler aktuellerSpieler;
	private int userEingabe;
	
	/**
	 * @param spieler
	 * @param spieler2
	 * @param schachtel
	 */
	public Spiel() {
		super();
		this.schachtel = new Schachtel();
		this.spieler = new Spieler(schachtel);
		this.spieler2 = new Spieler(schachtel);
	}
	
	
	public static void main(String[] args) {
//		new Spiel().starteStatisch();
		new Spiel().starteKonsole();
		
	
	}
	
	public Spieler getAktuellerSpieler() {
		return aktuellerSpieler;
	}
	
	/**
	 * 
	 * @param altSpieler Spieler, welcher gerade den Zug beendet hat.
	 */
	public void waechselAktuellenSpieler(Spieler altSpieler) {
		if(altSpieler.equals(getSpieler())) {
			aktuellerSpieler = getSpieler2();
		}
		else {
			aktuellerSpieler = getSpieler();	
		}
	}
	
	/**
	 * View über Konsoleneingabe
	 */
	private void starteKonsole() {
		Scanner s = new Scanner(System.in);
		System.out.println("NIM-Spiel: Spieler 1 setzt die Anzahl der Hoelzer fest. Anschließend werden abwechselnd 1-3 Hoelzer genommen. Wer das letzte Holz zieht verliert.");
		System.out.println("Spieler1: Wähle eine Zahl von 10-40 zum Befüllen der Schachtel.");
		userEingabe = s.nextInt();
		while (!(userEingabe>=10 && userEingabe<=40))
		{
			System.out.println("Spieler1: Wähle eine Zahl von 10-40 zum Befüllen der Schachtel.");
			userEingabe = s.nextInt();
		}
		getSchachtel().setAnzahlHoelzer(userEingabe);
		
		waechselAktuellenSpieler(getSpieler());
		while (!istBeendet())
		{
			
			do 
			{
				// TODO: wenn fehlermeldung dann nicht nochmal den Text anzeigen.
				if (getAktuellerSpieler().equals(getSpieler()))
				{
					System.out.println("Spieler 1: Wähle eine Zahl von 1-3 zum Nehmen aus der Schachtel, falls noch genügend Hoelzer vorhanden sind.");
				}
				else
				{
					System.out.println("Spieler 2: Wähle eine Zahl von 1-3 zum Nehmen aus der Schachtel, falls noch genügend Hoelzer vorhanden sind.");
				}
				userEingabe = s.nextInt();
			} while (getAktuellerSpieler().nehmen(userEingabe)!=0);
			waechselAktuellenSpieler(getAktuellerSpieler());
			System.out.println("Anzahl Hoelzer: " +getSchachtel().getAnzahlHoelzer());
		}
		
		if (getAktuellerSpieler().equals(getSpieler()))
		{
			System.out.println("Spieler 1 hat gewonnen.");
		}
		else
		{
			System.out.println("Spieler 2 hat gewonnen.");
		}
	}

	/**
	 * Testrun statisch ohne View
	 */
	private void starteStatisch() {
		getSchachtel().setAnzahlHoelzer(4);
		
		System.out.println("Anzahl Hoelzer: " +getSchachtel().getAnzahlHoelzer());
		
		getSpieler2().nehmen(3);
		
		System.out.println("Nachdem Spieler1 3 Hoelzer nimmt " +getSchachtel().getAnzahlHoelzer());
		if(istBeendet()) {
			System.out.println("Spiel ist zu Ende.");
		}	
		
		getSpieler().nehmen(1);
		
		System.out.println("Nachdem Spieler2 1 Hoelzer nimmt " +getSchachtel().getAnzahlHoelzer());
		if(istBeendet()) {
			System.out.println("Spiel ist zu Ende.");
		}
		
		getSpieler2().nehmen(3);
		
		System.out.println("Nachdem Spieler1 3 Hoelzer nimmt " +getSchachtel().getAnzahlHoelzer());
	}

	public Spieler getSpieler() {
		return spieler;
	}

	public Spieler getSpieler2() {
		return spieler2;
	}

	public Schachtel getSchachtel() {
		return schachtel;
	}
	
	public boolean istBeendet() {
		return getSchachtel().getAnzahlHoelzer() == 0;
	}
}
