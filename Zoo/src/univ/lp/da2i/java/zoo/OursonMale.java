package univ.lp.da2i.java.zoo;

public class OursonMale extends Ours implements Bebe{
	/**
	 * La classe OursonMale reprsente l'ourson male
	 * 
	 * @author Administrateur
	 * @see Bebe
	 */

	public OursonMale(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		/**
		 * Constructeur de OursonMale
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
