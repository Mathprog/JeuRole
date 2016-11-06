package univ.lp.da2i.java.zooModel;
/**
 * La classe OursonFemale reprsente l'ourson femmelle
 * 
 * @author Administrateur
 * @see Bebe
 */
public class OursonFemale extends Ours implements Bebe{
	/**
	 * Constructeur de Oursonfemale
	 * 
	 * On utilise le constructeur de la classe mere Ours
	 * 
	 * @param name	
	 * 		Le nom de Ourson
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

	public OursonFemale(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}
	/** 
	 * fait grandir l'ourson
	 */
	@Override
	public void grandir() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * fait grossir l'ourson
	 */
	@Override
	public void grossir() {
		// TODO Auto-generated method stub
		
	}

}
