package univ.lp.da2i.java.zoo;
/**
 * La classe PoissonRouge reprsente les poisson rouges
 * 
 * @author Administrateur
 * 
 * @sess FemaleAutre
 * @see PoissonRouge
 *
 */
public class PoissonRougeFemale extends PoissonRouge implements FemaleAutre{

	/**
	 * Constructeur de PoissonRougeFemale
	 * 
	 * On utilise le constructeur de la classe mere PoissonRouge
	 * 
	 * @param name	
	 * 		Le nom du poisson
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
	public PoissonRougeFemale(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}
	/**
	 * fait pondre le poisson
	 */
	@Override
	public void pondre() {
		// TODO Auto-generated method stub
		
	}

}
