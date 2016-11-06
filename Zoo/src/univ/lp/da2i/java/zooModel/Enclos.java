package univ.lp.da2i.java.zooModel;

import java.util.ArrayList;

/**
 * La classe Enclos reprsente un enclos d'animaux
 * 
 * @author Administrateur
 * 
 * @see Animal
 *
 */

public class Enclos <T extends Animal> {
	
	public static final String[] PROPRETES= {"NICKEL", "PASSABLE", "SALE"};
	/**
	 * le nom de l'animal
	 */
	protected String nom;
	/**
	 * la superficie de l'enclos
	 */
	protected double superficie;
	/**
	 * le nombre maximal d'animal dans l'enclos
	 */
	protected int maxAnimaux;
	/**
	 * le nombre d'annimaux present
	 */
	protected int nbDAnimauxPresents;
	/**
	 * une liste contenant tout les annimaux present
	 */
	protected ArrayList<T> allAnimals;
	/**
	 * une liste contenant tout les bebe present
	 */
	protected ArrayList<Bebe> allBebeAnimals;
	/**
	 * degre de proprete de l'enclos
	 */
	protected String propreteDegres;
	/**
	 * prix de l'enclos
	 */
	private double prix = 800.0;
	
	/**
	 * Constructeur d'enclos
	 * @param nom
	 * 		le nom de l'enclos
	 * @param superficie
	 * 		la superficie de l'enclos
	 * @param maxAnimaux
	 *		la capacite maximal de l'enclos
	 * @param nbDAnimauxPresents
	 * 		le nombre d'animaux present
	 * @param allAnimals
	 * 		un tableau contenant tout les annimaux present dans l'enclos
	 * @param propreteDegres
	 * 		le degre de proprete de l'enclos
	 */
	
	public Enclos(String nom, double superficie, int maxAnimaux, int nbDAnimauxPresents, ArrayList<T> allAnimals,
			String propreteDegres) {
		super();
		this.nom = nom;
		this.superficie = superficie;
		this.maxAnimaux = maxAnimaux;
		this.nbDAnimauxPresents = nbDAnimauxPresents;
		this.allAnimals = allAnimals;
		this.propreteDegres = propreteDegres;
	}

	@Override
	public String toString() {
		return "Enclos [nom=" + nom + ", superficie=" + superficie + ", maxAnimaux=" + maxAnimaux
				+ ", nbDAnimauxPresents=" + nbDAnimauxPresents + ", allAnimals=" + allAnimals + ", allBebeAnimals="
				+ allBebeAnimals + ", propreteDegres=" + propreteDegres + ", prix=" + prix + "]";
	}
	
	/**
	 * ajoute un animal a l'enclos si il n'est pas deja plein
	 * 
	 * @param newAnimal
	 * 		l'aniaml que l'on veut rajouter a l'enclos
	 */
	
	public void addAnimal(T newAnimal){
		if(this.nbDAnimauxPresents < 10){
			this.allAnimals.add(newAnimal);
			this.nbDAnimauxPresents++;
		} else {
			System.out.println("Vous ne pouvez plus ajouter d'animaux. Veuillez construire un nouvel enclos.");
		}
		
	}
	
	/**
	 * enleve un animal a l'enclos si il n'est pas vide
	 * 
	 * @param animal
	 * 		l'animal que l'on veut enelever a l'enclos
	 */
	
	public void deleteAnimal(T animal){
		if(this.allAnimals.contains(animal)){
			this.allAnimals.remove(animal);
			this.nbDAnimauxPresents--;
		} else {
			System.out.println("Animal non present dans l'enclo. ");
		}
		
	}
	
	/**
	 * ajoute un bebe a l'enclos
	 * 
	 * @param newAnimal
	 * 		le bebe que l'on veut rajouter a l'enclos
	 */
	
	public void addBebeAnimal(Bebe newAnimal){
		this.allBebeAnimals.add(newAnimal);
	}
	
	/**
	 * enleve un bebe a l'enclos si il n'est pas deja vide
	 * 
	 * @param animal
	 * 		l'aniaml que l'on veut rajouter a l'enclos
	 */
	
	public void deleteBebeAnimal(Bebe animal){
		if(this.allBebeAnimals.contains(animal)){
			this.allBebeAnimals.remove(animal);
		} else {
			System.out.println("Bebe Animal non présent dans l'enclo. ");
		}
	}
	/**
	 * nouris les annimaux de l'enclos
	 */
	public void nourrirAnimaux(){
		for(Animal animal : this.allAnimals){
			animal.setHungry(false);
		}
	}
	/**
	 * entretien l'enclos
	 */
	public void entretenir(){
		System.out.println("J'entretien l'enclo standard");
		this.propreteDegres = Enclos.PROPRETES[0];
	}
	/**
	 * retourne le nom de l'enclos
	 * @return le nom de l'enclos, sous la forme d'une chaine de caracteres
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param name
	 * 		le nouveau nom de l'enclos
	 */

	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * retourne la superficie l'enclos
	 * @return le nom de l'enclos, sous la forme d'un decimal
	 */

	public double getSuperficie() {
		return superficie;
	}
	/**
	 * @param superficie
	 * 		la nouvelle superficie de l'enclos
	 */
	
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}
	/**
	 * retourne le nombre d'animaux maximum de l'enclos
	 * @return le nombre d'animaux maximum dans l'enclos, sous la forme d'un entier positif
	 */
	public int getMaxAnimaux() {
		return maxAnimaux;
	}
	/**
	 * @param maxAnimaux
	 * 		le nouveaux nombre d'animaux maximum dans l'enclos
	 */

	public void setMaxAnimaux(int maxAnimaux) {
		this.maxAnimaux = maxAnimaux;
	}
	/**
	 * retourne le nombre d'annimaux present
	 * @return le nombre d'animaux present, sous la forme dd'un entier positif
	 */
	public int getNbDAnimauxPresents() {
		return nbDAnimauxPresents;
	}
	/**
	 * @param nbDAnimauxPresents
	 * 		le nouveau nombre d'animaux present dans l'enclos
	 */

	public void setNbDAnimauxPresents(int nbDAnimauxPresents) {
		this.nbDAnimauxPresents = nbDAnimauxPresents;
	}
	/**
	 * retourne tout les annimaux present
	 * @return les animaux present sous la forme d'une liste
	 */
	public ArrayList<T> getAllAnimals() {
		return allAnimals;
	}
	/**
	 * @param allAnimals
	 * 		La nouvelle liste des animaux present dans l'enclos
	 */
	public void setAllAnimals(ArrayList<T> allAnimals) {
		this.allAnimals = allAnimals;
	}
	/**
	 * retourne le degre de proprete de l'enclos
	 * @return le degre de proprete de l'enclos, sous la forme d'une chaine de caracteres
	 */
	public String getPropreteDegres() {
		return propreteDegres;
	}
	
	/**
	 * @param propreteDegres
	 * 		le nouveau degre de proprete de l'enclos
	 */

	public void setPropreteDegres(String propreteDegres) {
		this.propreteDegres = propreteDegres;
	}
	
	
}
