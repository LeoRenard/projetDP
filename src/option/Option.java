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
	System.out.println(prix);
 }
 
 public void afficher() {
		System.out.println(getDescription());
	}
 
 public String getDescription() {
		return voiture.toString();
	}
}
