package univ.lp.da2i.java.zoo;

public abstract class Aigle extends Oiseau {

	public Aigle(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

	public Aigle(Aigle aigle) {
		super(aigle);
	}

	@Override
	public void voler() {
		System.out.println("Je vole comme un aigle !");
	}

	@Override
	public void manger() {
		System.out.println("Je mange comme un aigle");

	}

	@Override
	public void emettreUnSon() {
		System.out.println("J'émet un son comme un aigle");

	}

	@Override
	public void etreSoigne() {
		System.out.println("Je me soigne");
		this.setHealthy(true);
	}

	@Override
	public void changeEtat(boolean b) {
		System.out.println("Je change d'état");
		this.setSleeping(b);
	}

}
