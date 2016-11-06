package univ.lp.da2i.java.zooModel;
/**
 * La classe Baleineaufemale represente un baleineau femelle
 * 
 * @author Administrateur
 * 
 * @see Baleine
 * @see Bebe
 *
 */
public class BaleineauFemale extends Baleine implements Bebe{
	/**
	 * Constructeur de BaleineauFemale
	 * 
	 * On utilise le constructeur de la classe mere Baleine
	 * 
	 * @param name	
	 * 		Le nom du baleineau
	 * @param poids
	 * 		son poids
	 * @param taille
	 * 		sa taille
	 * @param age
	 * 		son age	
	 * @param isHungry
	 * 		son indicateur de faim	
	 * @param isSleeping
	 * 		son indicateur de sommeil (si il dort)
	 * @param isHealty
	 * 		son idicateur de soin (si il est en train d'etre soigne ou non)
	 */
	
	public BaleineauFemale(String name, double poids, double taille, int age, boolean isHungry,
			boolean isSleeping, boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

	/**
	 * fait grandir le baleineau
	 */
	@Override
	public void grandir() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * fait grossir le baleineau
	 */
	@Override
	public void grossir() {
		// TODO Auto-generated method stub
		
	}

}
