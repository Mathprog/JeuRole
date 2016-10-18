package univ.amu.lp.sil.da2i.zoo;

public abstract class Ours extends Mammifere {

	public Ours(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void manger() {
		System.out.println("Je mange comme un Ours");
	}

	@Override
	public void emettreUnSon() {
		System.out.println("Je rugis comme un Ours");
	}

	@Override
	public void etreSoigne() {
		this.setHealthy(true);
	}

	@Override
	public void changeEtat(boolean b) {
		this.setSleeping(b);
	}

}
