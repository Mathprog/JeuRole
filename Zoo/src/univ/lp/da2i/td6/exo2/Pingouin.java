package univ.lp.da2i.td6.exo2;

public abstract class Pingouin extends Oiseau implements AnimalMarinAction{

	public Pingouin(String name, double poids, double taille, int age, boolean isHungry,
			boolean isSleeping, boolean isHealthy) {
		super(name, poids, taille, age, isHungry, isSleeping, isHealthy);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void voler() {
		System.out.println("Je vole comme un pinguin");
	}

	@Override
	public void manger() {
		System.out.println("Je mange comme un pingouin");

	}

	@Override
	public void emettreUnSon() {
		System.out.println("J'émets un son comme un pingouin");
	}

	@Override
	public void etreSoigne() {
		System.out.println("Je me fais soigner");
		this.setHealthy(true);

	}

	@Override
	public void changeEtat(boolean b) {
		System.out.println("Je change l'état du pingouin");
		this.setSleeping(b);

	}

	@Override
	public void nager() {
		System.out.println("Je nage comme un pingouin");		
	}

}
