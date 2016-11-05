package univ.lp.da2i.java.zoo;
/**
 * La classe OursMale reprsente l'ours male
 * 
 * @author Administrateur
 *
 */

public class OursMale extends Ours {
	/**
	 * Constructeur de OursMale
	 * 
	 * On utilise le constructeur de la classe mere ours
	 * 
	 * @param name	
	 * 		Le nom de Ours
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

	public OursMale(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

}
