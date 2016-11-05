package univ.lp.da2i.java.zoo;
/**
 * La classe poisson rouge reprsente les poisson rouges
 * 
 * @author Administrateur
 * 
 * @see AnimalMarin
 *
 */
public abstract class PoissonRouge extends AnimalMarin {
	/**
	 * Constructeur de PoissonRouge
	 * 
	 * On utilise le constructeur de la classe mere AnimalMarin
	 * 
	 * @param name	
	 * 		Le nom du poisson
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
	public PoissonRouge(String name, double poids, double taille, int age, boolean isHungry,
			boolean isSleeping, boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

	/**
	 * fait nager le poisson
	 */
	@Override
	public void nager() {
		System.out.println("Je mange comme un poisson rouge");

	}
	/**
	 * fait manger le poisson rouge
	 */

	@Override
	public void manger() {
		System.out.println("Je mange comme un poisson rouge");
	}
	/**
	 * faire emettre un son au poisson
	 */

	@Override
	public void emettreUnSon() {
		System.out.println("J'émets le son d'un poisson ...");
	}
	/**
	 * soigner le poisson
	 */
	@Override
	public void etreSoigne() {
		System.out.println("Je me soigne");
		this.setHealthy(true);
	}
	/**
	 * reveille ou endort le poisson
	 * @param	b
	 * 		endors le poisson si vaut "true"
	 * 		reveille le poisson si vaut "false"
	 */
	@Override
	public void changeEtat(boolean b) {
		System.out.println("Je change d'etat");
		this.setSleeping(b);

	}

}
