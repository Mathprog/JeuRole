package univ.lp.da2i.java.zoo;

public class AigleAlbinos extends AigleDecorateur {
	
	private Aigle aigle;

	public AigleAlbinos(Aigle aigle) {
		super(aigle);
		this.aigle = aigle;
	}

	@Override
	public int getPoint() {
		return this.aigle.getPoint() + 10;
	}

}
