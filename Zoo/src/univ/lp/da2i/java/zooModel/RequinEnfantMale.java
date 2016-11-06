package univ.lp.da2i.java.zooModel;
/**
 * La classe RequinEnfantmale reprsente les bebe requin male
 * 
 * @author Administrateur
 * 
 * @see Requin
 */
public class RequinEnfantMale extends Requin implements Bebe{
	/**
	 * Constructeur de RequinEnfantMale
	 * 
	 * On utilise le constructeur de la classe mere Requin
	 * 
	 * @param name	
	 * 		Le nom du requin
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

	public RequinEnfantMale(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}
	/**
	 * fait grandir les bebes requin
	 */

	@Override
	public void grandir() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * fait grossir les bebes requin
	 */

	@Override
	public void grossir() {
		// TODO Auto-generated method stub
		
	}

}
