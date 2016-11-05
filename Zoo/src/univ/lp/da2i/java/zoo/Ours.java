package univ.lp.da2i.java.zoo;
/**
 * La classe Ours reprsente le mammifere ours
 * 
 * @author Administrateur
 * 
 * @see Mammifere
 *
 */
public abstract class Ours extends Mammifere {
	/**
	 * Constructeur de Ours
	 * 
	 * On utilise le constructeur de la classe mere Mammifere
	 * 
	 * @param name	
	 * 		Le nom de Ours
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
	 * 		son idicateur de soin (si il est en train d'etre soigne ou non)
	 */

	public Ours(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

	/**
	 * fait manger l'ours
	 */
	@Override
	public void manger() {
		System.out.println("Je mange comme un Ours");
	}
	/**
	 * fait emettre un son a l'ours
	 */
	@Override
	public void emettreUnSon() {
		System.out.println("Je rugis comme un Ours");
	}
	/**
	 * soigne l'ours
	 */
	@Override
	public void etreSoigne() {
		this.setHealthy(true);
	}
	/**
	 * reveille ou endort l'ours
	 * @param	b
	 * 		endors l'ours si vaut "true"
	 * 		reveille l'ours si vaut "false"
	 */
	@Override
	public void changeEtat(boolean b) {
		this.setSleeping(b);
	}

}
