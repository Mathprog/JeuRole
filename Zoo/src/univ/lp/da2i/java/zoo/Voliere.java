package univ.lp.da2i.java.zoo;

import java.util.ArrayList;
/**
 * La classe Voliere reprsente un enclos d'oiseau
 * 
 * @author Administrateur
 * 
 * @see Oiseau
 * @see Enclos
 *
 */
public class Voliere <T extends Oiseau> extends Enclos<T>{
	
	/**
	 * hauteur de la voliere
	 */
	protected int hauteur;
	/**
	 * prix de la voliere
	 */
	private double prix = 1100.0;
	/**
	 * Constructeur de voliere
	 * 
	 * On utilise en partie le constructeur de la classe mere Enclos
	 * @param nom
	 * 		le nom de voliere
	 * @param superficie
	 * 		la superficie de voliere
	 * @param maxAnimaux
	 *		la capacite maximal de voliere
	 * @param nbDAnimauxPresents
	 * 		le nombre d'animaux present
	 * @param allAnimals
	 * 		un tableau contenant tout les annimaux present dans voliere
	 * @param propreteDegres
	 * 		le degre de proprete de voliere
	 * @param hauteur
	 * 		la hauteur de la voliere
	 */
	public Voliere(String nom, double superficie, int maxAnimaux, int nbDAnimauxPresents, ArrayList<T> allAnimals,
			String propreteDegres, int hauteur) {
		super(nom, superficie, maxAnimaux, nbDAnimauxPresents, allAnimals, propreteDegres);
		this.hauteur = hauteur;
		}
	/**
	 * entretient de la voliere
	 */
	
	public void entretienVoliere(){
		this.entretenir();
		System.out.println("Verification du toit de la cage");
	}
	/**
	 * retourne la hauteur de la voliere
	 * @return la hauteur de la voliere, sous la forme d'un entier positif
	 */
	public int getHauteur() {
		return hauteur;
	}
	/**
	 * @param hauteur
	 * 		la nouvelle hauteur de la voliere
	 */

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

}
