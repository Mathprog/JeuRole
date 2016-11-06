package univ.lp.da2i.java.zooModel;

import java.util.ArrayList;
/**
 * La classe Joueur reprsente le joueur
 * 
 * @author Administrateur
 * 
 * @see Zoo
 *
 */
public class Joueur {
	/**
	 * le budjet disponible du joueur
	 */
	private int budget;
	/**
	 * le nom du joueur
	 */
	private String name;
	/**
	 * la liste des zoo poss�der par le joueur
	 */
	private ArrayList<Zoo> zoos;
	/**
	 * Constructeur de joueur
	 * 
	 * @param name	
	 * 		Le nom du joueur
	 */
	public Joueur (String name){
		this.name = name;
	}

}
