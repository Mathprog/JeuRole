package univ.lp.da2i.java.zooController;

import java.util.Scanner;

import univ.lp.da2i.java.zooModel.Animal;
import univ.lp.da2i.java.zooModel.Employe;
import univ.lp.da2i.java.zooModel.Enclos;
import univ.lp.da2i.java.zooModel.Ours;
import univ.lp.da2i.java.zooModel.OursFemale;
import univ.lp.da2i.java.zooModel.OursMale;
import univ.lp.da2i.java.zooModel.Zoo;

public class Jeu {
	
	public static String[] allSaisons = {"ETE", "HIVER", "PRINTEMPS", "AUTONME"};
	
	public String saison;
	public int jour;
	
	public static void main(String[] arvs){
		System.out.println("Bonjour et bienvenue dans notre jeu de ZOOCity. Vous allez pouvoir vous mettre dans la peau d'un gérant de Zoo Chelou.");
		System.out.println("C'est un jeu au tour par tour. Chaque tour représente un jour.");
		System.out.println("Vous disposez un ZOO avec Trois enclos : Un enclos standard, une voliere et un aquarium.");
		System.out.println("Ce Zoo est dans une ville, de 10 000 habitants pour le moment");
		System.out.println("Tous les jours, des visiteurs viennent visiter votre ZOO et cela vous rapport des sous.");
		System.out.println("Ces sous vont vous permettre de construire des enclos, de réparer des enclos, de soigner des animaux, de les nourrir...");
		System.out.println("Attention, les visiteurs sont trés attentifs à l'état des animaux, des enclos et ne viendront pas s'ils ne sont pas entretenus.");
		System.out.println("Cependant, ils sont sensibles à la propreté et aux allures des animaux qui y sont présents ... Vous comprendrez.");
		System.out.println("C'est parti. Donnez un nom à votre ZOO :");
		Scanner in = new Scanner(System.in);
		String zooName = in.nextLine();
		Zoo<Animal> zoo = new Zoo<Animal>(zooName, 10);
		System.out.println("Votre Zoo : " + zooName + " à été crée. Maintenant il faut lui attribuer un employé.");
		System.out.println("Nom de votre emplyé : ");
		String employeName = in.nextLine();
		System.out.println("Veuillez saisir le sexe de votre employé : ");
		System.out.println("1. Je sais pas");
		System.out.println("2. Homme");
		System.out.println("3. Femme");
		System.out.println("4. D, la réponse D");
		int sexeIndex = in.nextInt();
		String sexe = "";
		switch (sexeIndex){
		case 1:
			sexe = "Inconnu";
			break;
		case 2:
			sexe = "Homme";
			break;
		case 3:
			sexe = "Femme";
			break;
		case 4:
			sexe="D, la réponse D";
			break;
			default:
				sexe ="Tu te fou de moi ...";
				break;
		}
		System.out.println(sexe);
		System.out.println("Saisissez un âge, n'importe lequel :");
		int age = in.nextInt();
		System.out.println(age);
		Employe<Animal> employe = new Employe<Animal>(employeName, sexe, age);
		System.out.println("Votre eployé " + employe +" à été crée");
		zoo.setEmploye(employe);
		System.out.println("Nous allons maintenant générer votre environnement de départ. Veuillez patientez..");
		Enclos<Ours> enclosOurs = new Enclos<Ours>("Ours", 500.0, 12, 0, Enclos.PROPRETES[0]);
		OursMale grours = new OursMale("Grartin Grevot", 450.0, 2.10, 12, false, true, true);
		OursFemale groursone = new OursFemale ("Gartine Groche", 450.0, 2.10, 12, false, true, true);
		enclosOurs.addAnimal(groursone);
		enclosOurs.addAnimal(grours);
		zoo.addEnclos(enclosOurs);
	}
}
