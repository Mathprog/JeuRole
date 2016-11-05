package univ.lp.da2i.java.zoo;

import java.util.Scanner;

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
	}
}
