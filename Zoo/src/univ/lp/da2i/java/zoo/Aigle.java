package univ.lp.da2i.java.zoo;

/**
 * La classe aigle repr�sente
 * 
 * @author Administrateur
 * 
 * @see Oiseau
 *
 */

public abstract class Aigle extends Oiseau {
	/**
	 * Constructeur de Aigle
	 * 
	 * On utilise le constructeur de la classe m�re oiseau
	 * 
	 * @param name	
	 * 		Le nom de l'aigle
	 * @param poids
	 * 		son poids
	 * @param taille
	 * 		sa taille
	 * @param age
	 * 		son l'age	
	 * @param isHungry
	 * 		son indicateur de faim	
	 * @param isSleeping
	 * 		son indicateur de sommeil (si il dort)
	 * @param isHealty
	 * 		son idicateur de soin (si il est en train d'etre soign� ou non)
	 * 
	 */
	public Aigle(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

	public Aigle(Aigle aigle) {
		super(aigle);
	}

	
	/**
	 * fait voler l'aigle
	 */
	@Override
	public void voler() {
		System.out.println("Je vole comme un aigle !");
	}
	
	/**
	 * fait manger l'aigle
	 */
	@Override
	public void manger() {
		System.out.println("Je mange comme un aigle");

	}
	/**
	 * fait emettre un son a l'aigle
	 */
	@Override
	public void emettreUnSon() {
		System.out.println("J'émet un son comme un aigle");

	}
	/**
	 * soigne l'aigle
	 */
	@Override
	public void etreSoigne() {
		System.out.println("Je me soigne");
		this.setHealthy(true);
	}
	/**
	 * reveille ou endort l'aigle
	 * @param	b
	 * 		endors l'aigle si vaut "true"
	 * 		reveille l'aigle si vaut "false"
	 */
	@Override
	public void changeEtat(boolean b) {
		System.out.println("Je change d'état");
		this.setSleeping(b);
	}

}
