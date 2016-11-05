package univ.lp.da2i.java.zoo;

/**
 * La classe Animal reprsente un animal
 * 
 * @author Administrateur
 * 
 * @see AnimalAction
 *
 */

public abstract class Animal implements AnimalAction{
	
	/**
	 * A FAIRE
	 */
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
	
	/**
	 * le nom de l'animal
	 */
	protected String name;
	/*
	 * son sexe
	 */
	protected String sexe;
	/**
	 * son poids
	 */
	protected double poids;
	/**
	 * sa taille
	 */
	protected double taille;
	/**
	 * son age
	 */
	protected int age;
	/**
	 * son indicateur de faim
	 */
	protected boolean isHungry;
	/**
	 * son indicateur de sommeil (si il dort)
	 */
	protected boolean isSleeping;
	/**
	 * son idicateur de soin (si il est en train d'etre soigne ou non)
	 */
	protected boolean isHealthy;
	/**
	 * valeur en point de l'animal
	 */
	private int point;
	
	/**
	 * Constructeur de Animal
	 * 
	 * @param name	
	 * 		Le nom de l'animal
	 * @param poids
	 * 		son poids
	 * @param taille
	 * 		sa taille
	 * @param age
	 * 		son l'age	
	 * @param isHungry
	 * 		son indicateur de faim	
	 * @param isSleeping
	 * 		son indicateur de sommeil (si il dort)
	 * @param isHealty
	 * 		son idicateur de soin (si il est en train d'etre soigne ou non)
	 * @param point
	 * 		sa valeur en point
	 * 
	 */
	public Animal(String name, double poids, double taille, int age, boolean isHungry, boolean isSleeping, boolean isHealthy, int point) {
		super();
		this.name = name;
		this.poids = poids;
		this.taille = taille;
		this.age = age;
		this.isHungry = isHungry;
		this.isSleeping = isSleeping;
		this.isHealthy = isHealthy;
		this.point = point;
	}
	
	/**
	 * retourne la valeur en point de l'animal
	 * @return la valeur en point, sous la forme d'un entier positif
	 */
	public int getPoint() {
		return point;
	}
	/**
	 * @param point
	 * 		la nouvelle valeur en point de l'animal
	 */
	public void setPoint(int point) {
		this.point = point;
	}
	
	/**
	 * constructeur par recopie
	 */
	public Animal(Animal animal){
		this.name = animal.getName();
		this.poids = animal.getPoids();
		this.taille = animal.getTaille();
		this.age = animal.getAge();
		this.isHungry = animal.isHungry();
		this.isSleeping = animal.isSleeping();
		this.isHealthy = animal.isHealthy();
		this.point = animal.getPoint();
	}
	/**
	 * retourne le nom de l'animal
	 * @return le nom de l'animal, sous la forme d'une chaine de caracteres
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name
	 * 		le nouveau nom de l'animal
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * retourne le sexe de l'animal
	 * @return le sexe de l'animal, sous la forme d'une chaine de caracteres
	 */
	public String getSexe() {
		return sexe;
	}
	/**
	 * @param sexe
	 * 		le nouveau sexe de l'animal
	 */
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	/**
	 * retourne le poids de l'animal
	 * @return le poids de l'animal, sous la forme d'un entier decimal
	 */
	public double getPoids() {
		return poids;
	}
	/**
	 * @param poids
	 * 		le nouveau nom de l'animal
	 */
	public void setPoids(double poids) {
		this.poids = poids;
	}
	/**
	 * retourne la taille de l'animal
	 * @return la taille de l'animal,  sous la forme d'un entier decimal
	 */
	public double getTaille() {
		return taille;
	}
	/**
	 * @param taille
	 * 		la nouvelle taille de l'animal
	 */
	public void setTaille(double taille) {
		this.taille = taille;
	}
	/**
	 * retourne l'age de l'animal
	 * @return l'age de l'animal, sous la forme d'un entier positif
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age
	 * 		le nouvel age de l'animal
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * retourne l'indicateur de faim de l'animal
	 * @return l'indicateur de faim de l'animal, sous la forme d'un booleen
	 */
	public boolean isHungry() {
		return isHungry;
	}
	/**
	 * @param isHungry
	 * 		le nouvel etat de faim de l'animal
	 */
	public void setHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}
	/**
	 * retourne l'indicateur de sommeil de l'animal
	 * @return l'indicateur de sommeil de l'animal, sous la forme d'un booleen
	 */
	public boolean isSleeping() {
		return isSleeping;
	}
	/**
	 * @param isSleeping
	 * 		le nouvel etat de sommeil de l'animal
	 */
	public void setSleeping(boolean isSleeping) {
		this.isSleeping = isSleeping;
	}
	/**
	 * retourne l'indicateur de soin de l'animal
	 * @return l'indicateur de soin de l'animal, sous la forme d'un booleen
	 */
	public boolean isHealthy() {
		return isHealthy;
	}
	/**
	 * @param isHealthy
	 * 		le nouvel etat de soin de l'animal
	 */
	public void setHealthy(boolean isHealthy) {
		this.isHealthy = isHealthy;
	}
	
	/**
	 * retourne les informations l'animal
	 * @return les informations l'animal, sous la forme d'une chaine de caracteres
	 */
	@Override
	public String toString() {
		return "Animal [name=" + name + ", sexe=" + sexe + ", poids=" + poids + ", taille=" + taille + ", age=" + age
				+ ", isHungry=" + isHungry + ", isSleeping=" + isSleeping + ", isHealthy=" + isHealthy + "]";
	}

}
