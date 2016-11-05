package univ.lp.da2i.java.zoo;

/**
 * La classe AigleMale reprsente un aigle male
 * 
 * @author Administrateur
 * 
 * @see Aigle
 *
 */

public class AigleMale extends Aigle {

	/**
	 * Constructeur de AigleMale
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
	public AigleMale(String name, double poids, double taille, int age, boolean isHungry,
			boolean isSleeping, boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

}
