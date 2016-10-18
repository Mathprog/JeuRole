package univ.amu.lp.sil.da2i.zoo;

public abstract class Tigres extends Predateurs {

	public Tigres(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void vagabonder() {
		System.out.println("Je vagabonde tel un Tigre");

	}

	@Override
	public void manger() {
		System.out.println("Je manger comme un Tigre");

	}

	@Override
	public void emettreUnSon() {
		System.out.println("Je rugis");

	}

	@Override
	public void etreSoigne() {
		System.out.println("Je me soigne");
		this.isHealthy = true;

	}

	@Override
	public void changeEtat(boolean b) {
		System.out.println("Je change d'état");
		this.isSleeping = b;
	}

}
