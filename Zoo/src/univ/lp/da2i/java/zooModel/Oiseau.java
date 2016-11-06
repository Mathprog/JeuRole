package univ.lp.da2i.java.zooModel;

/**
 * La classe Oiseau reprsente les oiseau
 * 
 * @author Administrateur
 * 
 * @see Ovipare
 *
 */
public abstract class Oiseau extends Ovipare implements OiseauAction{
	/**
	 * Constructeur de Oiseau
	 * 
	 * On utilise le constructeur de la classe mere Ovipare
	 * 
	 * @param name	
	 * 		Le nom de l'oiseau
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

	public Oiseau(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}
	/**
	 * constructeur par recopie
	 */

	public Oiseau(Oiseau oiseau) {
		super(oiseau);
	}

}
