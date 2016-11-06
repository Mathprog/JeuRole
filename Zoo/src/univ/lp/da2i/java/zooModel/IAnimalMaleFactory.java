package univ.lp.da2i.java.zooModel;

public interface IAnimalMaleFactory {
	public AigleMale getAigleMale(AiglonMale aiglonMale);
	public BaleineMale getBaleineMale(BaleineauMale baleineauMale);
	public LoupMale getLoupMale(LouveteauMale louveteauMale);
	public OursMale getOursMale(OursonMale oursonMale);
	public PoissonRougeMale getPoissonRougeMale(PetitPoissonRougeMale pprm);
	public PingouinMale getPingouinMale(PingouinKinderMale pingouinMale);
	public RequinMale getRequinMale(RequinEnfantMale requinEnfantMale);
	public TigreMale getTigreMale(TigreauMale tigreauMale);
}
