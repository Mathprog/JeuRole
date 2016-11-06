package univ.lp.da2i.java.zooModel;

public interface IAnimalFemaleFactory {
	public AigleFemale getAigleFemale(AiglonFemale aiglonFEmale);
	public BaleineFemale getBaleineFemale(BaleineauFemale baleineauFemale);
	public LoupFemale getLoupFemale(LouveteauFemale louveteauFemale);
	public OursFemale getOursFemale(OursonFemale oursonFemale);
	public PoissonRougeFemale getPoissonRougeFemale(PetitPoissonRougeFemale pprf);
	public PingouinFemale getPingouinFemale(PingouinKinderFemale pkf);
	public RequinFemale getRequinFemale(RequinEnfantFemale requinEnfantFemale);
	public TigreFemale getTigreFemale(TigreauFemale tigreauFemale);
}
