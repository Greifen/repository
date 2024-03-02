package model;

/**
 * Computer ist dumm und wählt zufällig eine Anzahl von Hoelzern von 1 bis 3 aus.
 */
public class Computerd extends Spieler{

	/**
	 * @param schachtel
	 */
	public Computerd(Schachtel schachtel) {
		super(schachtel);
	}
	
	public void nehmen()
	{
		nehmen((int) (Math.random()*3+1));
	}
}
