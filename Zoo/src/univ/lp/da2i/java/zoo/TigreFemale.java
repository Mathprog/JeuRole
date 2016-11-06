package univ.lp.da2i.java.zoo;
/**
 * La classe Tigrefemale reprsente les tigres femelle
 * 
 * @author Administrateur
 * 
 * @see Tigres
 * @see FemaleMammifere
 * 
 */

public class TigreFemale extends Tigres implements FemaleMammifere{
	/**
	 * Constructeur de TigreFemale
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

	public TigreFemale(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}
	/**
	 * fait mettre a bas le tigre
	 */

	@Override
	public void mettreBas() {
		// TODO Auto-generated method stub
		
	}

}
