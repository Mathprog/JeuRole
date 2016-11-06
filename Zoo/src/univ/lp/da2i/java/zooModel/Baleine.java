package univ.lp.da2i.java.zooModel;

/**
 * La classe Baleine reprsente l'animal marin baleine
 * 
 * @author Administrateur
 * 
 * @see AnimalMarin
 *
 */

public abstract class Baleine extends AnimalMarin implements MammifereAction{

	/**
	 * Constructeur de Baleine
	 * 
	 * On utilise le constructeur de la classe mere AnimalMarin
	 * 
	 * @param name	
	 * 		Le nom de la baleine
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
	public Baleine(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

	@Override
	/**
	 * fait manger la baleine
	 */
	public void manger() {
		System.out.println("Je mange comme une baleine");

	}
	/**
	 * fait emettre un son a la baleine
	 */
	@Override
	public void emettreUnSon() {
		System.out.println("J'emets un son comme une baleine");

	}
	/**
	 * soigne la baleine
	 */
	@Override
	public void etreSoigne() {
		System.out.println("Je me soigne / fais soigner");
		this.setHealthy(true);
	}
	/**
	 * reveille ou endort la baleine
	 * @param	b
	 * 		endors la baleine si vaut "true"
	 * 		reveille la baleine si vaut "false"
	 */
	@Override
	public void changeEtat(boolean b) {
		System.out.println("Je change d'etat");
		this.setSleeping(b);

	}
	/**
	 * fait nager la baleine
	 */
	@Override
	public void nager() {
		System.out.println("Je nage comme une baleine");
		
	}

}
