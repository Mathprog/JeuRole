package univ.lp.da2i.java.zoo;
/**
 * La classe LoupMaleOmega reprsente un loup male omega
 * 
 * @author Administrateur
 * 
 * @see LoupMale
 * @see LoupOmega
 *
 */
public class LoupMaleOmega extends LoupMale implements LoupOmega {
	/**
	 * Constructeur de LoupMaleOmega
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

	public LoupMaleOmega(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		this.rang = 1;
		this.niveau =1;
		this.facteurDeDomination = 1;
		this.facteurImpetuosite = 1;
	}

}
