package univ.lp.da2i.java.zoo;

public class AigleManchot extends AigleDecorateur {

	public Aigle aigle;
	
	public AigleManchot(Aigle aigle) {
		super(aigle);
		this.aigle = aigle;
	}

	@Override
	public int getPoint() {
		return this.aigle.getPoint() + 10;
	}

}
