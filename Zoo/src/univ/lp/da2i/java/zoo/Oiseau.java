package univ.lp.da2i.java.zoo;

public abstract class Oiseau extends Ovipare implements OiseauAction{

	public Oiseau(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

	public Oiseau(Oiseau oiseau) {
		super(oiseau);
	}

}
