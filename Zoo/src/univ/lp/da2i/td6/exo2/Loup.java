package univ.lp.da2i.td6.exo2;

public abstract class Loup extends Predateurs {
	
	private int force;
	private int facteurDeDomination;
	private int rang;
	private int niveau;
	private int facteurImpetuosite;
	private Meute meute;

	public Loup(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

	public void vieillir(){
		
	}
	
	@Override
	public String toString() {
		return "Loup [force=" + force + ", facteurDeDomination=" + facteurDeDomination + ", rang=" + rang + ", niveau="
				+ niveau + ", facteurImpetuosite=" + facteurImpetuosite + ", meute=" + meute + "]";
	}


	@Override
	public void vagabonder() {
		System.out.println("Je vagabonde comme un loup");

	}

	@Override
	public void manger() {
		System.out.println("Je mange comme un loup");

	}

	@Override
	public void emettreUnSon() {
		System.out.println("J'emets un son comme un loup");

	}

	@Override
	public void etreSoigne() {
		System.out.println("Je soigne l'animal");
		this.setHealthy(true);
	}

	@Override
	public void changeEtat(boolean b) {
		System.out.println("Je change l'état de l'animal");
		this.setSleeping(b);
	}

}
