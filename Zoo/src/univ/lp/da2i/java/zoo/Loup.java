package univ.lp.da2i.java.zoo;
/**
 * La classe Loup reprsente un loup
 * 
 * @author Administrateur
 * 
 * @see Predateurs
 *
 */

public abstract class Loup extends Predateurs {
	
	/**
	 * force du loup
	 */
	private int force;
	/**
	 * facteur de domination du loup
	 */
	private int facteurDeDomination;
	/**
	 * rang du loup
	 */
	private int rang;
	/**
	 * niveau du loup
	 */
	private int niveau;
	/**
	 * facteur d'impetuosite du loup
	 * 
	 */
	private int facteurImpetuosite;
	/**
	 * la meute a qui apartien le loup
	 */
	private Meute meute;

	/**
	 * Constructeur de Loup
	 * 
	 * @param name	
	 * 		Le nom du loup
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
	 * 
	 */
	public Loup(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

	/**
	 * fait veillir le loup
	 */
	public void vieillir(){
		
	}
	/**
	 * retourne les informations du loup
	 * @return les informations du loup, sous la forme d'une chaine de caracteres
	 */
	@Override
	public String toString() {
		return "Loup [force=" + force + ", facteurDeDomination=" + facteurDeDomination + ", rang=" + rang + ", niveau="
				+ niveau + ", facteurImpetuosite=" + facteurImpetuosite + ", meute=" + meute + "]";
	}

	/**
	 * fait vagabonder le loup
	 */
	@Override
	public void vagabonder() {
		System.out.println("Je vagabonde comme un loup");

	}
	/**
	 * fait manger le loup
	 */
	@Override
	public void manger() {
		System.out.println("Je mange comme un loup");

	}
	/**
	 * fait emettre un son au loup
	 */
	@Override
	public void emettreUnSon() {
		System.out.println("J'emets un son comme un loup");

	}
	/**
	 * soigne le loup
	 */
	@Override
	public void etreSoigne() {
		System.out.println("Je soigne l'animal");
		this.setHealthy(true);
	}
	/**
	 * reveille ou endort le loup	
	 * @param	b
	 * 		endors le loup si vaut "true"
	 * 		reveille le loup si vaut "false"
	 */
	@Override
	public void changeEtat(boolean b) {
		System.out.println("Je change l'etat de l'animal");
		this.setSleeping(b);
	}

}
