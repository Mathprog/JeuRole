package univ.lp.da2i.java.zoo;
/**
 * La classe Loup reprsente un loup
 * 
 * @author Administrateur
 * 
 * @see Predateurs
 * @see Meute
 *
 */

public abstract class Loup extends Predateurs {
	
	/**
	 * force du loup
	 */
	protected int force;
	/**
	 * facteur de domination du loup
	 */
	protected int facteurDeDomination;
	/**
	 * rang du loup
	 */
	protected int rang;
	/**
	 * niveau du loup
	 */
	protected int niveau;
	/**
	 * facteur d'impetuosite du loup
	 * 
	 */
	protected int facteurImpetuosite;
	/**
	 * la meute a qui apartient le loup
	 */
	protected Meute meute;

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
		this.age++;
		if(age > 20){
			System.out.println("Le loup meurt de vieillesse ...");
		}
	}
	/**
	 * retourne la force du loup
	 * @return la force du loup, sous la forme d'un entier 
	 */
	public int getForce() {
		return force;
	}
	/**
	 * @param force
	 * 		la nouvelle valeur de force du loup
	 */
	public void setForce(int force) {
		this.force = force;
	}
	/**
	 * retourne le facteurDeDomination du loup
	 * @return le facteurDeDomination du loup, sous la forme d'un entier
	 */
	public int getFacteurDeDomination() {
		return facteurDeDomination;
	}
	/**
	 * @param facteurDeDomination
	 * 		le nouveau facteur de domination du loup
	 */
	public void setFacteurDeDomination(int facteurDeDomination) {
		this.facteurDeDomination = facteurDeDomination;
	}
	/**
	 * retourne le rang du loup
	 * @return le rang du loup, sous la forme d'un entier
	 */
	public int getRang() {
		return rang;
	}
	/**
	 * @param rang
	 * 		le nouveau rang du loup
	 */

	public void setRang(int rang) {
		this.rang = rang;
	}
	/**
	 * retourne le niveau du loup
	 * @return le niveau du loup, sous la forme d'un entier
	 */
	public int getNiveau() {
		return niveau;
	}
	/**
	 * @param niveau
	 * 		le nouveau niveau du loup
	 */

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}
	/**
	 * retourne le facteur d'Impetuosite du loup
	 * @return le facteurImpetuosite du loup, sous la forme d'un entier
	 */
	public int getFacteurImpetuosite() {
		return facteurImpetuosite;
	}
	/**
	 * @param facteurImpetuosite
	 * 		le nouveau facteur d'impetuosite du loup
	 */

	public void setFacteurImpetuosite(int facteurImpetuosite) {
		this.facteurImpetuosite = facteurImpetuosite;
	}
	/**
	 * retourne la meute du loup
	 * @return la meute du loup, sous la forme d'un objet meute
	 */
	public Meute getMeute() {
		return meute;
	}
	/**
	 * @param meute
	 * 		la nouvelle meute du loup
	 */
	public void setMeute(Meute meute) {
		this.meute = meute;
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
	/**
	 * entend un hurlement
	 * @param	hurlement
	 * 		hurlement entendu
	 */
	public void entendreHurlement(String hurlement){
		System.out.println("J'entends un hurlement !! " + hurlement);
	}
	

}
