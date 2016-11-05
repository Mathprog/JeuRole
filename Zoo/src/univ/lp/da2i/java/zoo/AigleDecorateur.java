package univ.lp.da2i.java.zoo;

public abstract class AigleDecorateur extends Aigle {
	
	protected Aigle aigle;

	public AigleDecorateur(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping,
			boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
	}
	
	public AigleDecorateur(Aigle aigle){
		super(aigle);
		this.aigle = aigle;
	}
	
	public abstract int getPoint();
	
}
