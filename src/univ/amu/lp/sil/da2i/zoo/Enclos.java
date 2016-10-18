package univ.amu.lp.sil.da2i.zoo;

import java.util.ArrayList;

public class Enclos <T extends Animal> {
	
	public static final String[] PROPRETES= {"NICKEL", "PASSABLE", "SALE"};
	
	protected String nom;
	protected double superficie;
	protected int maxAnimaux;
	protected int nbDAnimauxPresents;
	protected ArrayList<T> allAnimals;
	protected String propreteDegres;
	
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

	@Override // A finir
	public String toString() {
		return "Enclos [nom=" + nom + ", superficie=" + superficie + ", maxAnimaux=" + maxAnimaux
				+ ", nbDAnimauxPresents=" + nbDAnimauxPresents + ", allAnimals=" + allAnimals + ", propreteDegres="
				+ propreteDegres + "]";
	}
	
	public void addAnimal(T newAnimal){
		this.allAnimals.add(newAnimal);
	}
	
	public void deleteAnimal(T animal){
		this.allAnimals.remove(animal);
	}
	
	public void nourrirAnimaux(){
		for(Animal animal : this.allAnimals){
			animal.setHungry(false);
		}
	}
	
	public void entretenir(){
		System.out.println("J'entretien l'enclo standard");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getMaxAnimaux() {
		return maxAnimaux;
	}

	public void setMaxAnimaux(int maxAnimaux) {
		this.maxAnimaux = maxAnimaux;
	}

	public int getNbDAnimauxPresents() {
		return nbDAnimauxPresents;
	}

	public void setNbDAnimauxPresents(int nbDAnimauxPresents) {
		this.nbDAnimauxPresents = nbDAnimauxPresents;
	}

	public ArrayList<T> getAllAnimals() {
		return allAnimals;
	}

	public void setAllAnimals(ArrayList<T> allAnimals) {
		this.allAnimals = allAnimals;
	}

	public String getPropreteDegres() {
		return propreteDegres;
	}

	public void setPropreteDegres(String propreteDegres) {
		this.propreteDegres = propreteDegres;
	}
	
	
}
