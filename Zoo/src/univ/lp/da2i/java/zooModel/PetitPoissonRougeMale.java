package univ.lp.da2i.java.zooModel;
/**
 * La classe PetitPoissonRougeMale reprsente les bebe poisson rouges male
 * 
 * @author Administrateur
 * 
 * @see PoissonRouge
 * @see Bebe
 *
 */


public class PetitPoissonRougeMale extends PoissonRouge implements Bebe{
	/**
	 * Constructeur de PetitPoissonRougeMale
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

	public PetitPoissonRougeMale(String name, double poids, double taille, int age, boolean isHungry,
			boolean isSleeping, boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

	/**
	 * fait grandir les bebe poisson
	 */
	@Override
	public void grandir() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * fait grossir les bebe poisson
	 */
	@Override
	public void grossir() {
		// TODO Auto-generated method stub
		
	}

}

