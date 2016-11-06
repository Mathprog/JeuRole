package univ.lp.da2i.java.zoo;
/**
 * La classe RequinFemale reprsente les requins femelle
 * 
 * @author Administrateur
 * 
 * @see Requin
 * @see FemaleAutre
 */

public class RequinFemale extends Requin implements FemaleAutre{
	/**
	 * Constructeur de RequinFemale
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

	public RequinFemale(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}
	/**
	 * permet au requin de pondre
	 */

	@Override
	public void pondre() {
		// TODO Auto-generated method stub
		
	}

}
