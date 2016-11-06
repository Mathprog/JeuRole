package univ.lp.da2i.java.zoo;
/**
 * La classe Requin reprsente les animaux marin requin
 * 
 * @author Administrateur
 * 
 * @see AnimalMarin
 */

public abstract class Requin extends AnimalMarin {
	/**
	 * Constructeur de Requin
	 * 
	 * On utilise le constructeur de la classe mere AnimalMarin
	 * 
	 * @param name	
	 * 		Le nom du Requin
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

	public Requin(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

	/**
	 * fait nager le requin
	 */
	@Override
	public void nager() {
		System.out.println("Je nage !");
	}
	/**
	 * fait manger le requin
	 */
	@Override
	public void manger() {
		System.out.println("Je mange comme un requin");

	}
	/**
	 * fait emettre un son au requin
	 */
	@Override
	public void emettreUnSon() {
		System.out.println("J'emmets un son comme un requin");

	}
	/**
	 * soigne le requin
	 */
	@Override
	public void etreSoigne() {
		System.out.println("Je me soigne");
		this.setHealthy(true);
	}
	/**
	 * reveille ou endort le requin
	 * @param	b
	 * 		endors le requin si vaut "true"
	 * 		reveille le requin si vaut "false"
	 */
	@Override
	public void changeEtat(boolean b) {
		System.out.println("Je change d'etat");
		this.setSleeping(b);
	}

}
