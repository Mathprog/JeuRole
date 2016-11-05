package univ.lp.da2i.java.zoo;

public interface IBabyMaleAnimalFactory {
	public LouveteauMale getBabyLoupMale(LoupMale dad, LoupFemale mother);
	public AiglonMale getBabuAiglonMale(AigleMale dad, AigleFemale mother);
	public BaleineauMale getBabyBaleineauMale(BaleineMale dad, BaleineFemale mother);
	public OursonFemale getBabyOursonMale(OursMale dad, BaleineFemale mother);
	public PetitPoissonRougeFemale getBabyPetitPoissonRougeFemale(PoissonRougeMale dad, PoissonRougeFemale mother);
	public PingouinKinderFemale getBabyPingouinKinderFemale(PingouinMale dad, PingouinFemale mother);
	public RequinEnfantFemale getBabyRequinEnfantFemale(RequinMale dad, RequinFemale mother);
	public TigreauMale getBabyTigreauMale(TigreMale dad, TigreFemale female);
}
