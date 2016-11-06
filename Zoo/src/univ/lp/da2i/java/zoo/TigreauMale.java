package univ.lp.da2i.java.zoo;
/**
 * La classe TigreauMale eprsente les tigreau male
 * 
 * @author Administrateur
 * 
 * @see Tigres
 * @see Bebe
 * 
 */
public class TigreauMale extends Tigres implements Bebe{
	/**
	 * Constructeur de TigreauMale
	 * 
	 * On utilise le constructeur de la classe mere Tigres
	 * 
	 * @param name	
	 * 		Le nom du Tigre
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

	public TigreauMale(String name, double poids, double taille, int age, boolean isHungry,
			boolean isSleeping, boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}
	/**
	 * fait grandir les tigreau
	 */
	@Override
	public void grandir() {
		// TODO Auto-generated method stub
		
	}
	/**
	 * fait grossir les tigreau
	 */
	@Override
	public void grossir() {
		// TODO Auto-generated method stub
		
	}

}
