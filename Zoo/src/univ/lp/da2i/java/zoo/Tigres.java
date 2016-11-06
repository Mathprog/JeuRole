package univ.lp.da2i.java.zoo;
/**
 * La classe Tigre reprsente les animaux tigre
 * 
 * @author Administrateur
 * 
 * @see Predateurs
 * 
 */

public abstract class Tigres extends Predateurs {

	/**
	 * Constructeur de Tigres
	 * 
	 * On utilise le constructeur de la classe mere Predateurs
	 * 
	 * @param name	
	 * 		Le nom du Tigre
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
	public Tigres(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

	/**
	 * fait vagabonder le tigre
	 */
	@Override
	public void vagabonder() {
		System.out.println("Je vagabonde tel un Tigre");

	}
	/**
	 * fait manger le tigre
	 */
	@Override
	public void manger() {
		System.out.println("Je manger comme un Tigre");

	}
	/** 
	 * fait emettre un son au tigre
	 */
	@Override
	public void emettreUnSon() {
		System.out.println("Je rugis");

	}
	/**
	 * soigne le tigre
	 */
	@Override
	public void etreSoigne() {
		System.out.println("Je me soigne");
		this.isHealthy = true;

	}
	/**
	 * reveille ou endort le tigre
	 * @param	b
	 * 		endors le tigre si vaut "true"
	 * 		reveille le tigre si vaut "false"
	 */

	@Override
	public void changeEtat(boolean b) {
		System.out.println("Je change d'état");
		this.isSleeping = b;
	}

}
