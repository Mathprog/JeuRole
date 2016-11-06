package univ.lp.da2i.java.zooModel;
/**
 * La classe TigreMale reprsente les tigres male
 * 
 * @author Administrateur
 * 
 * @see Tigres
 * 
 */

public class TigreMale extends Tigres {
	/**
	 * Constructeur de TigreMale
	 * 
	 * On utilise le constructeur de la classe mere Tigres
	 * 
	 * @param name	
	 * 		Le nom du Tigre
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

	public TigreMale(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

}
