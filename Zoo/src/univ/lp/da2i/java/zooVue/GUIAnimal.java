package univ.lp.da2i.java.zooVue;

import univ.lp.da2i.java.zooModel.Animal;

public class GUIAnimal {
	
	public static void afficheAnimalCaracs(Animal animal){
		System.out.println(animal);
	}
	
	public static void afficheNomAnimal(String nom){
		System.out.println("Nom de l'animal : " + nom);
	}
	
	public static void afficheTailleAnimal(double taille){
		System.out.println("Taille de l'animal : " + taille);
	}
	
	public static void affichePoidsAnimal(double poids){
		System.out.println("Poids de l'animal : " + poids);
	}

}
