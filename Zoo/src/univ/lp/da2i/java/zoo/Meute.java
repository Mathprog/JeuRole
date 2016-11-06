package univ.lp.da2i.java.zoo;

import java.util.ArrayList;
/**
 * La classe Meute reprsente une meute de loup
 * 
 * @author Administrateur
 * 
 * @see LoupMaleAlpha
 * @see LoupFemaleAlpha
 * @see LoupBeta
 * @see LoupOmega
 *
 */
public class Meute {
	/**
	 * nom de la meute
	 */
	private String nom;
	/**
	 * le loup male apha de la meute
	 */
	private LoupMaleAlpha loupMaleAlpha;
	/**
	 * la louve alpha de la meute
	 */
	private LoupFemaleAlpha loupFemaleALpha;
	/**
	 * la liste des loups beta de la meute
	 */
	private ArrayList<LoupBeta> loupsBeta;
	/**
	 * la liste des loups omega de la meute
	 */
	private ArrayList<LoupOmega> loupsOmega;
	
	/**
	 * Constructeur de Meute
	 * 
	 * @param nom	
	 * 		Le nom de la meute
	 * 
	 */
	public Meute (String nom){
		this.nom = nom;
		this.loupsBeta = new ArrayList<LoupBeta>();
		this.loupsOmega = new ArrayList<LoupOmega>();
	}
	
	/**
	 * @param newLoupBeta
	 * 		le loup beta que l'on ajoute a la meute
	 */
	public void addLoupBeta (LoupBeta newLoupBeta){
		this.loupsBeta.add(newLoupBeta);
	}
	/**
	 * @param loupBeta
	 * 		le loup beta que l'on supprime de la meute
	 */
	public void deleteLoupBeta (LoupBeta loupBeta){
		this.loupsBeta.remove(loupBeta);
	}
	/**
	 * @param loupOmega
	 * 		le loup Omega que l'on supprime de la meute
	 */
	public void deleteLoupOmega(LoupOmega loupOmega){
		this.loupsOmega.remove(loupOmega);
	}
	/**
	 * @param newLoupOmega
	 * 		le loup Omega que l'on ajoute a la meute
	 */
	public void addLoupOmega(LoupOmega newLoupOmega){
		this.loupsOmega.add(newLoupOmega);
	}
	/**
	 * retourne le nom de la meute
	 * @return le nom de l'animal, sous la forme d'une chaine de caracteres
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom
	 * 		le nouveau nom de la meute
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * retourne le loup male alpha de la meute
	 * @return le loup male alpha, sous la forme d'une object LoupMaleAlpha
	 */
	public LoupMaleAlpha getLoupMaleAlpha() {
		return loupMaleAlpha;
	}
	/**
	 * @param loupMaleAlpha
	 * 		le nouveau loup male alpha de la meute
	 */
	public void setLoupMaleAlpha(LoupMaleAlpha loupMaleAlpha) {
		this.loupMaleAlpha = loupMaleAlpha;
	}
	/**
	 * retourne la louve alpha de la meute
	 * @return la louve alpha, sous la forme d'une object LoupFemaleAlpha
	 */
	public LoupFemaleAlpha getLoupFemaleALpha() {
		return loupFemaleALpha;
	}
	
	/**
	 * @param loupFemaleALpha
	 * 		le nouveau loup femmelle alpha de la meute
	 */
	public void setLoupFemaleALpha(LoupFemaleAlpha loupFemaleALpha) {
		this.loupFemaleALpha = loupFemaleALpha;
	}
	/**
	 * retourne la liste des loups beta de la meute
	 * @return  la liste des loups beta de la meute, sous la forme d'une liste de LoupBeta
	 */
	public ArrayList<LoupBeta> getLoupsBeta() {
		return loupsBeta;
	}
	/**
	 * @param loupsBeta
	 * 		la nouvelle liste de loups beta de la meute
	 */
	public void setLoupsBeta(ArrayList<LoupBeta> loupsBeta) {
		this.loupsBeta = loupsBeta;
	}
	
	/**
	 * retourne la liste des loups omega de la meute
	 * @return  la liste des loups omega de la meute, sous la forme d'une liste de LoupOmega
	 */
	public ArrayList<LoupOmega> getLoupsOmega() {
		return loupsOmega;
	}
	/**
	 * @param loupsOmega
	 * 		la nouvelle liste de loups Omega de la meute
	 */
	public void setLoupsOmega(ArrayList<LoupOmega> loupsOmega) {
		this.loupsOmega = loupsOmega;
	}
	

}
