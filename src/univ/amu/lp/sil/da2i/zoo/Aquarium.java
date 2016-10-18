package univ.amu.lp.sil.da2i.zoo;

import java.util.ArrayList;

public class Aquarium <T extends AnimalMarin> extends Enclos<T>{
	
	public static final String[] SALINITEVALUE = {"ELEVE", "NORMALE", "BASSE"};
	
	protected double profondeur;
	protected String salinite;
	
	
	public Aquarium(String nom, double superficie, int maxAnimaux, int nbDAnimauxPresents, ArrayList<T> allAnimals,
			String propreteDegres, double profondeur, String salinite) {
		super(nom, superficie, maxAnimaux, nbDAnimauxPresents, allAnimals, propreteDegres);
		this.profondeur = profondeur;
		this.salinite = salinite;
		}

	public void entretenir(){
		System.out.println("Entretien de l'Aquarium");
	}

	public double getProfondeur() {
		return profondeur;
	}

	public void setProfondeur(double profondeur) {
		this.profondeur = profondeur;
	}

	public String getSalinite() {
		return salinite;
	}

	public void setSalinite(String salinite) {
		this.salinite = salinite;
	}

}
