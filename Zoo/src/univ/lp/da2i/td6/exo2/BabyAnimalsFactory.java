package univ.lp.da2i.td6.exo2;

public class BabyAnimalsFactory extends IBabyAnimalsFactory {

	@Override
	public Animal getBaby(Animal dad, Animal mother) {
		if(dad instanceof LoupMale && mother instanceof LoupFemale){
			return new LouveteauFemale(null, 0, 0, 0, false, false, false);
		} else if (dad instanceof TigreMale && mother instanceof TigreFemale){
			return new TigreauMale(null, 0, 0, 0, false, false, false);
		} else if (dad instanceof BaleineMale && mother instanceof BaleineFemale){
			return new BaleineauFemale(null, 0, 0, 0, false, false, false);
		} else if (dad instanceof OursMale && mother instanceof OursFemale){
			return new OursonFemale(null, 0, 0, 0, false, false, false);
		} else if (dad instanceof RequinMale && mother instanceof RequinFemale){
			return new RequinEnfantMale(null, 0, 0, 0, false, false, false);
		} else if(dad instanceof PingouinMale && mother instanceof PingouinFemale){
			return new PingouinKinderMale(null, 0, 0, 0, false, false, false);
		} else if (dad instanceof AigleMale && mother instanceof AigleFemale){
			return new AiglonFemale(null, 0, 0, 0, false, false, false);
		} else if (dad instanceof PoissonRougeMale && mother instanceof PoissonRougeFemale){
			return new PetitPoissonRougeFemale(null, 0, 0, 0, false, false, false);
		} else {
			return null;
		}
		
	}

}
