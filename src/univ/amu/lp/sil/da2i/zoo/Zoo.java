package univ.amu.lp.sil.da2i.zoo;

import java.util.ArrayList;

public class Zoo <T extends Animal>{

	private String name;
	private Employe<T> employe;
	private int maxNbEnclos;
	private ArrayList<Enclos> listeEnclos;
	
	public Zoo(String name, Employe<T> employe, int maxNbEnclos, ArrayList<Enclos> tousEnclos) {
		super();
		this.name = name;
		this.employe = employe;
		this.maxNbEnclos = maxNbEnclos;
		this.listeEnclos = tousEnclos;
	}

	public void afficherNbAnimaux(){
		System.out.println("Voici combien il a d'animaux : ");
		int nbAnimaux = 0;
		for (Enclos<T> enclos : this.listeEnclos){
			nbAnimaux += enclos.getNbDAnimauxPresents();
		}
		System.out.println(nbAnimaux);
	}
	
	public void afficherAnimauxEnclos(){
		System.out.println("Voici tous les animaux de votre Zoo :");
		for (Enclos<T> enclos : this.listeEnclos){
			System.out.println(enclos.getAllAnimals());
		}
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employe<T> getEmploye() {
		return employe;
	}

	public void setEmploye(Employe<T> employe) {
		this.employe = employe;
	}

	public int getMaxNbEnclos() {
		return maxNbEnclos;
	}

	public void setMaxNbEnclos(int maxNbEnclos) {
		this.maxNbEnclos = maxNbEnclos;
	}

	public ArrayList<Enclos> getListeEnclos() {
		return listeEnclos;
	}

	public void setListeEnclos(ArrayList<Enclos> listeEnclos) {
		this.listeEnclos = listeEnclos;
	}
}
