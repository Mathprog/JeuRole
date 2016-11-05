package univ.lp.da2i.java.zoo;

public abstract class Ovipare extends Animal {
	public Ovipare(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy, 10);
		// TODO Auto-generated constructor stub
	}

	public Ovipare(Ovipare ovipare) {
		super(ovipare);
	}
}
