package univ.lp.da2i.java.zooModel;

/**
 * La classe pingouin reprsente l'oiseau pingouin
 * 
 * @author Administrateur
 * 
 * @see Oiseau
 *
 */

public abstract class Pingouin extends Oiseau implements AnimalMarinAction{

	/**
	 * Constructeur de Pingouin
	 * 
	 * On utilise le constructeur de la classe mere Oiseau
	 * 
	 * @param name	
	 * 		Le nom du Pingouin
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
	public Pingouin(String name, double poids, double taille, int age, boolean isHungry,
			boolean isSleeping, boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}
	/**
	 * fait voler le pingouin
	 */
	@Override
	public void voler() {
		System.out.println("Je vole comme un pinguin");
	}
	/**
	 * fait manger le pingouin
	 */
	@Override
	public void manger() {
		System.out.println("Je mange comme un pingouin");

	}
	/**
	 * fait emettre un son au pingouin
	 */
	@Override
	public void emettreUnSon() {
		System.out.println("J'émets un son comme un pingouin");
	}
	/**
	 * soigne le pingouin
	 */

	@Override
	public void etreSoigne() {
		System.out.println("Je me fais soigner");
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
		System.out.println("Je change l'état du pingouin");
		this.setSleeping(b);

	}
	/**
	 * fait nager le pingouin
	 */
	@Override
	public void nager() {
		System.out.println("Je nage comme un pingouin");		
	}

}
