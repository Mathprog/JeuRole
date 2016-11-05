package univ.lp.da2i.java.zoo;

public abstract class Baleine extends AnimalMarin implements MammifereAction{

	public Baleine(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manger() {
		System.out.println("Je mange comme une baleine");

	}

	@Override
	public void emettreUnSon() {
		System.out.println("J'emets un son comme une baleine");

	}

	@Override
	public void etreSoigne() {
		System.out.println("Je me soigne / fais soigner");
		this.setHealthy(true);
	}

	@Override
	public void changeEtat(boolean b) {
		System.out.println("Je change d'état");
		this.setSleeping(b);

	}

	@Override
	public void nager() {
		System.out.println("Je nage comme une baleine");
		
	}

}
