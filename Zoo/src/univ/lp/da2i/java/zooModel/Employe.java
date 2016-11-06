package univ.lp.da2i.java.zooModel;

public class Employe <T extends Animal>{
	private String nom;
	private String sexe;
	private int age;
	
	
	public Employe(String nom, String sexe, int age) {
		super();
		this.nom = nom;
		this.sexe = sexe;
		this.age = age;
	}

	public void examinerEnclo(Enclos<T> enclo){
		System.out.println("Examination de l'enco, celui-ci est: ");
		System.out.println(enclo.getPropreteDegres());
	}
	
	public void nettoyerEnclo(Enclos<? extends T> enclo){
		System.out.println("Je nettoye l'enclo.");
		enclo.setPropreteDegres("PROPRE");
	}
	
	public void nourrirAnimauxEnclo(Enclos<? extends T> enclo){
		for(T animal : enclo.getAllAnimals()){
			animal.setHungry(false);
			System.out.println("Je nourris: " + animal.getName());
		}
	}
	
	public void transfererAnimal(T animal, Enclos<T> encloDepart, Enclos<T> encloDestination){
		encloDepart.deleteAnimal(animal);
		encloDestination.addAnimal(animal);
		System.out.println("Transfert effectué !");
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
