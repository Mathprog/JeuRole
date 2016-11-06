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
	
	public static void afficheAgeAnimal(int age){
		System.out.println("Votre animal à : " + age + " jours.");
	}

	public static void afficheSexeAnimal(String animal){
		System.out.println("Votre animal est : " + animal);
	}
	
	public static void afficheIndicateurDeFaim(boolean isHungry){
		if(isHungry){
			System.out.println("Votre animal a faim");
		} else {
			System.out.println("Votre animal n'a pas faim");
		}
	}
	
	public static void afficheIndicateurEtat(boolean isSleeping){
		if(isSleeping){
			System.out.println("votre animal dort");
		} else {
			System.out.println("Votre animal ne dort pas");
		}
	}
	
	public static void afficheIndicateurSante(boolean isHealthy){
		if(isHealthy){
			System.out.println("Votre animal est en bonne santé");
		} else {
			System.out.println("Votre animal n'est pas en bonne santé");
		}
	}
	
	public static void affichePointAnimal(int point){
		System.out.println("Les points que vous rapportent l'animal : " + point);
	}
}
