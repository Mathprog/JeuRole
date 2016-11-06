package univ.lp.da2i.java.zooModel;

/**
 * La classe Baleinefemale reprsente la baleine femelle
 * 
 * @author Administrateur
 * 
 * @see Baleine
 * @see FemaleMammifere
 *
 */
public class BaleineFemale extends Baleine implements FemaleMammifere{

	/**
	 * Constructeur de BaleineFemale
	 * 
	 * On utilise le constructeur de la classe mere Baleine
	 * 
	 * @param name	
	 * 		Le nom de la baleine
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
	public BaleineFemale(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

	/**
	 * fait mettre a bas la baleine
	 */
	@Override
	public void mettreBas() {
		// TODO Auto-generated method stub
		
	}

}
