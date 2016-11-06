package univ.lp.da2i.java.zooModel;

import java.util.ArrayList;

/**
 * La classe Zoo reprsente un zoo
 * 
 * @author Administrateur
 * 
 * @see Animal
 * @see Employe
 * @see Enclos
 * 
 */

public class Zoo <T extends Animal>{
	/**
	 * le nom du zoo
	 */
	private String name;
	/**
	 * l'employe du zoo
	 */
	private Employe<T> employe;
	/**
	 * le nombre max d'enclos du zoo
	 */
	private int maxNbEnclos;
	/**
	 * la liste des enclos du zoo
	 */
	private ArrayList<Enclos<T>> listeEnclos;
	/**
	 * le prix du zoo
	 */
	private double prix = 10000.0;
	/**
	 * Constructeur du zoo
	 * 
	 * @param name	
	 * 		Le nom du zoo
	 * @param employe
	 * 		l'employe du zoo
	 * @param maxnbEnclos
	 * 		le nombre maximum d'enclos du zoo
	 * @param tousEnclos
	 * 		la liste des enclos du zoo
	 *  
	 */
	
	public Zoo(String name, Employe<T> employe, int maxNbEnclos, ArrayList<Enclos<T>> tousEnclos) {
		super();
		this.name = name;
		this.employe = employe;
		this.maxNbEnclos = maxNbEnclos;
		this.listeEnclos = tousEnclos;
	}
	/**
	 * affiche tout les annimaux du zoo
	 */

	public void afficherNbAnimaux(){
		System.out.println("Voici combien il a d'animaux : ");
		int nbAnimaux = 0;
		for (Enclos<T> enclos : this.listeEnclos){
			nbAnimaux += enclos.getNbDAnimauxPresents();
		}
		System.out.println(nbAnimaux);
	}
	/**
	 * affiche tout les annimaux de l'enclos
	 */
	public void afficherAnimauxEnclos(){
		System.out.println("Voici tous les animaux de votre Zoo :");
		for (Enclos<T> enclos : this.listeEnclos){
			System.out.println(enclos.getAllAnimals());
		}
	}
	/**
	 * @param newEnclos
	 * 		l'enclos a ajouter au zoo, si il reste de la place
	 */
	public void addEnclos(Enclos<T> newEnclo){
		if(this.maxNbEnclos < this.listeEnclos.size()){
			this.listeEnclos.add(newEnclo);
		} else {
			System.out.println("Vous avez trop d'enclos. Il faut créer un nouveau ZOO.");
		}
	}
	
	/**
	 *  retourne le nom du zoo
	 *  @return le nom du zoo, sous la forme d'une chaine de caracteres
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name
	 * 		le nouveau nom du zoo
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * retourne l'employe du zoo 
	 *  @return l'employe, sous la forme d'un objrect employe
	 */
	public Employe<T> getEmploye() {
		return employe;
	}
	/**
	 * @param employe
	 * 		le nouveau employe du zoo
	 */
	public void setEmploye(Employe<T> employe) {
		this.employe = employe;
	}
	/**
	 *  retourne le nombre maximum d'enclos du zoo
	 *  @return le nombre maximum d'enclos du zoo, sous la forme d'un entier postif
	 */

	public int getMaxNbEnclos() {
		return maxNbEnclos;
	}
	/**
	 * @param mawnbEnclos
	 * 		le nouveau nombre maximum d'enclos du zoo du zoo
	 */
	public void setMaxNbEnclos(int maxNbEnclos) {
		this.maxNbEnclos = maxNbEnclos;
	}
	/**
	 *  retourne la liste des enclos du zoo
	 *  @return la liste des enclos du zoo, sous la forme d'une liste
	 */

	public ArrayList<Enclos<T>> getListeEnclos() {
		return listeEnclos;
	}
	/**
	 * @param listeEnclos
	 * 		la nouvelle liste d'enclos du zoo
	 */
	public void setListeEnclos(ArrayList<Enclos<T>> listeEnclos) {
		this.listeEnclos = listeEnclos;
	}
}
