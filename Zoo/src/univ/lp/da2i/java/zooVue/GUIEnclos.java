package univ.lp.da2i.java.zooVue;

import univ.lp.da2i.java.zooModel.Animal;
import univ.lp.da2i.java.zooModel.Enclos;

public class GUIEnclos<T extends Animal> {

	public void afficherEnclos(Enclos<T> enclo){
		System.out.println(enclo);
	}
	
}
