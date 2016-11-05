package univ.lp.da2i.java.zoo;

/**
 * la classe AigleManchot represente un type d'aigle manchot
 * 
 * @author Administrateur
 *
 * @see AigleDecorateur
 * @see Aigle
 *  
 */

public class AigleManchot extends AigleDecorateur {

	/**
	 * L'object aigle que l'on va decorer
	 * 
	 * @see Aigle
	 */
	public Aigle aigle;
	
	/**
	 * Constructeur par recopie
	 * On utilise le constructeur de la classe mere AigleDecorateur
	 * 
	 * @param aigle 
	 * 		L'object aigle que l'on va decorer
	 * 
	 */
	
	public AigleManchot(Aigle aigle) {
		super(aigle);
		this.aigle = aigle;
	}
	
	/**
	 * on augmente la valeur en point de l'aigle manchot
	 */
	@Override
	public int getPoint() {
		return this.aigle.getPoint() + 10;
	}

}
