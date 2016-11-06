package univ.lp.da2i.java.zooModel;
/**
 * La classe LoupFemaleAlpha reprsente un loup femmelle alpha
 * 
 * @author Administrateur
 * 
 * @see LoupFemale
 * @see LoupAlpha
 *
 */
public class LoupFemaleAlpha extends LoupFemale implements LoupAlpha{

	/**
	 * Constructeur de LoupFemaleAlpha
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
	public LoupFemaleAlpha(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

}
