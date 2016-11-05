package univ.lp.da2i.java.zoo;

/**
 * La classe Animalmarin reprsente un animal marin
 * 
 * @author Administrateur
 * 
 * @see Animal
 *
 */

public abstract class AnimalMarin extends Animal implements AnimalMarinAction{
	/**
	 * Constructeur de AnimalMarin
	 * 
	 * On utilise le constructeur de la classe mere Animal
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
	 * @param point
	 * 		sa valeur en point
	 * 
	 */
	public AnimalMarin(String name, double poids, double taille, int age, boolean isHungry,
			boolean isSleeping, boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy, 10);
		// TODO Auto-generated constructor stub
	}

}
