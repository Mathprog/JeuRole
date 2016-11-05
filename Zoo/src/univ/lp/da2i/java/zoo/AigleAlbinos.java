package univ.lp.da2i.java.zoo;


/**
 * la classe AigleAlbinos represente un type d'aigle decore
 * 
 * @author Administrateur
 *
 * @see AigleDecorateur
 * @see Aigle
 *  
 */
public class AigleAlbinos extends AigleDecorateur {
	
	/**
	 * L'object aigle que l'on va decorer
	 * 
	 * @see Aigle
	 */
	private Aigle aigle;
	
	/**
	 * Constructeur par recopie
	 * On utilise le constructeur de la classe mere AigleDecorateur
	 * 
	 * @param aigle 
	 * 		L'object aigle que l'on va decorer
	 */
	public AigleAlbinos(Aigle aigle) {
		super(aigle);
		this.aigle = aigle;
	}
	
	/**
	 * on augmente la valeur en point de l'aigle albinos
	 */
	@Override
	public int getPoint() {
		return this.aigle.getPoint() + 10;
	}

}
