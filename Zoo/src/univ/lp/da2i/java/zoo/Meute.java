package univ.lp.da2i.java.zoo;

import java.util.ArrayList;

public class Meute {
	
	private String nom;
	private LoupMaleAlpha loupMaleAlpha;
	private LoupFemaleAlpha loupFemaleALpha;
	
	private ArrayList<LoupBeta> loupsBeta;
	private ArrayList<LoupOmega> loupsOmega;
	
	public Meute (String nom){
		this.nom = nom;
		this.loupsBeta = new ArrayList<LoupBeta>();
		this.loupsOmega = new ArrayList<LoupOmega>();
	}
	
	public void addLoupBeta (LoupBeta newLoupBeta){
		this.loupsBeta.add(newLoupBeta);
	}
	
	public void deleteLoupBeta (LoupBeta loupBeta){
		this.loupsBeta.remove(loupBeta);
	}
	
	public void deleteLoupOmega(LoupOmega loupOmega){
		this.loupsOmega.remove(loupOmega);
	}
	
	public void addLoupOmega(LoupOmega newLoupOmega){
		this.loupsOmega.add(newLoupOmega);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public LoupMaleAlpha getLoupMaleAlpha() {
		return loupMaleAlpha;
	}

	public void setLoupMaleAlpha(LoupMaleAlpha loupMaleAlpha) {
		this.loupMaleAlpha = loupMaleAlpha;
	}

	public LoupFemaleAlpha getLoupFemaleALpha() {
		return loupFemaleALpha;
	}

	public void setLoupFemaleALpha(LoupFemaleAlpha loupFemaleALpha) {
		this.loupFemaleALpha = loupFemaleALpha;
	}

	public ArrayList<LoupBeta> getLoupsBeta() {
		return loupsBeta;
	}

	public void setLoupsBeta(ArrayList<LoupBeta> loupsBeta) {
		this.loupsBeta = loupsBeta;
	}

	public ArrayList<LoupOmega> getLoupsOmega() {
		return loupsOmega;
	}

	public void setLoupsOmega(ArrayList<LoupOmega> loupsOmega) {
		this.loupsOmega = loupsOmega;
	}
	

}
