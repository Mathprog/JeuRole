package univ.lp.da2i.java.zoo;
/**
 * La classe Ovipare reprsente les animaux ovipare
 * 
 * @author Administrateur
 * 
 * @see Animal
 *
 */

public abstract class Ovipare extends Animal {
	/**
	 * Constructeur de Ovipare
	 * 
	 * On utilise le constructeur de la classe mere Animal
	 * 
	 * @param name	
	 * 		Le nom de Ovipare
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
	public Ovipare(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy, 10);
		// TODO Auto-generated constructor stub
	}
	/**
	 * Constructeur par recopie
	 * @param ovipare
	 * 		l'ovipare que l'on copie
	 * @see Ovipare
	 */
	public Ovipare(Ovipare ovipare) {
		super(ovipare);
	}
}
