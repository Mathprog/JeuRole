package univ.lp.da2i.java.zooModel;
/**
 * La classe LoupFemaleOmega reprsente un loup femelle omega
 * 
 * @author Administrateur
 * 
 * @see LoupFemale
 * @see LoupOmega
 *
 */

public class LoupFemaleOmega extends LoupFemale implements LoupOmega {
	/**
	 * Constructeur de LoupFemaleOmega
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

	public LoupFemaleOmega(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

}
