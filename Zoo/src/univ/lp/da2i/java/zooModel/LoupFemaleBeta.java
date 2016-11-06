package univ.lp.da2i.java.zooModel;
/**
 * La classe LoupFemaleBeta reprsente un loup felle beta
 * 
 * @author Administrateur
 * 
 * @see LoupFemale
 * @see LoupBeta
 *
 */

public class LoupFemaleBeta extends LoupFemale implements LoupBeta {
	
	/**
	 * Constructeur de LoupFemaleBeta
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
	public LoupFemaleBeta(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

}
