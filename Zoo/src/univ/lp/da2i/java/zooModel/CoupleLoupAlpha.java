package univ.lp.da2i.java.zooModel;

public class CoupleLoupAlpha {

	private LoupMaleAlpha loupMaleAlpha;
	private LoupFemaleAlpha loupFemaleAlpha;

	public CoupleLoupAlpha(LoupMaleAlpha loupMaleAlpha, LoupFemaleAlpha loupFemaleAlpha) {
		super();
		this.loupMaleAlpha = loupMaleAlpha;
		this.loupFemaleAlpha = loupFemaleAlpha;
	}

	public LoupMaleAlpha getLoupMaleAlpha() {
		return loupMaleAlpha;
	}

	public void setLoupMaleAlpha(LoupMaleAlpha loupMaleAlpha) {
		this.loupMaleAlpha = loupMaleAlpha;
	}

	public LoupFemaleAlpha getLoupFemaleAlpha() {
		return loupFemaleAlpha;
	}

	public void setLoupFemaleAlpha(LoupFemaleAlpha loupFemaleAlpha) {
		this.loupFemaleAlpha = loupFemaleAlpha;
	}

}
