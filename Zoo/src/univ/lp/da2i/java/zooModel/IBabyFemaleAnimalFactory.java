package univ.lp.da2i.java.zooModel;

public interface IBabyFemaleAnimalFactory {
	public LouveteauFemale getBabyLoupFemale(LoupMale dad, LoupFemale mother);
	public AiglonFemale getBabyAiglonFemale(AigleMale dad, AigleFemale mother);
	public BaleineauFemale getBabyBaleineauFemale(BaleineMale dad, BaleineFemale mother);
	public OursonFemale getBabyOursonFemale(OursMale dad, OursFemale mother);
	public PetitPoissonRougeMale getBabyPetitPoissonRougeMale(PoissonRougeMale dad, PoissonRougeFemale mother);
	public PingouinKinderMale getBabyPingouinKinderMale(PingouinMale dad, PingouinFemale mother);
	public RequinEnfantMale getBabyRequiEnfantMale(RequinMale dad, RequinFemale mother);
	public TigreauFemale getBabyTigreauFemale(TigreMale dad, TigreFemale mother);
}
