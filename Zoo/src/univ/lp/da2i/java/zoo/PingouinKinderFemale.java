package univ.lp.da2i.java.zoo;
/**
 * La classe PingouinKinderFemale reprsente le bebe pingouin femmelle
 * 
 * @author Administrateur
 * 
 * @see Pingouin
 *
 */
public class PingouinKinderFemale extends Pingouin implements Bebe{
	/**
	 * Constructeur de PingouinKinderFemale
	 * 
	 * On utilise le constructeur de la classe mere Pingouin
	 * 
	 * @param name	
	 * 		Le nom du Pingouin
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

	public PingouinKinderFemale(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}
	/**
	 * fait grandir le bebe pingouin
	 */
	@Override
	public void grandir() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * fait grossir le bebe pingouin
	 */
	@Override
	public void grossir() {
		// TODO Auto-generated method stub
		
	}

}
