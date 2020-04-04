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
 
 public void afficher() {
		System.out.println(getDescription() + affichePrix());
	}
 
 public String getDescription() {
		return voiture.getDescription() + description + "\n";
	}
 
 public String affichePrix() {
	 return "Coût total = "+getPrix()+" euros"+"\n";
 }
}
