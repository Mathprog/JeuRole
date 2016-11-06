package univ.lp.da2i.java.zooModel;

/**
 * La classe Aiglonfemale reprsente un aiglon male
 * 
 * @author Administrateur
 * 
 * @see Aigle
 * @see Bebe
 *
 */

public class AiglonMale extends Aigle implements Bebe{
	
	/**
	 * Constructeur de AiglonMale
	 * 
	 * On utilise le constructeur de la classe mere Aigle
	 * 
	 * @param name	
	 * 		Le nom de l'aigle
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

	public AiglonMale(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

	/**
	 * on fait grandir l'aiglon
	 */
	@Override
	public void grandir() {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * on fait grossir l'aiglon
	 */
	@Override
	public void grossir() {
		// TODO Auto-generated method stub
		
	}

}
