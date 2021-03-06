package univ.lp.da2i.java.zooModel;
/**
 * La classe Loupfemale reprsente un loup femmelle
 * 
 * @author Administrateur
 * 
 * @see Loup
 * @see Bebe
 * @see FemaleMammifere
 *
 */
public abstract class LoupFemale extends Loup implements FemaleMammifere, Dominable{
	/**
	 * Constructeur de LoupFemale
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

	public LoupFemale(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

	/**
	 * fait mettre a bas
	 */
	@Override
	public void mettreBas() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void dominer(Loup loup){
		
	}

}
