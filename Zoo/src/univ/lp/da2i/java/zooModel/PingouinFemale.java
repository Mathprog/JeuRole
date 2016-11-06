package univ.lp.da2i.java.zooModel;
/**
 * La classe PingouinFemale reprsente l'oiseau pingouin femmelle
 * 
 * @author Administrateur
 * 
 * @see Pingouin
 * @see FemaleMammifere
 *
 */
public class PingouinFemale extends Pingouin implements FemaleMammifere{
	/**
	 * Constructeur de PingouinFemale
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

	public PingouinFemale(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}
	/**
	 * fait mettre a bas le pingouin
	 */
	@Override
	public void mettreBas() {
		// TODO Auto-generated method stub
		
	}

}
