package option;

import voiture.Voiture;

/**
 * Class Option
 */
public abstract class Option extends Voiture {


	Voiture voiture;
	String description;
	float prix; 


 public void setDescription(String s) {
	 this.description = s;
 }
  
 public void addPrix(float cout) {
	prix = prix + cout;
 }
 
 public void afficher() {
		System.out.println(getDescription());
	}
 
 public String getDescription() {
		return this.toString() + description;
	}
 
 public String toString() {
		String o = "";
		int i = 1;
		return voiture.getNom()+", type : "+voiture.getCarburant().toString()+"\n"+o+"Coût total = "+prix+" euros"+"\n";
	}
}
