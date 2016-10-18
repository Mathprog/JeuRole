package univ.amu.lp.sil.da2i.zoo;

public abstract class PoissonRouge extends AnimalMarin {

	public PoissonRouge(String name, double poids, double taille, int age, boolean isHungry,
			boolean isSleeping, boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void nager() {
		System.out.println("Je mange comme un poisson rouge");

	}

	@Override
	public void manger() {
		System.out.println("Je mange comme un poisson rouge");
	}

	@Override
	public void emettreUnSon() {
		System.out.println("J'émets le son d'un poisson ...");
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
