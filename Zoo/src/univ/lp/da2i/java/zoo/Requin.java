package univ.lp.da2i.java.zoo;

public abstract class Requin extends AnimalMarin {

	public Requin(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void nager() {
		System.out.println("Je nage !");
	}

	@Override
	public void manger() {
		System.out.println("Je mange comme un requin");

	}

	@Override
	public void emettreUnSon() {
		System.out.println("J'emmets un son comme un requin");

	}

	@Override
	public void etreSoigne() {
		System.out.println("Je me soigne");
		this.setHealthy(true);
	}

	@Override
	public void changeEtat(boolean b) {
		System.out.println("Je change d'etat");
		this.setSleeping(b);
	}

}
