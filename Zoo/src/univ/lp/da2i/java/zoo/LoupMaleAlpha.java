package univ.lp.da2i.java.zoo;
/**
 * La classe LoupMaleAlpha reprsente un loup male alpha
 * 
 * @author Administrateur
 * 
 * @see LoupMale
 * @see LoupAlpha
 *
 */

public class LoupMaleAlpha extends LoupMale implements LoupAlpha{
	/**
	 * Constructeur de LoupMaleAlpha
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

	public LoupMaleAlpha(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

}
