package univ.lp.da2i.java.zooModel;
/**
 * La classe LoupMaleBeta reprsente un loup male beta
 * 
 * @author Administrateur
 * 
 * @see LoupMale
 * @see LoupBeta
 *
 */
public class LoupMaleBeta extends LoupMale implements LoupBeta {
	/**
	 * Constructeur de LoupMaleBeta
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

	public LoupMaleBeta(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		this.rang = 2;
		this.niveau =1;
		this.facteurDeDomination = 2;
		this.facteurImpetuosite = 2;
	}

}
