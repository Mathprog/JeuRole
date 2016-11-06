package univ.lp.da2i.java.zoo;
/**
 * La classe LoupMale reprsente un loup male
 * 
 * @author Administrateur
 * 
 * @see Loup
 *
 */
public abstract class LoupMale extends Loup implements Dominable{
	/**
	 * Constructeur de LoupMale
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
	 */

	public LoupMale(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void dominer(Loup loup){
		
	}

}
