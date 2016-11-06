package univ.lp.da2i.java.zooModel;

/**
 * L'interface AnimalAction reprsente les comportements commun a tout les animaux
 * 
 * @author Administrateur
 *
 */

public interface AnimalAction {
	/**
	 * permet aux animaux de se nourrir
	 */
	public void manger();
	/**
	 * d'emettre un son
	 */
	public void emettreUnSon();
	/**
	 * de pouvoir etres soignes
	 */
	public void etreSoigne();
	/**
	 * de pouvoir s'endormir ou de se reveiller
	 */
	public void changeEtat(boolean b);
}
