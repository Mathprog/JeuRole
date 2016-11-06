package univ.lp.da2i.java.zooModel;

/**
 * 
 * @author Administrateur
 *
 * @see Aigle
 */

public abstract class AigleDecorateur extends Aigle {
	
	/**
	 * L'object aigle que l'on va decorer
	 */
	protected Aigle aigle;

	/**
	 * Constructeur de Aigle
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
	 * 
	 */
	public AigleDecorateur(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
	}
	
	/**
	 * constructeur par recopie
	 * On utilise le constructeur de la classe mere Aigle
	 * 
	 * @param aigle
	 * 		L'object aigle que l'on copie
	 * @see Aigle
	 */
	
	public AigleDecorateur(Aigle aigle){
		super(aigle);
		this.aigle = aigle;
	}
	
	/**
	 * declaration abstarite de la fonction recuperant le nombre de point que vaut un aigle
	 */
	public abstract int getPoint();
	
}
