package univ.lp.da2i.java.zoo;

import java.util.ArrayList;

public class MainClass {
	public static void main(String[] arvs){
		Baleine baleine = new BaleineFemale("Bubulla", 12.0, 3, 4, false, false, true);
		Tigres tigre = new TigreFemale("Gragra", 0.5, 2, 2, false, false, true);
		Requin requin = new RequinMale("Requino", 0.6, 2, 2, false, false, true);
		PoissonRouge poissonRouge = new PoissonRougeMale("Zbloup",0.001, 0.3, 2, false, false, true);
		Pingouin pingouin = new PingouinMale("Saglice", 0.02, 0.7, 2, false, false, true);
		Ours ours = new OursMale ("GrouGrou", 1, 2, 5, false, false, true);
		Loup loup = new LoupFemale ("WaoufWaouf",  0.3, 1.3, 2, false, false, true);
		Aigle aigle = new AigleFemale("iaaou", 0.006, 0.8, 1, false, false, true);
		
		ArrayList<Animal> mammifereAnimaux = new ArrayList<Animal>();
		mammifereAnimaux.add(ours);
		mammifereAnimaux.add(tigre);
		mammifereAnimaux.add(loup);
		
		ArrayList<Animal> mammifereAnimaux2 = new ArrayList<Animal>();
		mammifereAnimaux2.add(ours);
		
		ArrayList<AnimalMarin> aquarium = new ArrayList<AnimalMarin>();
		aquarium.add(requin);
		aquarium.add(poissonRouge);
		aquarium.add(baleine);
		
		ArrayList<Oiseau> voiliereAnim = new ArrayList<Oiseau>();
		voiliereAnim.add(aigle);
		voiliereAnim.add(pingouin);
		
		BabyAnimalsFactory BAF = new BabyAnimalFactory();
		TigreauFemale bebetigre = 


		Aquarium<AnimalMarin> aquariumEnclo = new Aquarium<AnimalMarin>("Aquatique", 200, 10, 5, aquarium, Enclos.PROPRETES[0], 100, Aquarium.SALINITEVALUE[1]);
		Enclos<Animal> standar = new Enclos<Animal>("Terrestre", 150, 10, 5, mammifereAnimaux, Enclos.PROPRETES[0]);
		Enclos<Animal> standar2 = new Enclos<Animal>("Terrestre", 150, 10, 5, mammifereAnimaux2, Enclos.PROPRETES[0]);
		Voliere<Oiseau> voiliere = new Voliere<Oiseau>("Volant", 500, 10, 5, voiliereAnim, Enclos.PROPRETES[0], 70);
		
		ArrayList<Enclos> tousEnclos = new ArrayList<Enclos>();
		tousEnclos.add(aquariumEnclo);
		tousEnclos.add(standar);
		tousEnclos.add(voiliere);
				
		Employe<Animal> mathieu = new Employe<Animal>("Mathieu", "MALE", 22);
		mathieu.nettoyerEnclo(aquariumEnclo);
		mathieu.nourrirAnimauxEnclo(voiliere);
		//System.out.println("Il y a :" + standar.getAllAnimals().size() + "Animaux dans l'enclos 1");

		mathieu.transfererAnimal(loup, standar, standar2);
		//System.out.println("Il y a :" + standar2.getAllAnimals().size() + "Animaux dans l'enclos 2");
		//System.out.println("Il y a :" + standar.getAllAnimals().size() + "Animaux dans l'enclos 1");

		
		Zoo<Animal> monZoo = new Zoo<Animal>("LP DA2I ZOO", mathieu , 5, tousEnclos);
		monZoo.afficherAnimauxEnclos();
		
		System.out.println("Vous êtes : " + mathieu.getNom()+ " et vous avez : " + mathieu.getAge() + " ans");
		System.out.println("Vous avez la responsabilité du ZOO entre vos mains.");
		System.out.println("Chaque jour, mére nature va faire son oeuvre sur les animaux et les enclos.");
		System.out.println("A vous de faire en sorte, en un minimum de coup, de redresser la barre.");
		System.out.println("C'est parti !");
		System.out.println("MENU :");
	}
}
