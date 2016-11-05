package univ.lp.da2i.java.zoo;

import java.util.ArrayList;

public class Voliere <T extends Oiseau> extends Enclos<T>{
	
	
	protected int hauteur;
	private double prix = 1100.0;
	
	public Voliere(String nom, double superficie, int maxAnimaux, int nbDAnimauxPresents, ArrayList<T> allAnimals,
			String propreteDegres, int hauteur) {
		super(nom, superficie, maxAnimaux, nbDAnimauxPresents, allAnimals, propreteDegres);
		this.hauteur = hauteur;
		}
	
	public void entretienVoliere(){
		this.entretenir();
		System.out.println("Vérification du toit de la cage");
	}

	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

}
