package univ.lp.da2i.td6.exo2;

public abstract class Animal implements AnimalAction{
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(poids);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((sexe == null) ? 0 : sexe.hashCode());
		temp = Double.doubleToLongBits(taille);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(poids) != Double.doubleToLongBits(other.poids))
			return false;
		if (sexe == null) {
			if (other.sexe != null)
				return false;
		} else if (!sexe.equals(other.sexe))
			return false;
		if (Double.doubleToLongBits(taille) != Double.doubleToLongBits(other.taille))
			return false;
		return true;
	}
	
	protected String name;
	protected String sexe;
	protected double poids;
	protected double taille;
	protected int age;
	protected boolean isHungry;
	protected boolean isSleeping;
	protected boolean isHealthy;
	
	public Animal(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping, boolean isHealthy) {
		super();
		this.name = name;
		this.poids = poids;
		this.taille = taille;
		this.age = age;
		this.isHungry = isHungry;
		this.isSleeping = isSleeping;
		this.isHealthy = isHealthy;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}
	public double getTaille() {
		return taille;
	}
	public void setTaille(double taille) {
		this.taille = taille;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isHungry() {
		return isHungry;
	}
	public void setHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}
	public boolean isSleeping() {
		return isSleeping;
	}
	public void setSleeping(boolean isSleeping) {
		this.isSleeping = isSleeping;
	}
	public boolean isHealthy() {
		return isHealthy;
	}
	public void setHealthy(boolean isHealthy) {
		this.isHealthy = isHealthy;
	}
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", sexe=" + sexe + ", poids=" + poids + ", taille=" + taille + ", age=" + age
				+ ", isHungry=" + isHungry + ", isSleeping=" + isSleeping + ", isHealthy=" + isHealthy + "]";
	}

}
