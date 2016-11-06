package univ.lp.da2i.java.zooModel;

import java.util.ArrayList;
/**
 * La classe Aquarium reprsente un enclos d'animaux marin
 * 
 * @author Administrateur
 * 
 * @see AnimalMarin
 * @see Enclos
 *
 */
public class Aquarium <T extends AnimalMarin> extends Enclos<T>{
	/**
	 * Le degre de salinite de l'aquarium
	 */
	public static final String[] SALINITEVALUE = {"ELEVE", "NORMALE", "BASSE"};
	/**
	 * la profondeur de l'aquarium
	 */
	protected double profondeur;
	/**
	 * Le degre de salinite de l'aquarium
	 */
	protected String salinite;
	/**
	 * le prix de l'aquarium
	 */
	private double prix = 1300.0;
	
	/**
	 * Constructeur d'aquarium
	 * 
	 * On utilise en partie le constructeur de la classe mere Enclos
	 * @param nom
	 * 		le nom de l'aquarium
	 * @param superficie
	 * 		la superficie de l'aquarium
	 * @param maxAnimaux
	 *		la capacite maximal de l'aquarium
	 * @param nbDAnimauxPresents
	 * 		le nombre d'animaux present
	 * @param allAnimals
	 * 		un tableau contenant tout les annimaux present dans l'aquarium
	 * @param propreteDegres
	 * 		le degre de proprete de l'aquarium
	 * @param profondeur
	 * 		la profondeur de l'aquarium
	 * @param salinite
	 * 		le degre de salinite de l'aquarium
	 */
	public Aquarium(String nom, double superficie, int maxAnimaux, int nbDAnimauxPresents, ArrayList<T> allAnimals,
			String propreteDegres, double profondeur, String salinite) {
		super(nom, superficie, maxAnimaux, nbDAnimauxPresents, allAnimals, propreteDegres);
		this.profondeur = profondeur;
		this.salinite = salinite;
		}
	
	/**
	 * netoie l'aquarium
	 */

	public void entretenir(){
		System.out.println("Entretien de l'Aquarium");
		this.propreteDegres = Enclos.PROPRETES[0];
	}
	/**
	 * retourne la profondeur de l'aquarium
	 * @return la profondeur de l'aquarium, sous la forme d'un nombre decimal
	 */
	public double getProfondeur() {
		return profondeur;
	}
	/**
	 * @param profondeur
	 * 		la nouvelle profondeur de l'aquarium
	 */

	public void setProfondeur(double profondeur) {
		this.profondeur = profondeur;
	}
	/**
	 * retourne la salinite de l'aquarium
	 * @return la salinite de l'aquarium, sous la forme d'une chaine de caractere
	 */

	public String getSalinite() {
		return salinite;
	}
	/**
	 * @param salinite
	 * 		la nouvelle salinite de l'aquarium
	 */

	public void setSalinite(String salinite) {
		this.salinite = salinite;
	}

}
