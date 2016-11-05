package univ.lp.da2i.java.zoo;
/**
 * La classe PoissonRougeMale reprsente les poisson rouges male
 * 
 * @author Administrateur
 * 
 * @see PoissonRouge
 *
 */
public class PoissonRougeMale extends PoissonRouge {

	/**
	 * Constructeur de PoissonRougeMale
	 * 
	 * On utilise le constructeur de la classe mere PoissonRouge
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
	public PoissonRougeMale(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

}
