package univ.lp.da2i.java.zooModel;
/**
 * La classe LouveteauMale reprsente un louveteau male
 * 
 * @author Administrateur
 * 
 * @see Loup
 * @see Bebe
 *
 */
public class LouveteauMale extends Loup implements Bebe{
	/**
	 * Constructeur de LouveteauMale
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
	 */


	public LouveteauMale(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}
	/**
	 * fait grandir le louveteau
	 */
	@Override
	public void grandir() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * fait grossir le louveteau
	 */
	@Override
	public void grossir() {
		// TODO Auto-generated method stub
		
	}

}
