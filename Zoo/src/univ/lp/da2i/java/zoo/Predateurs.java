package univ.lp.da2i.java.zoo;
/**
 * La classe Predateurs reprsente les Predateurs
 * 
 * @author Administrateur
 * 
 * @see PredateurAction
 */


public abstract class Predateurs extends Mammifere implements PredateurAction{

	/**
	 * Constructeur de Predateurs
	 * 
	 * On utilise le constructeur de la classe mere Mamifere
	 * 
	 * @param name	
	 * 		Le nom du Requin
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
	public Predateurs(String name, double poids, double taille, int age, boolean isHungry,
			boolean isSleeping, boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

}
